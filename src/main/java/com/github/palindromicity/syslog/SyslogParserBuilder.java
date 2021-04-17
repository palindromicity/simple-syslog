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

import java.util.EnumSet;

/**
 * Builder for SyslogParser instances.
 */
public class SyslogParserBuilder {

  /**
   * The {@link AllowableDeviations}. Defaults to {@link AllowableDeviations#NONE}
   */
  private EnumSet<AllowableDeviations> deviations = EnumSet.of(AllowableDeviations.NONE);

  /**
   * The {@link KeyProvider}. Defaults to {@link DefaultKeyProvider}
   */
  private KeyProvider keyProvider = new DefaultKeyProvider();

  /**
   * The {@link NilPolicy}. Defaults to {@link NilPolicy#OMIT}
   */
  private NilPolicy nilPolicy = NilPolicy.OMIT;

  /**
   * The {@link StructuredDataPolicy}. Defaults to {@link StructuredDataPolicy#FLATTEN}
   */
  private StructuredDataPolicy structuredDataPolicy = StructuredDataPolicy.FLATTEN;

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
  public SyslogParserBuilder forSpecification(SyslogSpecification specification) {
    this.specification = specification;
    return this;
  }

  /**
   * Add a {@link AllowableDeviations} to the builder.
   *
   * @param deviations the deviations
   * @return {@code SyslogParserBuilder}
   */
  public SyslogParserBuilder withDeviations(final EnumSet<AllowableDeviations> deviations) {
    this.deviations = deviations;
    return this;
  }

  /**
   * Add a {@link KeyProvider} to the builder.
   *
   * @param keyProvider the {@link KeyProvider}
   * @return {@code SyslogParserBuilder}
   */
  public SyslogParserBuilder withKeyProvider(final KeyProvider keyProvider) {
    this.keyProvider = keyProvider;
    return this;
  }

  /**
   * Set the {@link NilPolicy} to the builder.
   *
   * @param nilPolicy the {@link NilPolicy}
   * @return {@code SyslogParserBuilder}
   */
  public SyslogParserBuilder withNilPolicy(NilPolicy nilPolicy) {
    this.nilPolicy = nilPolicy;
    return this;
  }

  public SyslogParserBuilder withStructuredDataPolicy(StructuredDataPolicy structuredDataPolicy) {
    this.structuredDataPolicy = structuredDataPolicy;
    return this;
  }

  /**
   * Builds a new {@link SyslogParser} instance using options if provided.
   *
   * @return {@link SyslogParser}
   * @throws IllegalStateException if deviations is unknown
   */
  public SyslogParser build() {
    SyslogParser parser = null;
    switch (specification) {
      case RFC_5424:
      case RFC_6587_5424:
      case HEROKU_HTTPS_LOG_DRAIN:
        parser = new Rfc5424SyslogParser(keyProvider, nilPolicy, structuredDataPolicy,
            deviations, specification);
        break;
      case RFC_3164:
      case RFC_6587_3164:
        parser = new Rfc3164SyslogParser(keyProvider, deviations, specification);
        break;
      default:
        throw new IllegalStateException("unknown specification");
    }
    return parser;
  }
}
