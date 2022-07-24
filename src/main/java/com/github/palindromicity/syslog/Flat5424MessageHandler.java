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
import org.jspecify.nullness.NullMarked;
import org.jspecify.nullness.Nullable;

/**
 * The type Flat 5424 message handler.
 *
 * <p>This implementation of {@link AbstractSyslogMessageHandler} handles
 * production of RFC 5424 Syslog Messages as a Map of String keys and String values.<\p>
 *
 * <p>If no {@link KeyProvider} is provided, the {@link DefaultKeyProvider} is used key names.</p>
 *
 * <p>If there are structured data elements, they are flattened using per {@link KeyProvider} implementation passed.<\p>
 */
@NullMarked
public class Flat5424MessageHandler extends AbstractSyslogMessageHandler<Map<String, String>> {
  private static final String DASH = "-";

  /**
   * {@link KeyProvider} that provides our key names.
   */
  private final KeyProvider keyProvider;

  /**
   * {@link NilPolicy} for parsing.
   */
  NilPolicy nilPolicy = NilPolicy.OMIT;

  /**
   * {@link AllowableDeviations} for parsing and errors.
   */
  private final EnumSet<AllowableDeviations> deviations;

  final Map<String, @Nullable String> map = new HashMap<>();


  /**
   * Create a new {@code Flat5424Builder}.
   */
  public Flat5424MessageHandler() {
    this(null, null, EnumSet.of(AllowableDeviations.NONE));
  }

  /**
   * Create a new {@code Flat5424Builder}.
   *
   * @param keyProvider {@link KeyProvider} used for map insertion and lookup.
   * @param nilPolicy   {@link NilPolicy} used for handling nil values.
   */
  public Flat5424MessageHandler(@Nullable KeyProvider keyProvider, @Nullable NilPolicy nilPolicy) {
    this(keyProvider, nilPolicy, EnumSet.of(AllowableDeviations.NONE));
  }

  /**
   * Create a new {@code Flat5424Builder}.
   *
   * @param keyProvider {@link KeyProvider} used for map insertion.
   * @param nilPolicy   {@link NilPolicy} used for handling nil values.
   *                    output.
   * @param deviations  {@link AllowableDeviations} used for handling abnormalities.
   */
  public Flat5424MessageHandler(@Nullable KeyProvider keyProvider, @Nullable NilPolicy nilPolicy,
                                EnumSet<AllowableDeviations> deviations) {
    if (keyProvider == null) {
      this.keyProvider = new DefaultKeyProvider();
    } else {
      this.keyProvider = keyProvider;
    }

    if (nilPolicy != null) {
      this.nilPolicy = nilPolicy;
    }

    this.deviations = deviations;
  }

  @Override
  public void consumeValue(SyslogFieldKeys key, String value) {
    map.put(keyProvider.get(key), value);
  }

  @Override
  public void consumeStructured(String id, Map<String, String> rawParameterMap) {
    for (Map.Entry<String, String> entry : rawParameterMap.entrySet()) {
      map.put(String.format(keyProvider.getStructuredElementIdParamNameFormat(), (id),
          entry.getKey()), entry.getValue());
    }
  }

  @Override
  public Map<String, @Nullable String> produce() {
    if (map.get(keyProvider.getHeaderPriority()) == null && !deviations
        .contains(AllowableDeviations.PRIORITY)) {
      throw new ParseException("Priority missing with strict parsing");
    } else if (map.get(keyProvider.getHeaderVersion()) == null && !deviations
        .contains(AllowableDeviations.VERSION)) {
      throw new ParseException("Version missing with strict parsing");
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
    if (this.nilPolicy == NilPolicy.OMIT) {
      return;
    }
    if (this.nilPolicy == NilPolicy.DASH) {
      map.put(keyProvider.get(key), DASH);
    } else if (this.nilPolicy == NilPolicy.NULL) {
      map.put(keyProvider.get(key), null);
    }
  }
}