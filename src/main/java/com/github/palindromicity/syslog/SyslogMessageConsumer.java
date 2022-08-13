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

import com.github.palindromicity.syslog.dsl.SyslogFieldKeys;
import java.util.Map;
import java.util.function.Supplier;
import org.jspecify.nullness.NullMarked;

/**
 * SyslogMessageConsumer Interface.
 *
 * SyslogMessageConsumer instances are called with data
 * as it is parsed.
 */
@NullMarked
public interface SyslogMessageConsumer {

  void consumeValue(SyslogFieldKeys key, String value);

  void consumeStructured(String id, Map<String, String> rawParameterMap);

  void handleNil(SyslogFieldKeys key);

  void start();

  void complete();

  void reset();
}
