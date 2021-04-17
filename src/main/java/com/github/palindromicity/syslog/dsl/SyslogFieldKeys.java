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

package com.github.palindromicity.syslog.dsl;

/**
 * Keys for use in maps of Syslog Data.
 */
public enum SyslogFieldKeys {
  MESSAGE("syslog.message"), HEADER_APPNAME("syslog.header.appName"), HEADER_HOSTNAME(
      "syslog.header.hostName"), HEADER_PRI("syslog.header.pri"), HEADER_PRI_SEVERITY(
      "syslog.header.severity"), HEADER_PRI_FACILITY("syslog.header.facility"), HEADER_PROCID(
      "syslog.header.procId"), HEADER_TIMESTAMP("syslog.header.timestamp"), HEADER_MSGID(
      "syslog.header.msgId"), HEADER_VERSION("syslog.header.version"), STRUCTURED_BASE(
      "syslog.structuredData"), STRUCTURED_ELEMENT_ID_FMT(
      "syslog.structuredData.%s"), STRUCTURED_ELEMENT_ID_PNAME_FMT(
      "syslog.structuredData.%s.%s"), STRUCTURED_ELEMENT_ID_PNAME_PATTERN(
      "syslog.structuredData\\.(.*)\\.(.*)$");

  private String field;

  private SyslogFieldKeys(String field) {
    this.field = field;
  }

  /**
   * Returns the value.
   *
   * @return the Field value.
   */
  public String getField() {
    return field;
  }
}
