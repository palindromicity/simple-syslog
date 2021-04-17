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
import com.github.palindromicity.syslog.dsl.Syslog5424Listener;
import com.github.palindromicity.syslog.dsl.generated.Rfc5424Lexer;
import com.github.palindromicity.syslog.dsl.generated.Rfc5424Parser;
import com.github.palindromicity.syslog.util.Validate;
import java.util.EnumSet;
import java.util.Map;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * {@link SyslogParser} for valid RFC 5424 syslog.
 */
class Rfc5424SyslogParser extends AbstractSyslogParser {

  SyslogSpecification specification;

  /**
   * Create a new {@code Rfc5424SyslogParser}.
   *
   * @param keyProvider {@link com.github.palindromicity.syslog.KeyProvider} to provide keys for
   *                     the {@link Syslog5424Listener}.
   */
  Rfc5424SyslogParser(KeyProvider keyProvider) {
    this(keyProvider, null, null, EnumSet.of(AllowableDeviations.NONE),
        SyslogSpecification.RFC_5424);
  }

  Rfc5424SyslogParser(KeyProvider keyProvider, NilPolicy nilPolicy,
                      StructuredDataPolicy structuredDataPolicy) {
    this(keyProvider, nilPolicy, structuredDataPolicy, EnumSet.of(AllowableDeviations.NONE),
        SyslogSpecification.RFC_5424);
  }

  Rfc5424SyslogParser(KeyProvider keyProvider, NilPolicy nilPolicy,
                      StructuredDataPolicy structuredDataPolicy,
                      EnumSet<AllowableDeviations> deviations,
                      SyslogSpecification specification) {
    super(keyProvider, deviations, nilPolicy, structuredDataPolicy);
    this.specification = specification;
  }

  @Override
  public Map<String, Object> parseLine(String syslogLine) {
    Validate.notBlank(syslogLine, "syslogLine");
    Rfc5424Lexer lexer = new Rfc5424Lexer(new ANTLRInputStream(syslogLine));
    lexer.removeErrorListeners();
    lexer.addErrorListener(new DefaultErrorListener());
    Rfc5424Parser parser = new Rfc5424Parser(new CommonTokenStream(lexer));
    Syslog5424Listener listener = new Syslog5424Listener(getKeyProvider(), getNilPolicy(),
        getStructuredDataPolicy(),
        getDeviations());
    parser.addParseListener(listener);
    parser.removeErrorListeners();
    parser.addErrorListener(new DefaultErrorListener());
    if (specification == SyslogSpecification.RFC_5424) {
      parser.syslog_msg();
    } else if (specification == SyslogSpecification.RFC_6587_5424) {
      parser.octet_prefixed();
    } else if (specification == SyslogSpecification.HEROKU_HTTPS_LOG_DRAIN) {
      parser.heroku_https_log_drain();
    }
    return listener.getMessageMap();
  }
}
