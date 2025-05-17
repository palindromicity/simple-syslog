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

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import com.github.palindromicity.syslog.dsl.ParseException;
import com.github.palindromicity.syslog.dsl.SyslogFieldKeys;
import com.github.palindromicity.syslog.util.StructuredDataUtil;
import org.junit.Assert;
import org.junit.Test;

public class Rfc5424SyslogParserTest extends AbstractRfc5425SyslogParserTest {

  private static final String SYSLOG_LINE_ALL = "<14>1 2014-06-20T09:14:07+00:00 loggregator"
      + " d0602076-b14a-4c55-852a-981e7afeed38 DEA MSG-01"
      + " [exampleSDID@32473 iut=\"3\" eventSource=\"Application\" eventID=\"1011\"]"
      + "[exampleSDID@32480 iut=\"4\" eventSource=\"Other Application\" eventID=\"2022\"] Removing instance";

  private static final String SYSLOG_LINE_ESC_QUOTES = "<14>1 2014-06-20T09:14:07+00:00 loggregator"
      + " d0602076-b14a-4c55-852a-981e7afeed38 DEA MSG-01"
      + " [exampleSDID@32473 iut=\"3\" eventSource=\"Application\" eventID=\"1011\"]"
      + "[exampleSDID@32480 iut=\"4\" eventSource=\"Other \\\"so called \\\" Application\" eventID=\"2022\"]"
      + " Removing instance";

  private static final String SYSLOG_LINE_ESC_SLASH = "<14>1 2014-06-20T09:14:07+00:00 loggregator"
      + " d0602076-b14a-4c55-852a-981e7afeed38 DEA MSG-01"
      + " [exampleSDID@32473 iut=\"3\" eventSource=\"Application\" eventID=\"1011\"]"
      + "[exampleSDID@32480 iut=\"4\" eventSource=\"Other \\\\so called \\\\ Application\" eventID=\"2022\"]"
      + " Removing instance";

  private static final String SYSLOG_LINE_ESC_RIGHT_BRACKET = "<14>1 2014-06-20T09:14:07+00:00 loggregator"
      + " d0602076-b14a-4c55-852a-981e7afeed38 DEA MSG-01"
      + " [exampleSDID@32473 iut=\"3\" eventSource=\"Application\" eventID=\"1011\"]"
      + "[exampleSDID@32480 iut=\"4\" eventSource=\"Other [so called \\] Application\" eventID=\"2022\"]"
      + " Removing instance";

  private static final String SYSLOG_LINE_NO_MSG = "<14>1 2014-06-20T09:14:07+00:00 loggregator"
      + " d0602076-b14a-4c55-852a-981e7afeed38 DEA MSG-01"
      + " [exampleSDID@32473 iut=\"3\" eventSource=\"Application\" eventID=\"1011\"]";
  private static final String SYSLOG_LINE_NO_MSG2 = "<14>1 2014-06-20T09:14:07+00:00 loggregator"
      + " d0602076-b14a-4c55-852a-981e7afeed38 DEA MSG-01"
      + " [exampleSDID@32473 iut=\"3\" eventSource=\"Application\" eventID=\"1011\"]"
      + "[exampleSDID@32480 iut=\"4\" eventSource=\"Other Application\" eventID=\"2022\"]";

  private static final String expectedVersion = "1";
  private static final String expectedMessage = "Removing instance";
  private static final String expectedAppName = "d0602076-b14a-4c55-852a-981e7afeed38";
  private static final String expectedHostName = "loggregator";
  private static final String expectedPri = "14";
  private static final String expectedFacility = "1";
  private static final String expectedSeverity = "6";
  private static final String expectedProcId = "DEA";
  private static final String expectedTimestamp = "2014-06-20T09:14:07+00:00";
  private static final String expectedMessageId = "MSG-01";

  private static final String expectedIUT1 = "3";
  private static final String expectedIUT2 = "4";
  private static final String expectedEventSource1 = "Application";
  private static final String expectedEventSource2 = "Other Application";
  private static final String expectedEventSource2EscapedQuote = "Other \\\"so called \\\" Application";
  private static final String expectedEventSource2EscapedSlash = "Other \\\\so called \\\\ Application";
  private static final String expectedEventSource2EscapedRightBracket = "Other [so called \\] Application";
  private static final String expectedEventID1 = "1011";
  private static final String expectedEventID2 = "2022";
  private static final String OCTET_MSG = "83 <40>1 2012-11-30T06:45:29+00:00 host app web.3 - -" +
      " State changed from starting to up";


  @Test
  public void testParseOctetLine() throws Exception {
    MapOfMaps5424MessageHandler builder = new MapOfMaps5424MessageHandler();
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String,Object>>().forSpecification(SyslogSpecification.RFC_6587_5424).withSyslogBuilder(builder).build();
    Map<String, Object> map = handleLine(OCTET_MSG, parser);
    Assert.assertNotNull(map);
    Assert.assertEquals("40", map.get(SyslogFieldKeys.HEADER_PRI.getField()));
    Assert.assertEquals("1", map.get(SyslogFieldKeys.HEADER_VERSION.getField()));
    Assert.assertEquals("5", map.get(SyslogFieldKeys.HEADER_PRI_FACILITY.getField()));
    Assert.assertEquals("0", map.get(SyslogFieldKeys.HEADER_PRI_SEVERITY.getField()));
    Assert.assertEquals("host", map.get(SyslogFieldKeys.HEADER_HOSTNAME.getField()));
    Assert.assertEquals("app", map.get(SyslogFieldKeys.HEADER_APPNAME.getField()));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testParseLine() throws Exception {
    MapOfMaps5424MessageHandler builder = new MapOfMaps5424MessageHandler();
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(builder).build();
    Map<String, Object> map = handleLine(SYSLOG_LINE_ALL, parser);
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
  public void testParseLineEscapedQuote() throws Exception {
    MapOfMaps5424MessageHandler builder = new MapOfMaps5424MessageHandler();
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(builder).build();
    Map<String, Object> map = handleLine(SYSLOG_LINE_ESC_QUOTES, parser);
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
    Map<String, Object> structured = (Map<String, Object>) map.get(new DefaultKeyProvider().getStructuredBase());
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
    Assert.assertEquals(expectedEventSource2EscapedQuote, example2.get("eventSource").toString());
    Assert.assertEquals(expectedEventID2, example2.get("eventID").toString());
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testParseLineEscapedSlash() throws Exception {
    MapOfMaps5424MessageHandler builder = new MapOfMaps5424MessageHandler();
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(builder).build();
    Map<String, Object> map = handleLine(SYSLOG_LINE_ESC_SLASH, parser);
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
    Map<String, Object> structured = (Map<String, Object>) map.get(new DefaultKeyProvider().getStructuredBase());
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
    Assert.assertEquals(expectedEventSource2EscapedSlash, example2.get("eventSource").toString());
    Assert.assertEquals(expectedEventID2, example2.get("eventID").toString());
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testParseLineEscapedRightBracket() throws Exception {
    MapOfMaps5424MessageHandler builder = new MapOfMaps5424MessageHandler();
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(builder).build();
    Map<String, Object> map = handleLine(SYSLOG_LINE_ESC_RIGHT_BRACKET, parser);
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
    Map<String, Object> structured = (Map<String, Object>) map.get(new DefaultKeyProvider().getStructuredBase());
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
    Assert.assertEquals(expectedEventSource2EscapedRightBracket, example2.get("eventSource").toString());
    Assert.assertEquals(expectedEventID2, example2.get("eventID").toString());
  }


  @Test
  @SuppressWarnings("unchecked")
  public void testParseLineNoMessage() throws Exception {
    MapOfMaps5424MessageHandler builder = new MapOfMaps5424MessageHandler();
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(builder).build();
    // parse with one SD
    Map<String, Object> map = handleLine(SYSLOG_LINE_NO_MSG, parser);
    Assert.assertEquals(expectedVersion, map.get(SyslogFieldKeys.HEADER_VERSION.getField()));
    Assert.assertNull(map.get(SyslogFieldKeys.MESSAGE.getField()));
    Assert.assertEquals(expectedAppName, map.get(SyslogFieldKeys.HEADER_APPNAME.getField()));
    Assert.assertEquals(expectedHostName, map.get(SyslogFieldKeys.HEADER_HOSTNAME.getField()));
    Assert.assertEquals(expectedPri, map.get(SyslogFieldKeys.HEADER_PRI.getField()));
    Assert.assertEquals(expectedSeverity, map.get(SyslogFieldKeys.HEADER_PRI_SEVERITY.getField()));
    Assert.assertEquals(expectedFacility, map.get(SyslogFieldKeys.HEADER_PRI_FACILITY.getField()));
    Assert.assertEquals(expectedProcId, map.get(SyslogFieldKeys.HEADER_PROCID.getField()));
    Assert.assertEquals(expectedTimestamp, map.get(SyslogFieldKeys.HEADER_TIMESTAMP.getField()));
    Assert.assertEquals(expectedMessageId, map.get(SyslogFieldKeys.HEADER_MSGID.getField()));

    // structured data
    Map<String, Object> structured = (Map<String, Object>) map.get(new DefaultKeyProvider().getStructuredBase());
    Assert.assertTrue(structured.containsKey("exampleSDID@32473"));
    Map<String, Object> example1 = (Map<String, Object>) structured.get("exampleSDID@32473");
    Assert.assertTrue(example1.containsKey("iut"));
    Assert.assertTrue(example1.containsKey("eventSource"));
    Assert.assertTrue(example1.containsKey("eventID"));
    Assert.assertEquals(expectedIUT1, example1.get("iut").toString());
    Assert.assertEquals(expectedEventSource1, example1.get("eventSource").toString());
    Assert.assertEquals(expectedEventID1, example1.get("eventID").toString());

    // parse with 2 SD

    map = handleLine(SYSLOG_LINE_NO_MSG2, parser);
    Assert.assertEquals(expectedVersion, map.get(SyslogFieldKeys.HEADER_VERSION.getField()));
    Assert.assertNull(map.get(SyslogFieldKeys.MESSAGE.getField()));
    Assert.assertEquals(expectedAppName, map.get(SyslogFieldKeys.HEADER_APPNAME.getField()));
    Assert.assertEquals(expectedHostName, map.get(SyslogFieldKeys.HEADER_HOSTNAME.getField()));
    Assert.assertEquals(expectedPri, map.get(SyslogFieldKeys.HEADER_PRI.getField()));
    Assert.assertEquals(expectedSeverity, map.get(SyslogFieldKeys.HEADER_PRI_SEVERITY.getField()));
    Assert.assertEquals(expectedFacility, map.get(SyslogFieldKeys.HEADER_PRI_FACILITY.getField()));
    Assert.assertEquals(expectedProcId, map.get(SyslogFieldKeys.HEADER_PROCID.getField()));
    Assert.assertEquals(expectedTimestamp, map.get(SyslogFieldKeys.HEADER_TIMESTAMP.getField()));
    Assert.assertEquals(expectedMessageId, map.get(SyslogFieldKeys.HEADER_MSGID.getField()));

    // structured data
    structured = (Map<String, Object>) map.get(new DefaultKeyProvider().getStructuredBase());
    Assert.assertTrue(structured.containsKey("exampleSDID@32473"));
    example1 = (Map<String, Object>) structured.get("exampleSDID@32473");
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
  public void testParseLineConsumer() throws Exception {
    Flat5424MessageHandler builder = new Flat5424MessageHandler();
    SyslogParser<Map<String, String>> parser = new SyslogParserBuilder<Map<String, String>>().withSyslogBuilder(builder).build();
    handleFlatLine(SYSLOG_LINE_ALL, parser, (map) -> {
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
      Map<String, Object> structured = StructuredDataUtil.unFlattenStructuredData(map, new DefaultKeyProvider());
      Assert.assertTrue(structured.containsKey("exampleSDID@32473"));
      Map<String, String> example1 = (Map<String, String>) structured.get("exampleSDID@32473");
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
    });
  }

  @Test
  public void testParseLinesConsumerAndErrorConsumer() throws Exception {
    final AtomicInteger mapCount = new AtomicInteger();
    final AtomicInteger errorCount = new AtomicInteger();
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
    handleFile("src/test/resources/logs/5424/log_all_with_errors.txt", parser, (map) -> mapCount.incrementAndGet(),
        (line, throwable) -> errorCount.incrementAndGet());
    Assert.assertEquals(1, mapCount.get());
    Assert.assertEquals(3, errorCount.get());
  }

  @Test
  public void testParseLines() throws Exception {
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
    List<Map<String, Object>> mapList = handleFile("src/test/resources/logs/5424/log_all.txt", parser);
    Assert.assertEquals(1, mapList.size());
  }

  @Test
  public void testBomParsing() throws Exception {
    MapOfMaps5424MessageHandler
        builder = new MapOfMaps5424MessageHandler(new DefaultKeyProvider(), NilPolicy.OMIT, EnumSet.of(AllowableDeviations.PRIORITY));
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(builder).build();
    List<Map<String, Object>> mapList = handleFile("src/test/resources/logs/5424/log_with_bom.txt", parser);
    Assert.assertEquals(1, mapList.size());
  }

  //log_utf8_umlauts.txt
  @Test
  public void testBomParsingUmlauts() throws Exception {
    MapOfMaps5424MessageHandler
        builder = new MapOfMaps5424MessageHandler(new DefaultKeyProvider(), NilPolicy.OMIT, EnumSet.of(AllowableDeviations.PRIORITY));
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(builder).build();
    List<Map<String, Object>> mapList = handleFile("src/test/resources/logs/5424/log_utf8_umlauts.txt", parser);
    Assert.assertEquals(1, mapList.size());
    Assert.assertTrue(mapList.get(0).get("syslog.message").toString().contains("äöü"));
  }

  @Test
  public void testParseLinesWithDashDefaultPolicy() throws Exception {
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
    List<Map<String, Object>> mapList = handleFile("src/test/resources/logs/5424/log.txt", parser);
    Assert.assertEquals(1, mapList.size());
  }

  @Test
  public void testParseLinesWithDashDashPolicy() throws Exception {
    MapOfMaps5424MessageHandler
        builder = new MapOfMaps5424MessageHandler(new DefaultKeyProvider(), NilPolicy.DASH );
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(builder).build();
    List<Map<String, Object>> mapList = handleFile("src/test/resources/logs/5424/log.txt", parser);
    Assert.assertEquals(1, mapList.size());
  }

  @Test
  public void testParseLinesMix() throws Exception {
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
    List<Map<String, Object>> mapList = handleFile("src/test/resources/logs/5424/log_mix.txt", parser);
    Assert.assertEquals(3, mapList.size());
  }

  @Test
  public void testParseLinesConsumer() throws Exception {
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
    final AtomicInteger count = new AtomicInteger();
    handleFile("src/test/resources/logs/5424/log_all.txt",
        parser,
        (map) -> count.incrementAndGet());

    Assert.assertEquals(count.get(), 1);
  }

  @Test
  public void testParseLinesConsumerMix() throws Exception {
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
    final AtomicInteger count = new AtomicInteger();
    handleFile("src/test/resources/logs/5424/log_mix.txt",
        parser,
        (map) -> count.incrementAndGet());

    Assert.assertEquals(count.get(), 3);
  }

  @Test(expected = ParseException.class)
  public void testInvalidLine() throws Exception {
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
    handleLine("10 Oct 13 14:14:43 localhost some body of the message", parser);
  }

  @Test(expected = ParseException.class)
  public void testInvalidLineConsumer() throws Exception {
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
    handleLine("10 Oct 13 14:14:43 localhost some body of the message",
        parser,
        (map) -> Assert.fail());
  }

  @Test
  public void testParseLinesMissingStructure() throws Exception {
    SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String,Object>>().forSpecification(SyslogSpecification.HEROKU_HTTPS_LOG_DRAIN).withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
    List<Map<String, Object>> mapList = handleFile("src/test/resources/logs/5424/log_missing_structure.txt",
      parser);
    Assert.assertEquals(1, mapList.size());
  }

  @Test
  public void testParseLineAtna() throws Exception {
    final SyslogParser<Map<String,Object>> parser = new SyslogParserBuilder<Map<String,Object>>().withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
    final List<Map<String, Object>> mapList = handleFile("src/test/resources/logs/5424/log_atna.txt", parser);
    Assert.assertEquals(1, mapList.size());
    final Map<String, Object> map = mapList.get(0);

    final String message = (String) map.get(SyslogFieldKeys.MESSAGE.getField());
    Assert.assertNotNull(message);
    // Multiple whitespaces should be kept
    Assert.assertTrue(message.contains("  "));
    Assert.assertFalse(message.contains("=\"0\"Event"));
  }

  @Test
  public void testParseLinesWithInvalidWhitespaces() throws Exception {
    final SyslogParser<Map<String,Object>> parser = new SyslogParserBuilder<Map<String,Object>>().withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
    final Path path = Paths.get("src/test/resources/logs/5424/log_invalid_whitespaces.txt");
    final List<String> lines = Files.readAllLines(path);

    for (final String line : lines) {
      try {
        handleLine(line, parser);
        Assert.fail("The parsing of the invalid line should have failed: " + line);
      } catch (final Exception e) {
        Assert.assertTrue(e instanceof ParseException);
      }
    }
  }
}