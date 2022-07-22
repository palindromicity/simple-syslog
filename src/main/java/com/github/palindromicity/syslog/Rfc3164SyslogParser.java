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

package com.github.palindromicity.syslog;

import com.github.palindromicity.syslog.dsl.DefaultErrorListener;
import com.github.palindromicity.syslog.dsl.Syslog3164Listener;
import com.github.palindromicity.syslog.dsl.generated.Rfc3164Lexer;
import com.github.palindromicity.syslog.dsl.generated.Rfc3164Parser;
import com.github.palindromicity.syslog.util.Validate;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.jspecify.nullness.NullMarked;

/**
 * {@link SyslogParser} for valid RFC 3164 syslog.
 */
@NullMarked
class Rfc3164SyslogParser<T> extends AbstractSyslogParser<T> {

  SyslogSpecification specification;

  /**
   * Create a new {@code Rfc3164SyslogParser}.
   *
   * @param syslogBuilder {@link SyslogMessageConsumer} used gather data
   */
  Rfc3164SyslogParser(AbstractSyslogMessageHandler<T> syslogBuilder,
                      SyslogSpecification specification) {
    super(syslogBuilder);
    this.specification = specification;
  }

  @Override
  public T parseLine(String syslogLine) {
    Validate.notBlank(syslogLine, "syslogLine");
    Rfc3164Lexer lexer = new Rfc3164Lexer(CharStreams.fromString(syslogLine));
    lexer.removeErrorListeners();
    lexer.addErrorListener(new DefaultErrorListener());
    Rfc3164Parser parser = new Rfc3164Parser(new CommonTokenStream(lexer));
    getSyslogBuilder().start();
    Syslog3164Listener listener =
        new Syslog3164Listener(getSyslogBuilder());
    parser.addParseListener(listener);
    parser.removeErrorListeners();
    parser.addErrorListener(new DefaultErrorListener());
    if (specification == SyslogSpecification.RFC_3164) {
      parser.syslog_msg();
    } else if (specification == SyslogSpecification.RFC_6587_3164) {
      parser.octet_prefixed();
    }
    getSyslogBuilder().complete();
    return getSyslogBuilder().produce();
  }
}
