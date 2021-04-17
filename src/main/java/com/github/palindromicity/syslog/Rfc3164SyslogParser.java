/*
 * Copyright 2018-2021 simple-syslog authors
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

import com.github.palindromicity.syslog.dsl.DefaultErrorListener;
import com.github.palindromicity.syslog.dsl.Syslog3164Listener;
import com.github.palindromicity.syslog.dsl.generated.Rfc3164Lexer;
import com.github.palindromicity.syslog.dsl.generated.Rfc3164Parser;
import com.github.palindromicity.syslog.util.Validate;
import java.util.EnumSet;
import java.util.Map;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * {@link SyslogParser} for valid RFC 3164 syslog.
 */
class Rfc3164SyslogParser extends AbstractSyslogParser {

  SyslogSpecification specification;

  /**
   * Create a new {@code Rfc3164SyslogParser}.
   *
   * @param keyProvider {@link com.github.palindromicity.syslog.KeyProvider} to provide keys for
   *                    the {@link Syslog3164Listener}.
   * @param deviations  {@link AllowableDeviations} for parsing
   */
  Rfc3164SyslogParser(KeyProvider keyProvider, EnumSet<AllowableDeviations> deviations,
                      SyslogSpecification specification) {
    super(keyProvider, deviations);
    this.specification = specification;
  }

  @Override
  public Map<String, Object> parseLine(String syslogLine) {
    Validate.notBlank(syslogLine, "syslogLine");
    Rfc3164Lexer lexer = new Rfc3164Lexer(new ANTLRInputStream(syslogLine));
    lexer.removeErrorListeners();
    lexer.addErrorListener(new DefaultErrorListener());
    Rfc3164Parser parser = new Rfc3164Parser(new CommonTokenStream(lexer));
    Syslog3164Listener listener = new Syslog3164Listener(getKeyProvider(), getDeviations());
    parser.addParseListener(listener);
    parser.removeErrorListeners();
    parser.addErrorListener(new DefaultErrorListener());
    if (specification == SyslogSpecification.RFC_3164) {
      parser.syslog_msg();
    } else if (specification == SyslogSpecification.RFC_6587_3164) {
      parser.octet_prefixed();
    }
    return listener.getMessageMap();
  }
}
