[![Build Status](https://travis-ci.org/palindromicity/simple-syslog.svg?branch=master)](https://travis-ci.org/palindromicity/simple-syslog)

### Simple Syslog 

A java library for parsing valid Syslog [IETF RFC 5424](https://tools.ietf.org/html/rfc5424) and [IETF_RFC_3164](https://tools.ietf.org/html/rfc3164) logs.
The library provides it's own parser implementations, but also exposes the Antlr generated base classes
and interfaces should you want your own implementations.


## Basic Usage

### Syslog RFC 5424
A simple, default usage to parser a Syslog RFC 5424 log line is to build a SyslogParser
with the defaults, and pass it the line.  The `SyslogParserBuilder` defaults to `SyslogSpecification.RFC_5424` so it doesn't have to be explicitly set by `.forSpecification()`.

```java
 SyslogParser parser = new SyslogParserBuilder().build();
 Map<String,Object> syslogMap = parser.parseLine(syslogLine);

```

To parse a number of Syslog lines together, say from a file you would create
a `Reader` and all `parseLines`

```java
  List<Map<String,Object>> syslogMapList = null;
  SyslogParser parser = new SyslogParserBuilder().build();
  try (Reader reader = new BufferedReader(new FileReader(new File(fileName)))) {
      syslogMapList = parser.parseLines(reader);
  }
 
```

Both `parseLine` and `parseLines` also provide a functional interface if you prefer that style.
Just pass a `Consumer` to the function.

```java
 SyslogParser parser = new SyslogParserBuilder().build();
 syslogMap = parser.parseLine(syslogLine, (syslogMap) -> {
   // do something with map
 });

```


```java
  SyslogParser parser = new SyslogParserBuilder().build();
  try (Reader reader = new BufferedReader(new FileReader(new File(fileName)))) {
      parser.parseLines(reader, (map) -> {
        // do something with each map
      });
  }
 
```

```java
 SyslogParser parser = new SyslogParserBuilder().build();
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
with the defaults, and pass it the line.  Note that the `SyslogSpecification` is required for the builder to create the proper parser.

```java
 SyslogParser parser = new SyslogParserBuilder().forSpecification(SyslogSpecification.RFC_3164).build();
 Map<String,Object> syslogMap = parser.parseLine(syslogLine);

```

To parse a number of Syslog lines together, say from a file you would create
a `Reader` and all `parseLines`

```java
  List<Map<String,Object>> syslogMapList = null;
  SyslogParser parser = new SyslogParserBuilder().forSpecification(SyslogSpecification.RFC_3164).build();
  try (Reader reader = new BufferedReader(new FileReader(new File(fileName)))) {
      syslogMapList = parser.parseLines(reader);
  }
 
```

Both `parseLine` and `parseLines` also provide a functional interface if you prefer that style.
Just pass a `Consumer` to the function.

```java
 SyslogParser parser = new SyslogParserBuilder().forSpecification(SyslogSpecification.RFC_3164).build();
 syslogMap = parser.parseLine(syslogLine, (syslogMap) -> {
   // do something with map
 });

```


```java
  SyslogParser parser = new SyslogParserBuilder().forSpecification(SyslogSpecification.RFC_3164).build();
  try (Reader reader = new BufferedReader(new FileReader(new File(fileName)))) {
      parser.parseLines(reader, (map) -> {
        // do something with each map
      });
  }
 
```

```java
  SyslogParser parser = new SyslogParserBuilder().forSpecification(SyslogSpecification.RFC_3164).build();
  try (Reader reader = new BufferedReader(new FileReader(new File(fileName)))) {
      parser.parseLines(reader, (map) -> {
        // do something with each map
      }, (line, throwable) -> {
        // do something for a failed line
      });
  }
```

### Options

Besides setting the `SyslogSpecification` the `SyslogParserBuilder` supports options for changing the `AllowableVariations`, the `SyslogSpecifictation` and the `KeyProvider`.

##### SyslogSpecification

The specifications supported by the library.  `RFC_5424` and `RFC_3164`.

##### AllowableDeviations

Allowable deviations from the specifications.  This allows for fields required by the specification, but perhaps
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

A custom `KeyProvider` can be supplied to the `SyslogParserBuilder` if there is a different key strategy required.
Note that the keys are a superset of the syslog specifications.

##### NilPolicy
The `NilPolicy` governs how the parser handles *nil* message parts for `SyslogSpecification.RFC_5424`.  That is message parts that can be *nil* as part of a valid message;

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

Implementors would then build their own parsers or builders etc.  In other words the use of this library would 
minimally be the Antlr classes alone.

For example you would build a 'parser' that used your implementations, most likely implemented like this:

```java
    Rfc5424Lexer lexer = new Rfc5424Lexer(new ANTLRInputStream(syslogLine));
    Rfc5424Parser parser = new Rfc5424Parser(new CommonTokenStream(lexer));
    Rfc5424Listener listener = new MyCustomListener(keyProvider);
    parser.addParseListener(listener);
    Rfc5424Parser.Syslog_msgContext ctx = parser.syslog_msg();
    return listener.getMyCustomResult();
```

### Questions

- __*Why not just use [java-grok](https://github.com/thekrakken/java-grok)?*__

  Though I love java-grok (it is used in [Apache Metron](https://metron.apache.org) and [Apache Nifi](https://nifi.apache.org) which I contribute to), and have even
  submitted PRs to it, it and other Regex based parsers do not handle Syslog 5424 Structured Data.  I wanted something
  that did.  I have not found any regex based approach which handles structured data in a single pass.  If you find one, let me know!

- __*Why not fix the groks to handle it?  Or create regexes outside of grok?*__

  I'm not good enough at regex, and couldn't write something that worked single pass.

- __*Why not write a custom state machine type parser?*__

  I like Antlr and wanted to try it ;)

--------

```xml
<repositories>
  <repository>
    <id>bintray</id>
    <url>http://dl.bintray.com/palndromicity/simple-syslog</url>
    <releases>
      <enabled>true</enabled>
    </releases>
    <snapshots>
      <enabled>false</enabled>
    </snapshots>
  </repository>
</repositories>
```

```xml
<dependency>
  <groupId>com.github.palindromicity</groupId>
  <artifactId>simple-syslog</artifactId>
  <version>0.0.3</version>
  <type>pom</type>
</dependency>
```