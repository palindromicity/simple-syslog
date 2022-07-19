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

package com.github.palindromicity.syslog.dsl;

import com.github.palindromicity.syslog.AllowableDeviations;
import com.github.palindromicity.syslog.DefaultKeyProvider;
import com.github.palindromicity.syslog.KeyProvider;
import com.github.palindromicity.syslog.MapOfMaps5424MessageHandler;
import com.github.palindromicity.syslog.NilPolicy;
import com.github.palindromicity.syslog.StructuredDataPolicy;
import com.github.palindromicity.syslog.dsl.generated.Rfc5424Lexer;
import com.github.palindromicity.syslog.dsl.generated.Rfc5424Parser;
import java.util.EnumSet;
import java.util.Map;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Assert;
import org.junit.Test;

public class Syslog5424ListenerTest {

  private static final String expectedVersion = "1";
  private static final String expectedMessage = "Removing instance";
  private static final String expectedAppName = "d0602076-b14a-4c55-852a-981e7afeed38";
  private static final String expectedHostName = "loggregator";
  private static final String expectedPri = "14";
  private static final String expectedProcId = "DEA";
  private static final String expectedTimestamp = "2014-06-20T09:14:07+00:00";
  private static final String expectedMessageId = "MSG-01";
  private static final String expectedFacility = "1";
  private static final String expectedSeverity = "6";

  private static final String expectedIUT1 = "3";
  private static final String expectedIUT2 = "4";
  private static final String expectedEventSource1 = "Application";
  private static final String expectedEventSource2 = "Other Application";
  private static final String expectedEventID1 = "1011";
  private static final String expectedEventID2 = "2022";

  @Test
  @SuppressWarnings("unchecked")
  public void testAllPresent() throws Exception {
    Map<String, Object> map = handleFile("src/test/resources/logs/5424/log_all.txt");
    Assert.assertEquals(expectedVersion, map.get(SyslogFieldKeys.HEADER_VERSION.getField()));
    Assert.assertEquals(expectedMessage, map.get(SyslogFieldKeys.MESSAGE.getField()));
    Assert.assertEquals(expectedAppName, map.get(SyslogFieldKeys.HEADER_APPNAME.getField()));
    Assert.assertEquals(expectedHostName, map.get(SyslogFieldKeys.HEADER_HOSTNAME.getField()));
    Assert.assertEquals(expectedPri, map.get(SyslogFieldKeys.HEADER_PRI.getField()));
    Assert.assertEquals(expectedSeverity, map.get(SyslogFieldKeys.HEADER_PRI_SEVERITY.getField()));
    Assert.assertEquals(expectedFacility, map.get(SyslogFieldKeys.HEADER_PRI_FACILITY.getField()));
    Assert.assertEquals(expectedProcId, map.get(SyslogFieldKeys.HEADER_PROCID.getField()));
    Assert.assertEquals(expectedTimestamp, map.get(SyslogFieldKeys.HEADER_TIMESTAMP.getField()));
    Assert.assertEquals(expectedMessageId, map.get(SyslogFieldKeys.HEADER_MSGID.getField()));

    // structured data
    Map<String, Object> structured =
        (Map<String, Object>)map.get(new DefaultKeyProvider().getStructuredBase());
    Assert.assertTrue(structured.containsKey("exampleSDID@32473"));
    Map<String, Object> example1 = (Map<String, Object>) structured.get("exampleSDID@32473");
    Assert.assertTrue(example1.containsKey("iut"));
    Assert.assertTrue(example1.containsKey("eventSource"));
    Assert.assertTrue(example1.containsKey("eventID"));
    Assert.assertEquals(expectedIUT1, example1.get("iut").toString());
    Assert.assertEquals(expectedEventSource1, example1.get("eventSource").toString());
    Assert.assertEquals(expectedEventID1, example1.get("eventID").toString());

    Assert.assertTrue(structured.containsKey("exampleSDID@32480"));
    Map<String, Object> example2 = (Map<String, Object>) structured.get("exampleSDID@32480");
    Assert.assertTrue(example2.containsKey("iut"));
    Assert.assertTrue(example2.containsKey("eventSource"));
    Assert.assertTrue(example2.containsKey("eventID"));
    Assert.assertEquals(expectedIUT2, example2.get("iut").toString());
    Assert.assertEquals(expectedEventSource2, example2.get("eventSource").toString());
    Assert.assertEquals(expectedEventID2, example2.get("eventID").toString());

  }

  @Test
  public void testAllPresentButPriority() throws Exception {
    handleFile("src/test/resources/logs/5424/log_missing_pri.txt", NilPolicy.OMIT,
        StructuredDataPolicy.FLATTEN, EnumSet.of(AllowableDeviations.PRIORITY));
  }

  @Test(expected = ParseException.class)
  public void testAllPresentButPriorityNoDeviation() throws Exception {
    handleFile("src/test/resources/logs/5424/log_missing_pri.txt", NilPolicy.OMIT,
        StructuredDataPolicy.FLATTEN, EnumSet.of(AllowableDeviations.NONE));
  }

  @Test
  public void testAllPresentButVersion() throws Exception {
    handleFile("src/test/resources/logs/5424/log_missing_version.txt", NilPolicy.OMIT,
        StructuredDataPolicy.FLATTEN, EnumSet.of(AllowableDeviations.VERSION));
  }

  @Test(expected = ParseException.class)
  public void testAllPresentButVersionNoDeviation() throws Exception {
    handleFile("src/test/resources/logs/5424/log_missing_version.txt", NilPolicy.OMIT,
        StructuredDataPolicy.FLATTEN, EnumSet.of(AllowableDeviations.NONE));
  }

  @Test
  public void testAllPresentButPriVersion() throws Exception {
    handleFile("src/test/resources/logs/5424/log_missing_priversion.txt", NilPolicy.OMIT,
        StructuredDataPolicy.FLATTEN,
        EnumSet.of(AllowableDeviations.PRIORITY, AllowableDeviations.VERSION));
  }

  @Test(expected = ParseException.class)
  public void testAllPresentButPriVersionNoDeviation() throws Exception {
    handleFile("src/test/resources/logs/5424/log_missing_priversion.txt", NilPolicy.OMIT,
        StructuredDataPolicy.FLATTEN, EnumSet.of(AllowableDeviations.NONE));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testAllPresentMappedStructuredData() throws Exception {
    Map<String, Object> map = handleFile("src/test/resources/logs/5424/log_all.txt", NilPolicy.OMIT,
        StructuredDataPolicy.MAP_OF_MAPS);
    Assert.assertEquals(expectedVersion, map.get(SyslogFieldKeys.HEADER_VERSION.getField()));
    Assert.assertEquals(expectedMessage, map.get(SyslogFieldKeys.MESSAGE.getField()));
    Assert.assertEquals(expectedAppName, map.get(SyslogFieldKeys.HEADER_APPNAME.getField()));
    Assert.assertEquals(expectedHostName, map.get(SyslogFieldKeys.HEADER_HOSTNAME.getField()));
    Assert.assertEquals(expectedPri, map.get(SyslogFieldKeys.HEADER_PRI.getField()));
    Assert.assertEquals(expectedSeverity, map.get(SyslogFieldKeys.HEADER_PRI_SEVERITY.getField()));
    Assert.assertEquals(expectedFacility, map.get(SyslogFieldKeys.HEADER_PRI_FACILITY.getField()));
    Assert.assertEquals(expectedProcId, map.get(SyslogFieldKeys.HEADER_PROCID.getField()));
    Assert.assertEquals(expectedTimestamp, map.get(SyslogFieldKeys.HEADER_TIMESTAMP.getField()));
    Assert.assertEquals(expectedMessageId, map.get(SyslogFieldKeys.HEADER_MSGID.getField()));

    // structured data
    Map<String, Object> structured =
        (Map<String, Object>) map.get(SyslogFieldKeys.STRUCTURED_BASE.getField());
    Assert.assertTrue(structured.containsKey("exampleSDID@32473"));
    Map<String, Object> example1 = (Map<String, Object>) structured.get("exampleSDID@32473");
    Assert.assertTrue(example1.containsKey("iut"));
    Assert.assertTrue(example1.containsKey("eventSource"));
    Assert.assertTrue(example1.containsKey("eventID"));
    Assert.assertEquals(expectedIUT1, example1.get("iut").toString());
    Assert.assertEquals(expectedEventSource1, example1.get("eventSource").toString());
    Assert.assertEquals(expectedEventID1, example1.get("eventID").toString());

    Assert.assertTrue(structured.containsKey("exampleSDID@32480"));
    Map<String, Object> example2 = (Map<String, Object>) structured.get("exampleSDID@32480");
    Assert.assertTrue(example2.containsKey("iut"));
    Assert.assertTrue(example2.containsKey("eventSource"));
    Assert.assertTrue(example2.containsKey("eventID"));
    Assert.assertEquals(expectedIUT2, example2.get("iut").toString());
    Assert.assertEquals(expectedEventSource2, example2.get("eventSource").toString());
    Assert.assertEquals(expectedEventID2, example2.get("eventID").toString());

  }

  @Test
  @SuppressWarnings("unchecked")
  public void testMissingHeaderFieldOmit() throws Exception {
    Map<String, Object> map = handleFile("src/test/resources/logs/5424/log.txt");
    Assert.assertEquals(expectedVersion, map.get(SyslogFieldKeys.HEADER_VERSION.getField()));
    Assert.assertEquals(expectedMessage, map.get(SyslogFieldKeys.MESSAGE.getField()));
    Assert.assertEquals(expectedAppName, map.get(SyslogFieldKeys.HEADER_APPNAME.getField()));
    Assert.assertEquals(expectedHostName, map.get(SyslogFieldKeys.HEADER_HOSTNAME.getField()));
    Assert.assertEquals(expectedPri, map.get(SyslogFieldKeys.HEADER_PRI.getField()));
    Assert.assertEquals(expectedSeverity, map.get(SyslogFieldKeys.HEADER_PRI_SEVERITY.getField()));
    Assert.assertEquals(expectedFacility, map.get(SyslogFieldKeys.HEADER_PRI_FACILITY.getField()));
    Assert.assertEquals(expectedProcId, map.get(SyslogFieldKeys.HEADER_PROCID.getField()));
    Assert.assertEquals(expectedTimestamp, map.get(SyslogFieldKeys.HEADER_TIMESTAMP.getField()));
    Assert.assertFalse(map.containsKey(SyslogFieldKeys.HEADER_MSGID.getField()));

    // structured data
    Map<String, Object> structured =
        (Map<String, Object>) map.get(new DefaultKeyProvider().getStructuredBase());
    Assert.assertTrue(structured.containsKey("exampleSDID@32473"));
    Map<String, Object> example1 = (Map<String, Object>) structured.get("exampleSDID@32473");
    Assert.assertTrue(example1.containsKey("iut"));
    Assert.assertTrue(example1.containsKey("eventSource"));
    Assert.assertTrue(example1.containsKey("eventID"));
    Assert.assertEquals(expectedIUT1, example1.get("iut").toString());
    Assert.assertEquals(expectedEventSource1, example1.get("eventSource").toString());
    Assert.assertEquals(expectedEventID1, example1.get("eventID").toString());

    Assert.assertTrue(structured.containsKey("exampleSDID@32480"));
    Map<String, Object> example2 = (Map<String, Object>) structured.get("exampleSDID@32480");
    Assert.assertTrue(example2.containsKey("iut"));
    Assert.assertTrue(example2.containsKey("eventSource"));
    Assert.assertTrue(example2.containsKey("eventID"));
    Assert.assertEquals(expectedIUT2, example2.get("iut").toString());
    Assert.assertEquals(expectedEventSource2, example2.get("eventSource").toString());
    Assert.assertEquals(expectedEventID2, example2.get("eventID").toString());
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testMissingHeaderFieldNull() throws Exception {
    Map<String, Object> map = handleFile("src/test/resources/logs/5424/log.txt", NilPolicy.NULL);
    Assert.assertEquals(expectedVersion, map.get(SyslogFieldKeys.HEADER_VERSION.getField()));
    Assert.assertEquals(expectedMessage, map.get(SyslogFieldKeys.MESSAGE.getField()));
    Assert.assertEquals(expectedAppName, map.get(SyslogFieldKeys.HEADER_APPNAME.getField()));
    Assert.assertEquals(expectedHostName, map.get(SyslogFieldKeys.HEADER_HOSTNAME.getField()));
    Assert.assertEquals(expectedPri, map.get(SyslogFieldKeys.HEADER_PRI.getField()));
    Assert.assertEquals(expectedSeverity, map.get(SyslogFieldKeys.HEADER_PRI_SEVERITY.getField()));
    Assert.assertEquals(expectedFacility, map.get(SyslogFieldKeys.HEADER_PRI_FACILITY.getField()));
    Assert.assertEquals(expectedProcId, map.get(SyslogFieldKeys.HEADER_PROCID.getField()));
    Assert.assertEquals(expectedTimestamp, map.get(SyslogFieldKeys.HEADER_TIMESTAMP.getField()));
    Assert.assertNull(map.get(SyslogFieldKeys.HEADER_MSGID.getField()));

    // structured data
    Map<String, Object> structured = (Map<String, Object>)map.get(new DefaultKeyProvider().getStructuredBase());
    Assert.assertTrue(structured.containsKey("exampleSDID@32473"));
    Map<String, Object> example1 = (Map<String, Object>) structured.get("exampleSDID@32473");
    Assert.assertTrue(example1.containsKey("iut"));
    Assert.assertTrue(example1.containsKey("eventSource"));
    Assert.assertTrue(example1.containsKey("eventID"));
    Assert.assertEquals(expectedIUT1, example1.get("iut").toString());
    Assert.assertEquals(expectedEventSource1, example1.get("eventSource").toString());
    Assert.assertEquals(expectedEventID1, example1.get("eventID").toString());

    Assert.assertTrue(structured.containsKey("exampleSDID@32480"));
    Map<String, Object> example2 = (Map<String, Object>) structured.get("exampleSDID@32480");
    Assert.assertTrue(example2.containsKey("iut"));
    Assert.assertTrue(example2.containsKey("eventSource"));
    Assert.assertTrue(example2.containsKey("eventID"));
    Assert.assertEquals(expectedIUT2, example2.get("iut").toString());
    Assert.assertEquals(expectedEventSource2, example2.get("eventSource").toString());
    Assert.assertEquals(expectedEventID2, example2.get("eventID").toString());
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testMissingHeaderFieldDash() throws Exception {
    Map<String, Object> map = handleFile("src/test/resources/logs/5424/log.txt", NilPolicy.DASH);
    Assert.assertEquals(expectedVersion, map.get(SyslogFieldKeys.HEADER_VERSION.getField()));
    Assert.assertEquals(expectedMessage, map.get(SyslogFieldKeys.MESSAGE.getField()));
    Assert.assertEquals(expectedAppName, map.get(SyslogFieldKeys.HEADER_APPNAME.getField()));
    Assert.assertEquals(expectedHostName, map.get(SyslogFieldKeys.HEADER_HOSTNAME.getField()));
    Assert.assertEquals(expectedPri, map.get(SyslogFieldKeys.HEADER_PRI.getField()));
    Assert.assertEquals(expectedSeverity, map.get(SyslogFieldKeys.HEADER_PRI_SEVERITY.getField()));
    Assert.assertEquals(expectedFacility, map.get(SyslogFieldKeys.HEADER_PRI_FACILITY.getField()));
    Assert.assertEquals(expectedProcId, map.get(SyslogFieldKeys.HEADER_PROCID.getField()));
    Assert.assertEquals(expectedTimestamp, map.get(SyslogFieldKeys.HEADER_TIMESTAMP.getField()));
    Assert.assertEquals("-", map.get(SyslogFieldKeys.HEADER_MSGID.getField()));

    // structured data
    Map<String, Object> structured = (Map<String, Object>)map.get(new DefaultKeyProvider().getStructuredBase());
    Assert.assertTrue(structured.containsKey("exampleSDID@32473"));
    Map<String, Object> example1 = (Map<String, Object>) structured.get("exampleSDID@32473");
    Assert.assertTrue(example1.containsKey("iut"));
    Assert.assertTrue(example1.containsKey("eventSource"));
    Assert.assertTrue(example1.containsKey("eventID"));
    Assert.assertEquals(expectedIUT1, example1.get("iut").toString());
    Assert.assertEquals(expectedEventSource1, example1.get("eventSource").toString());
    Assert.assertEquals(expectedEventID1, example1.get("eventID").toString());

    Assert.assertTrue(structured.containsKey("exampleSDID@32480"));
    Map<String, Object> example2 = (Map<String, Object>) structured.get("exampleSDID@32480");
    Assert.assertTrue(example2.containsKey("iut"));
    Assert.assertTrue(example2.containsKey("eventSource"));
    Assert.assertTrue(example2.containsKey("eventID"));
    Assert.assertEquals(expectedIUT2, example2.get("iut").toString());
    Assert.assertEquals(expectedEventSource2, example2.get("eventSource").toString());
    Assert.assertEquals(expectedEventID2, example2.get("eventID").toString());
  }

  @Test
  public void testMissingStructured() throws Exception {
    Map<String, Object> map = handleFile("src/test/resources/logs/5424/log_nils.txt");
    Assert.assertEquals(expectedVersion, map.get(SyslogFieldKeys.HEADER_VERSION.getField()));
    Assert.assertEquals(expectedMessage, map.get(SyslogFieldKeys.MESSAGE.getField()));
    Assert.assertEquals(expectedAppName, map.get(SyslogFieldKeys.HEADER_APPNAME.getField()));
    Assert.assertEquals(expectedHostName, map.get(SyslogFieldKeys.HEADER_HOSTNAME.getField()));
    Assert.assertEquals(expectedPri, map.get(SyslogFieldKeys.HEADER_PRI.getField()));
    Assert.assertEquals(expectedSeverity, map.get(SyslogFieldKeys.HEADER_PRI_SEVERITY.getField()));
    Assert.assertEquals(expectedFacility, map.get(SyslogFieldKeys.HEADER_PRI_FACILITY.getField()));
    Assert.assertEquals(expectedProcId, map.get(SyslogFieldKeys.HEADER_PROCID.getField()));
    Assert.assertEquals(expectedTimestamp, map.get(SyslogFieldKeys.HEADER_TIMESTAMP.getField()));
    Assert.assertFalse(map.containsKey(SyslogFieldKeys.HEADER_MSGID.getField()));
    for (String key : map.keySet()) {
      if (key.startsWith(SyslogFieldKeys.STRUCTURED_BASE.getField())) {
        Assert.fail();
      }
    }

  }

  private static Map<String, Object> handleFile(String fileName) throws Exception {
    return handleFile(fileName, NilPolicy.OMIT);
  }

  private static Map<String, Object> handleFile(String fileName, NilPolicy nilPolicy)
      throws Exception {
    return handleFile(fileName, nilPolicy, StructuredDataPolicy.FLATTEN,
        EnumSet.of(AllowableDeviations.NONE));
  }

  private static Map<String, Object> handleFile(String fileName, NilPolicy nilPolicy,
                                                StructuredDataPolicy structuredDataPolicy)
      throws Exception {
    return handleFile(fileName, nilPolicy, structuredDataPolicy,
        EnumSet.of(AllowableDeviations.NONE));
  }

  private static Map<String, Object> handleFile(String fileName, NilPolicy nilPolicy,
                                                StructuredDataPolicy structuredDataPolicy,
                                                EnumSet<AllowableDeviations> deviations)
      throws Exception {
    Rfc5424Lexer lexer = new Rfc5424Lexer(CharStreams.fromFileName(fileName));
    Rfc5424Parser parser = new Rfc5424Parser(new CommonTokenStream(lexer));
    KeyProvider keyProvider = new DefaultKeyProvider();
    MapOfMaps5424MessageHandler
        builder = new MapOfMaps5424MessageHandler(keyProvider, nilPolicy, deviations);
    Syslog5424Listener listener =
        new Syslog5424Listener(builder);
    parser.addParseListener(listener);
    Rfc5424Parser.Syslog_msgContext ctx = parser.syslog_msg();
    return builder.produce();
  }

}