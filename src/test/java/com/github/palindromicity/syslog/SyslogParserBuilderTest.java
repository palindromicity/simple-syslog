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

import static org.junit.Assert.assertTrue;

import java.util.EnumSet;

import org.junit.Test;

public class SyslogParserBuilderTest {

  @Test
  public void testWithSpecification() {
    SyslogParser parser = new SyslogParserBuilder().forSpecification(SyslogSpecification.RFC_3164)
        .withDeviations(EnumSet.of(AllowableDeviations.NONE)).build();
    assertTrue(parser.getClass() == Rfc3164SyslogParser.class);
  }

  @Test
  public void testNoSpecification() {
    SyslogParser parser = new SyslogParserBuilder().build();
    assertTrue(parser.getClass() == Rfc5424SyslogParser.class);
  }
}