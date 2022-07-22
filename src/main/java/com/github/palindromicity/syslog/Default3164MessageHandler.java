/*
 * Copyright 2022 simple-syslog authors
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

package com.github.palindromicity.syslog;

import com.github.palindromicity.syslog.dsl.ParseException;
import com.github.palindromicity.syslog.dsl.SyslogFieldKeys;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.jspecify.nullness.NullMarked;
import org.jspecify.nullness.Nullable;

@NullMarked
public class Default3164MessageHandler
    extends AbstractSyslogMessageHandler<Map<String, String>> {

  /**
   * {@link KeyProvider} that provides our key names.
   */
  private KeyProvider keyProvider;

  /**
   * {@link AllowableDeviations} for parsing and errors.
   */
  private final EnumSet<AllowableDeviations> deviations;

  final Map<String, String> map = new HashMap<>();


  /**
   * Create a new {@code MapOfMaps3164Builder}.
   */
  public Default3164MessageHandler() {
    this(null, EnumSet.of(AllowableDeviations.NONE));
  }

  /**
   * Create a new {@code MapOfMaps3164Builder}.
   *
   * @param keyProvider {@link KeyProvider} used for map insertion and lookup.
   */
  public Default3164MessageHandler(@Nullable KeyProvider keyProvider) {
    this(keyProvider, EnumSet.of(AllowableDeviations.NONE));
  }

  /**
   * Create a new {@code MapOfMaps3164Builder}.
   *
   * @param keyProvider {@link KeyProvider} used for map insertion.
   * @param deviations  {@link AllowableDeviations} used for handling abnormalities.
   */
  public Default3164MessageHandler(@Nullable KeyProvider keyProvider,
                                   EnumSet<AllowableDeviations> deviations) {
    if (keyProvider == null) {
      this.keyProvider = new DefaultKeyProvider();
    } else {
      this.keyProvider = keyProvider;
    }
    this.deviations = deviations;
  }

  @Override
  public void consumeValue(SyslogFieldKeys key, String value) {
    map.put(keyProvider.get(key), value);
  }

  @Override
  @SuppressWarnings("unchecked")
  public void consumeStructured(String id, Map<String, String> rawParameterMap) {
  }

  @Override
  public Map<String, String> produce() {
    if (map.get(keyProvider.getHeaderPriority()) == null && !deviations
        .contains(AllowableDeviations.PRIORITY)) {
      throw new ParseException("Priority missing with strict parsing");
    }
    return Collections.unmodifiableMap(map);
  }

  @Override
  public void start() {
    this.map.clear();
  }

  @Override
  public void complete() {
  }

  @Override
  public void reset() {
    this.map.clear();
  }

  @Override
  public void handleNil(SyslogFieldKeys key) {
  }
}
