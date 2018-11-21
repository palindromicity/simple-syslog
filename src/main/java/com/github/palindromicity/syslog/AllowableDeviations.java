/*
 * Copyright 2018 simple-syslog authors
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
 * Allowable deviations from the spec.  This allows for fields such as Priority and Version
 * which are required by spec to be missing by convention.
 */
public enum AllowableDeviations {
  /**
   * Properly formed Syslog.
   */
  NONE,
  /**
   * Syslog that does not have PRIORITY.
   */
  PRIORITY,
  /**
   * RFC 5424 Syslog that does not have VERSION.
   */
  VERSION
}
