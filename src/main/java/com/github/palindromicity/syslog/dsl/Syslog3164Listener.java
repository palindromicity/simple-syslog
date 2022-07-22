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
import com.github.palindromicity.syslog.SyslogMessageConsumer;
import com.github.palindromicity.syslog.dsl.generated.Rfc3164BaseListener;
import com.github.palindromicity.syslog.dsl.generated.Rfc3164Parser;

/**
 * Simple implementation of {@link Rfc3164BaseListener}.
 * <p>
 * The {@code Syslog5424Listener} uses the provided {@link KeyProvider} when inserting items into
 * the map.
 * </p>
 */
public class Syslog3164Listener extends Rfc3164BaseListener {

  /**
   * {@link SyslogMessageConsumer} for storing results.
   */
  SyslogMessageConsumer syslogBuilder;


  /**
   * Create a new {@code Syslog5424Listener}.
   *
   * @param syslogBuilder {@link SyslogMessageConsumer} for parsing
   */
  public Syslog3164Listener(SyslogMessageConsumer syslogBuilder) {
    this.syslogBuilder = syslogBuilder;
  }


  @Override
  public void exitHeaderPriorityValue(Rfc3164Parser.HeaderPriorityValueContext ctx) {
    String priority = ctx.getText();
    syslogBuilder.consumeValue(SyslogFieldKeys.HEADER_PRI, priority);
    int pri = Integer.parseInt(priority);
    int sev = pri % 8;
    int facility = pri / 8;
    syslogBuilder.consumeValue(SyslogFieldKeys.HEADER_PRI_SEVERITY, String.valueOf(sev));
    syslogBuilder.consumeValue(SyslogFieldKeys.HEADER_PRI_FACILITY, String.valueOf(facility));
  }

  @Override
  public void exitHeaderHostName(Rfc3164Parser.HeaderHostNameContext ctx) {
    syslogBuilder.consumeValue(SyslogFieldKeys.HEADER_HOSTNAME, ctx.getText());
  }

  @Override
  public void exitHeaderTimeStamp(Rfc3164Parser.HeaderTimeStampContext ctx) {
    syslogBuilder.consumeValue(SyslogFieldKeys.HEADER_TIMESTAMP,
        ctx.full_date().getText() + "T" + ctx.full_time().getText());
  }

  @Override
  public void exitHeaderTimeStamp3164(Rfc3164Parser.HeaderTimeStamp3164Context ctx) {
    syslogBuilder.consumeValue(SyslogFieldKeys.HEADER_TIMESTAMP, String
        .format("%s%s %s", ctx.date_month_short().getText(), ctx.date_day_short().getText(),
            ctx.partial_time().getText()));
  }

  @Override
  public void exitMsg_any(Rfc3164Parser.Msg_anyContext ctx) {
    syslogBuilder.consumeValue(SyslogFieldKeys.MESSAGE, ctx.getText().trim());
  }

  @Override
  public void exitMsg_utf8(Rfc3164Parser.Msg_utf8Context ctx) {
    syslogBuilder.consumeValue(SyslogFieldKeys.MESSAGE, ctx.getText().trim());
  }
}

