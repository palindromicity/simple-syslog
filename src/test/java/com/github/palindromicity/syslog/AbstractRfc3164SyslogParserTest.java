/*
 * Copyright 2018-2020 simple-syslog-5424 authors
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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.apache.commons.io.IOUtils;

public abstract class AbstractRfc3164SyslogParserTest {

  protected static List<Map<String, Object>> handleFile(String fileName, SyslogParser parser) throws Exception {
    try (Reader reader = new BufferedReader(new FileReader(new File(fileName)))) {
      return parser.parseLines(reader);
    }
  }

  protected static void handleFile(String fileName, SyslogParser parser, Consumer<Map<String, Object>> consumer)
      throws Exception {
    try (Reader reader = new BufferedReader(new FileReader(new File(fileName)))) {
      parser.parseLines(reader, consumer);
    }
  }

  protected static void handleFile(String fileName, SyslogParser parser, Consumer<Map<String, Object>> consumer,
      BiConsumer<String,Throwable> errorConsumer)
      throws Exception {
    try (Reader reader = new BufferedReader(new FileReader(new File(fileName)))) {
      parser.parseLines(reader, consumer, errorConsumer);
    }
  }

  protected static Map<String, Object> handleLine(String line, SyslogParser parser) throws Exception {
    return parser.parseLine(line);
  }

  protected static void handleLine(String line, SyslogParser parser, Consumer<Map<String, Object>> consumer)
      throws Exception {
    parser.parseLine(line, consumer);
  }

  protected static String readFileToString(String fileName) throws Exception {
    try (Reader reader = new BufferedReader(new FileReader(new File(fileName)))) {
      return IOUtils.toString(reader);
    }
  }
}
