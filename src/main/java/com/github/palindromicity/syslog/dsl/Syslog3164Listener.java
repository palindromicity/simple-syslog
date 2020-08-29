/*
 * Copyright 2018-2020 simple-syslog authors
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

import com.github.palindromicity.syslog.AllowableDeviations;
import com.github.palindromicity.syslog.KeyProvider;
import com.github.palindromicity.syslog.dsl.generated.Rfc3164BaseListener;
import com.github.palindromicity.syslog.dsl.generated.Rfc3164Parser;
import com.github.palindromicity.syslog.util.Validate;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Simple implementation of {@link Rfc3164BaseListener}.
 * <p>
 * The {@code Syslog5424Listener} uses the provided {@link KeyProvider} when inserting items into
 * the map.
 * </p>
 */
public class Syslog3164Listener extends Rfc3164BaseListener implements MessageMapProvider {

  /**
   * {@link KeyProvider} that provides our key names.
   */
  private KeyProvider keyProvider;

  /**
   * {@link AllowableDeviations} for parsing and errors.
   */
  private EnumSet<AllowableDeviations> deviations;

  /**
   * The {@code Map} used to store our syslog values.
   */
  private final Map<String, Object> msgMap = new HashMap<>();

  /**
   * Create a new {@code Syslog5424Listener}.
   *
   * @param keyProvider {@link KeyProvider} used for map insertion.
   * @param deviations  {@link AllowableDeviations} for parsing
   */
  public Syslog3164Listener(KeyProvider keyProvider, EnumSet<AllowableDeviations> deviations) {
    Validate.notNull(keyProvider, "keyProvider");
    this.keyProvider = keyProvider;
    this.deviations = deviations;
  }

  /**
   * Returns the {@code Map} of syslog values with the keys as provided by the {@link KeyProvider}.
   * The map returned is unmodifiable.
   *
   * @return unmodifiable {@code Map}
   */
  @Override
  public Map<String, Object> getMessageMap() {
    if (msgMap.get(keyProvider.getHeaderPriority()) == null && !deviations
        .contains(AllowableDeviations.PRIORITY)) {
      throw new ParseException("Priority missing with strict parsing");
    }
    return Collections.unmodifiableMap(msgMap);
  }


  @Override
  public void exitHeaderPriorityValue(Rfc3164Parser.HeaderPriorityValueContext ctx) {
    String priority = ctx.getText();
    msgMap.put(keyProvider.getHeaderPriority(), priority);
    int pri = Integer.parseInt(priority);
    int sev = pri % 8;
    int facility = pri / 8;
    msgMap.put(keyProvider.getHeaderSeverity(), String.valueOf(sev));
    msgMap.put(keyProvider.getHeaderFacility(), String.valueOf(facility));
  }

  @Override
  public void exitHeaderHostName(Rfc3164Parser.HeaderHostNameContext ctx) {
    msgMap.put(keyProvider.getHeaderHostName(), ctx.getText());
  }

  @Override
  public void exitHeaderTimeStamp(Rfc3164Parser.HeaderTimeStampContext ctx) {
    msgMap.put(keyProvider.getHeaderTimeStamp(),
        ctx.full_date().getText() + "T" + ctx.full_time().getText());
  }

  @Override
  public void exitHeaderTimeStamp3164(Rfc3164Parser.HeaderTimeStamp3164Context ctx) {
    msgMap.put(keyProvider.getHeaderTimeStamp(), String
        .format("%s%s %s", ctx.date_month_short().getText(), ctx.date_day_short().getText(),
            ctx.partial_time().getText()));
  }

  @Override
  public void exitMsg_any(Rfc3164Parser.Msg_anyContext ctx) {
    msgMap.put(keyProvider.getMessage(), ctx.getText().trim());
  }

  @Override
  public void exitMsg_utf8(Rfc3164Parser.Msg_utf8Context ctx) {
    msgMap.put(keyProvider.getMessage(), ctx.getText().trim());
  }
}

