[![Build Status](https://travis-ci.org/palindromicity/simple-syslog.svg?branch=master)](https://travis-ci.org/palindromicity/simple-syslog)

### Simple Syslog

A java library for parsing valid Syslog [IETF RFC 5424](https://tools.ietf.org/html/rfc5424) and [IETF_RFC_3164](https://tools.ietf.org/html/rfc3164) logs.
The library provides it's own parser implementations, but also exposes the Antlr generated base classes
and interfaces should you want your own implementations.

## Simple Usage

Simple Syslog provids a `Simple` class with methods for parsing syslog with the default options and as
little configuration as possible.

```java
  Map<String, Object> = Simple.simpleNested5424(syslogLine);
  Map<String, String> = Simple.simpleFlat5424(syslogLine);
```

Calls exist for using Readers and Consumers with the default options

The default options for RFC 5424:

- No Deviations
- OMIT policy for Nils
- Default KeyProvider

The default options for RFC 3164:

- No Deviations
- Default KeyProvider

In general, there are Simple calls for almost all the SyslogParser interface calls described below.

## Slightly less simple usage

Simple Syslog aims to provide syslog parsing that allows callers to handle syslog in the least restrictive
way.

The syslog parsers do not build objects from syslog string, they call the provided syslog builder with the message
parts. This allows for custom object building.

The default syslog builders provided allow specialization of Allowed Deviation, how to produce names for message parts,
and how to handle Nils in RFC 5424 messages.

Custom SyslogBuilds can use these or other methods to help build their objects as well.
see `Default3164MessageHandler`, `Flat5424MessageHandler`, and `MapOfMaps5424MessageHandler`

Parsing any Syslog with the lower leve (non `Simple`) apis requires using the `SyslogParserBuilder`
to build a SyslogParser accoring to the `SyslogSpecification` you desire, and with a `SyslogBuilder` implemenation
you provide, either from the provided classes or your own.

The SyslogParser is generically typed, so you must know the type that any implementation of `SyslogBuilder` returns.

The `SyslogParserBuilder` defaults to `SyslogSpecification.RFC_5424` so it doesn't have to be explicitly set by `.forSpecification()`.

Please see the ample unit tests for examples of all the options.

### Syslog RFC 5424

```java
 SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
 Map<String,Object> syslogMap = parser.parseLine(syslogLine);

```

To parse a number of Syslog lines together, say from a file you would create
a `Reader` and all `parseLines`

```java
  List<Map<String,Object>> syslogMapList = null;
  SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
  try (Reader reader = new BufferedReader(new FileReader(new File(fileName)))) {
      syslogMapList = parser.parseLines(reader);
  }

```

Both `parseLine` and `parseLines` also provide a functional interface if you prefer that style.
Just pass a `Consumer` to the function.

```java
  SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
  syslogMap = parser.parseLine(syslogLine, (syslogMap) -> {
   // do something with map
 });

```

```java
  SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
  try (Reader reader = new BufferedReader(new FileReader(new File(fileName)))) {
      parser.parseLines(reader, (map) -> {
        // do something with each map
      });
  }

```

```java
  SyslogParser<Map<String, Object>> parser = new SyslogParserBuilder<Map<String, Object>>().withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
  try (Reader reader = new BufferedReader(new FileReader(new File(fileName)))) {
      parser.parseLines(reader, (map) -> {
        // do something with each map
      }, (line, throwable) -> {
        // do something for a failed line
      });
  }
```

#### Syslog RFC 3164

A simple, default usage to parser a Syslog RFC 3164 log line is to build a SyslogParser
with at least `SyslogSpecification` and `SyslogBuilder`.

```java
 SyslogParser<Map<String, String>> parser = new SyslogParserBuilder<Map<String,String>>().forSpecification(SyslogSpecification.RFC_3164).withSyslogBuilder(new Default3164MessageHandler()).build();
 Map<String,Object> syslogMap = parser.parseLine(syslogLine);

```

To parse a number of Syslog lines together, say from a file you would create
a `Reader` and all `parseLines`

```java
  List<Map<String,String>> syslogMapList = null;
  SyslogParser<Map<String, String>> parser = new SyslogParserBuilder<Map<String,String>>().forSpecification(SyslogSpecification.RFC_3164).withSyslogBuilder(new Default3164MessageHandler()).build();
  try (Reader reader = new BufferedReader(new FileReader(new File(fileName)))) {
      syslogMapList = parser.parseLines(reader);
  }

```

Both `parseLine` and `parseLines` also provide a functional interface if you prefer that style.
Just pass a `Consumer` to the function.

```java
 SyslogParser<Map<String, String>> parser = new SyslogParserBuilder<Map<String,String>>().forSpecification(SyslogSpecification.RFC_3164).withSyslogBuilder(new Default3164MessageHandler()).build();
 syslogMap = parser.parseLine(syslogLine, (syslogMap) -> {
   // do something with map
 });

```

```java
  SyslogParser<Map<String, String>> parser = new SyslogParserBuilder<Map<String,String>>().forSpecification(SyslogSpecification.RFC_3164).withSyslogBuilder(new Default3164MessageHandler()).build();
  try (Reader reader = new BufferedReader(new FileReader(new File(fileName)))) {
      parser.parseLines(reader, (map) -> {
        // do something with each map
      });
  }

```

```java
  SyslogParser<Map<String, String>> parser = new SyslogParserBuilder<Map<String,String>>().forSpecification(SyslogSpecification.RFC_3164).withSyslogBuilder(new Default3164MessageHandler()).build();
  try (Reader reader = new BufferedReader(new FileReader(new File(fileName)))) {
      parser.parseLines(reader, (map) -> {
        // do something with each map
      }, (line, throwable) -> {
        // do something for a failed line
      });
  }
```

### RFC 6587

[RFC 6587](https://tools.ietf.org/html/rfc6587#section-3.4.1) describe a method of transmitting Syslog messages of
either specifications prefixed with octet counts.
Simple Syslog supports these messages with explicit specifications available.

### Heroku HTTPS Log Drains

[Heroku HTTPS Drains](https://devcenter.heroku.com/articles/log-drains#https-drains) An HTTPS encapsulated version of
RFC6587 and RFC5424.

```java
SyslogParser parser = new SyslogParserBuilder().forSpecification(SyslogSpecification.HEROKU_HTTPS_LOG_DRAIN).withSyslogBuilder(new MapOfMaps5424MessageHandler()).build();
```

### Options

While the `SyslogParserBuilder` supports setting `SyslogSpecification`, the options
for changing the `AllowableVariations`, the `SyslogSpecifictation` and the `KeyProvider` are set on the
provided `SyslogBuilder` implemenations.

Callers may or may not use these in their `SyslogBuilder` implementations as well.

##### SyslogSpecification

The specifications supported by the library. `RFC_5424`, `RFC_6587_5424`, `RFC_3164`, and `RFC_6587_3164`.

##### AllowableDeviations

Allowable deviations from the specifications. This allows for fields required by the specification, but perhaps
omitted by convention to be missing, and a line that is by specificiation technically incorrect to still parse.

This is specified by an {@code EnumSet}

```java
/**
   * Properly formed Syslog.
   */
  NONE,
  /**
   * Syslog that does not have PRIORITY.
   */
  PRIORITY,
  /**
   * Syslog that does not have VERSION.
   */
  VERSION
```

##### KeyProvider

A `KeyProvider` is used to provide the map keys for the Syslog data.
The default `KeyProvider` : `DefaultKeyProvider` provides keys using the `SyslogKeys`:

```java
 MESSAGE("syslog.message"),
   HEADER_APPNAME("syslog.header.appName"),
   HEADER_HOSTNAME("syslog.header.hostName"),
   HEADER_PRI("syslog.header.pri"),
   HEADER_PRI_SEVERITY("syslog.header.severity"),
   HEADER_PRI_FACILITY("syslog.header.facility"),
   HEADER_PROCID("syslog.header.procId"),
   HEADER_TIMESTAMP("syslog.header.timestamp"),
   HEADER_MSGID("syslog.header.msgId"),
   HEADER_VERSION("syslog.header.version"),
   STRUCTURED_BASE("syslog.structuredData."),
   STRUCTURED_ELEMENT_ID_FMT("syslog.structuredData.%s"),
   STRUCTURED_ELEMENT_ID_PNAME_FMT("syslog.structuredData.%s.%s"),
   STRUCTURED_ELEMENT_ID_PNAME_PATTERN("syslog.structuredData\\.(.*)\\.(.*)$");

```

A custom `KeyProvider` can be supplied to the provided `SyslogBuilder` implemenations if there is a different key strategy required.
Note that the keys are a superset of the syslog specifications.

##### NilPolicy

The `NilPolicy` governs how the parser handles _nil_ message parts for `SyslogSpecification.RFC_5424`. That is message parts that can be _nil_ as part of a valid message;

- HOSTNAME
- APPNAME
- PROCID
- MSGID
- TIMESTAMP

###### Policies

- OMIT : The map will not contain an entry for that field
- NULL : The map will contain a null entry for that field
- DASH : The map will contain a '-' for that field

The default policy is `OMIT`.

### Creating your own Parsers

Simple Syslog 5424 uses [Antlr 4](http://www.antlr.org) to generate the `Listener` that the parser is based on.
The generated `Rfc5424Listener` and `Rfc5424Visitor` interfaces, or `Rfc5424BaseListener` and `Rfc5424BaseVisitor` classes,
may be used to implement new parsers as well in the event that you prefer different handling.

Implementors would then build their own parsers or builders etc. In other words the use of this library would
minimally be the Antlr classes alone.

For examples, see the implementations of `Rfc3164SyslogParser` and `Rfc5424SyslogParser` for examples of
parser implementations as well as the `Syslog3164Listener` and `Syslog5424Listener` implementations.

### Building

This project uses [simple-syslog-grammars](https://github.com/palindromicity/simple-syslog-grammars)
You will want to use `git clone --recursive` and ensure the src/main/antlr4/com/github/palindromicity/syslog/dsl/generated directory is created.

### Questions

- **_Why not just use [java-grok](https://github.com/thekrakken/java-grok)?_**

  Though I love java-grok (it is used in [Apache Metron](https://metron.apache.org) and [Apache Nifi](https://nifi.apache.org) which I contribute to), and have even
  submitted PRs to it, it and other Regex based parsers do not handle Syslog 5424 Structured Data. I wanted something
  that did. I have not found any regex based approach which handles structured data in a single pass. If you find one, let me know!

- **_Why not fix the groks to handle it? Or create regexes outside of grok?_**

  I'm not good enough at regex, and couldn't write something that worked single pass.

- **_Why not write a custom state machine type parser?_**

  I like Antlr and wanted to try it ;)

---

```xml
<dependency>
  <groupId>com.github.palindromicity</groupId>
  <artifactId>simple-syslog</artifactId>
  <version>VERSION</version>
  <type>pom</type>
</dependency>
```
