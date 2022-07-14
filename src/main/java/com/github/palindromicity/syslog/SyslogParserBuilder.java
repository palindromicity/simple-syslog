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

/**
 * Builder for SyslogParser instances.
 */
public class SyslogParserBuilder<T> {
  /**
   * The {@link SyslogMessageConsumer}.
   */
  private AbstractSyslogMessageHandler<T> syslogBuilder;

  /**
   * The {@link SyslogSpecification}. Defaults to {@link SyslogSpecification#RFC_5424}
   */
  private SyslogSpecification specification = SyslogSpecification.RFC_5424;

  /**
   * Specify which {@link SyslogSpecification} to parse.
   *
   * @param specification {@link SyslogSpecification#RFC_5424}
   *                      or {@link SyslogSpecification#RFC_3164}
   * @return {@code SyslogParserBuilder}
   */
  public SyslogParserBuilder<T> forSpecification(SyslogSpecification specification) {
    this.specification = specification;
    return this;
  }

  public SyslogParserBuilder<T> withSyslogBuilder(AbstractSyslogMessageHandler<T> syslogBuilder) {
    this.syslogBuilder = syslogBuilder;
    return this;
  }


  /**
   * Builds a new {@link SyslogParser} instance using options if provided.
   *
   * @return {@link SyslogParser}
   * @throws IllegalStateException if deviations is unknown
   */
  public SyslogParser<T> build() {
    SyslogParser<T> parser = null;
    switch (specification) {
      case RFC_5424:
      case RFC_6587_5424:
      case HEROKU_HTTPS_LOG_DRAIN:
        parser = new Rfc5424SyslogParser<T>(syslogBuilder, specification);
        break;
      case RFC_3164:
      case RFC_6587_3164:
        parser = new Rfc3164SyslogParser<T>(syslogBuilder, specification);
        break;
      default:
        throw new IllegalStateException("unknown specification");
    }
    return parser;
  }
}
