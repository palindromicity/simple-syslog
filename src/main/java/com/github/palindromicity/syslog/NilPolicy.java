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
 * Policies available for handling NIL '-' values.
 */
public enum NilPolicy {
  /**
   * a nil value will result msg part being omitted from the map.
   */
  OMIT,
  /**
   * a nil value will result in a null value in the map.
   */
  NULL,
  /**
   * a nil value will result in a '-' symbol in the map.
   */
  DASH
}
