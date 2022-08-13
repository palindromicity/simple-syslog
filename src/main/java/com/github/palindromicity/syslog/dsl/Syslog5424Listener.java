/*
 * Copyright 2018-2022 simple-syslog authors
 * All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.palindromicity.syslog.dsl;

import com.github.palindromicity.syslog.KeyProvider;
import com.github.palindromicity.syslog.NilPolicy;
import com.github.palindromicity.syslog.SyslogMessageConsumer;
import com.github.palindromicity.syslog.dsl.generated.Rfc5424BaseListener;
import com.github.palindromicity.syslog.dsl.generated.Rfc5424Listener;
import com.github.palindromicity.syslog.dsl.generated.Rfc5424Parser;
import com.github.palindromicity.syslog.util.Validate;
import java.util.HashMap;
import java.util.Map;

/**
 * Simple implementation of {@link Rfc5424Listener}.
 * {@code Syslog5424Listener} populates a {@code Map} with the values parsed from a valid RFC 5424
 * syslog line.
 * Nil ('-') values are handled according the {@link NilPolicy}.
 * The {@code Syslog5424Listener} uses the provided {@link KeyProvider} when inserting items into
 * the map.
 */
public class Syslog5424Listener extends Rfc5424BaseListener {

  /**
   * {@link SyslogMessageConsumer} for storing results.
   */
  SyslogMessageConsumer syslogBuilder;

  /**
   * Create a new {@code Syslog5424Listener}.
   *
   * @param syslogBuilder {@link SyslogMessageConsumer} used gather data
   */
  public Syslog5424Listener(SyslogMessageConsumer syslogBuilder) {
    this.syslogBuilder = syslogBuilder;
  }

  @Override
  public void exitHeaderPriorityValue(Rfc5424Parser.HeaderPriorityValueContext ctx) {
    String priority = ctx.getText();
    syslogBuilder.consumeValue(SyslogFieldKeys.HEADER_PRI, priority);

    int pri = Integer.parseInt(priority);
    int sev = pri % 8;
    int facility = pri / 8;
    syslogBuilder.consumeValue(SyslogFieldKeys.HEADER_PRI_SEVERITY, String.valueOf(sev));
    syslogBuilder.consumeValue(SyslogFieldKeys.HEADER_PRI_FACILITY, String.valueOf(facility));
  }

  @Override
  public void exitHeaderVersion(Rfc5424Parser.HeaderVersionContext ctx) {
    syslogBuilder.consumeValue(SyslogFieldKeys.HEADER_VERSION, ctx.getText());
  }

  @Override
  public void exitHeaderHostName(Rfc5424Parser.HeaderHostNameContext ctx) {
    syslogBuilder.consumeValue(SyslogFieldKeys.HEADER_HOSTNAME, ctx.getText());
  }

  @Override
  public void exitHeaderNilHostName(Rfc5424Parser.HeaderNilHostNameContext ctx) {
    syslogBuilder.handleNil(SyslogFieldKeys.HEADER_HOSTNAME);
  }

  @Override
  public void exitHeaderAppName(Rfc5424Parser.HeaderAppNameContext ctx) {
    syslogBuilder.consumeValue(SyslogFieldKeys.HEADER_APPNAME, ctx.getText());
  }

  @Override
  public void exitHeaderNilAppName(Rfc5424Parser.HeaderNilAppNameContext ctx) {
    syslogBuilder.handleNil(SyslogFieldKeys.HEADER_APPNAME);
  }

  @Override
  public void exitHeaderProcId(Rfc5424Parser.HeaderProcIdContext ctx) {
    syslogBuilder.consumeValue(SyslogFieldKeys.HEADER_PROCID, ctx.getText());
  }

  @Override
  public void exitHeaderNilProcId(Rfc5424Parser.HeaderNilProcIdContext ctx) {
    syslogBuilder.handleNil(SyslogFieldKeys.HEADER_PROCID);
  }

  @Override
  public void exitHeaderMsgId(Rfc5424Parser.HeaderMsgIdContext ctx) {
    syslogBuilder.consumeValue(SyslogFieldKeys.HEADER_MSGID, ctx.getText());
  }

  @Override
  public void exitHeaderNilMsgId(Rfc5424Parser.HeaderNilMsgIdContext ctx) {
    syslogBuilder.handleNil(SyslogFieldKeys.HEADER_MSGID);
  }

  @Override
  public void exitHeaderTimeStamp(Rfc5424Parser.HeaderTimeStampContext ctx) {
    syslogBuilder.consumeValue(SyslogFieldKeys.HEADER_TIMESTAMP,
        ctx.full_date().getText() + "T" + ctx.full_time().getText());
  }

  @Override
  public void exitHeaderNilTimestamp(Rfc5424Parser.HeaderNilTimestampContext ctx) {
    syslogBuilder.handleNil(SyslogFieldKeys.HEADER_TIMESTAMP);
  }

  @SuppressWarnings("unchecked")
  @Override
  public void exitSdElement(Rfc5424Parser.SdElementContext ctx) {
    String id = ctx.sd_id().getText();
    Map<String, String> paramMap = new HashMap<>();
    for (Rfc5424Parser.Sd_paramContext paramContext : ctx.sd_param()) {
      paramMap.put(((Rfc5424Parser.SdParamContext) paramContext).param_name().getText(),
          ((Rfc5424Parser.SdParamContext) paramContext).param_value().getText());
    }
    syslogBuilder.consumeStructured(id, paramMap);
  }

  @Override
  public void exitMsg_utf8(Rfc5424Parser.Msg_utf8Context ctx) {
    final String msg = ctx.getText();
    if (msg != null && !msg.isEmpty()) {
      syslogBuilder.consumeValue(SyslogFieldKeys.MESSAGE, msg.trim());
    }
  }
}
