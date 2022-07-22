package com.github.palindromicity.syslog;

import java.io.Reader;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.jspecify.nullness.NullMarked;
import org.jspecify.nullness.Nullable;

@NullMarked
public class Simple {
  /**
   * Parse a RFC 5424 {@code String} to a {@code Map<String, Object}.
   *
   * <p>Uses:
   * {@code DefaultKeyProvider}
   * {@code NilPolicy.OMIT}
   * No Deviations<\p>
   *
   * @param line the line of 5424 Syslog to parse
   * @return a {@code Map<String, Object}
   * @throws com.github.palindromicity.syslog.dsl.ParseException if there is an error parsing
   */
  public static Map<String, @Nullable Object> simpleNested5424(String line) {
    SyslogParser<Map<String, @Nullable Object>> parser =
        new SyslogParserBuilder<Map<String, @Nullable Object>>().withSyslogBuilder(
            new MapOfMaps5424MessageHandler()).build();
    return parser.parseLine(line);
  }

  /**
   * Parse a RFC 5424 {@code String} to a {@code Map<String, Object} and provides that {@code T}
   * to the provided {@code Consumer}.
   *
   * <p>Uses:
   * {@code DefaultKeyProvider}
   * {@code NilPolicy.OMIT}
   * No Deviations<\p>
   *
   * @param line     the line of 5424 Syslog to parser
   * @param consumer the {@code Consumer}
   * @throws com.github.palindromicity.syslog.dsl.ParseException if there is an error parsing
   */
  public static void simpleNested5424(String line,
                                      Consumer<Map<String, @Nullable Object>> consumer) {
    SyslogParser<Map<String, @Nullable Object>> parser =
        new SyslogParserBuilder<Map<String, @Nullable Object>>().withSyslogBuilder(
            new MapOfMaps5424MessageHandler()).build();
    parser.parseLine(line, consumer);
  }

  /**
   * Reads each line RFC 5424 from the {@code Reader} and parses it to
   * a {@code List} of {@code Map<String, Object>}.
   *
   * <p>Uses:
   * {@code DefaultKeyProvider}
   * {@code NilPolicy.OMIT}
   * No Deviations**</p>
   *
   * @param reader {@code Reader} used.  It is not closed in this method.
   * @return {@code List} of {@code Map<String, Object>}
   * @throws com.github.palindromicity.syslog.dsl.ParseException if there is an error parsing
   * @throws IllegalArgumentException                            if reader is null
   */
  public static List<Map<String, @Nullable Object>> simpleNested5424(Reader reader) {
    SyslogParser<Map<String, @Nullable Object>> parser =
        new SyslogParserBuilder<Map<String, @Nullable Object>>().withSyslogBuilder(
            new MapOfMaps5424MessageHandler()).build();
    return parser.parseLines(reader);
  }

  /**
   * Reads each line of RFC 5424 from the {@code Reader} and parses it
   * to {@code Map<String, Object>}, which is passed to the provided {@code Consumer}.
   *
   * <p>Uses:
   * {@code DefaultKeyProvider}
   * {@code NilPolicy.OMIT}
   * No Deviations**</p>
   *
   * @param reader   {@code Reader} used.  It is not closed in this method.
   * @param consumer the {@code Consumer}
   * @throws com.github.palindromicity.syslog.dsl.ParseException if there is an error parsing
   * @throws IllegalArgumentException                            if reader or consumer are null
   */
  public static void simpleNested5424(Reader reader,
                                      Consumer<Map<String, @Nullable Object>> consumer) {
    SyslogParser<Map<String, @Nullable Object>> parser =
        new SyslogParserBuilder<Map<String, @Nullable Object>>().withSyslogBuilder(
            new MapOfMaps5424MessageHandler()).build();
    parser.parseLines(reader, consumer);
  }

  /**
   * Parse a RFC 5424 {@code String} to a {@code Map<String, Object>}.
   *
   * <p>Uses:
   * {@code DefaultKeyProvider}
   * {@code NilPolicy.OMIT}
   * No Deviations<\p>
   *
   * @param line the line of 5424 Syslog to parse
   * @return a {@code Map<String, Object>}
   * @throws com.github.palindromicity.syslog.dsl.ParseException if there is an error parsing
   */
  public static Map<String, @Nullable String> simpleFlat5424(String line) {
    SyslogParser<Map<String, @Nullable String>> parser =
        new SyslogParserBuilder<Map<String, @Nullable String>>().withSyslogBuilder(
            new Flat5424MessageHandler()).build();
    return parser.parseLine(line);
  }

  /**
   * Parse a RFC 5424 {@code String} to a {@code Map<String, String} and provides that {@code T}
   * to the provided {@code Consumer}.
   *
   * <p>Uses:
   * {@code DefaultKeyProvider}
   * {@code NilPolicy.OMIT}
   * No Deviations<\p>
   *
   * @param line     the line of 5424 Syslog to parser
   * @param consumer the {@code Consumer}
   * @throws com.github.palindromicity.syslog.dsl.ParseException if there is an error parsing
   */
  public static void simpleFlat5424(String line, Consumer<Map<String, @Nullable String>> consumer) {
    SyslogParser<Map<String, @Nullable String>> parser =
        new SyslogParserBuilder<Map<String, @Nullable String>>().withSyslogBuilder(
            new Flat5424MessageHandler()).build();
    parser.parseLine(line, consumer);
  }

  /**
   * Reads each line of RFC 5424 from the {@code Reader} and parses it
   * to a {@code List} of {@code Map<String, String>}.
   *
   * <p>Uses:
   * {@code DefaultKeyProvider}
   * {@code NilPolicy.OMIT}
   * No Deviations*<\p>
   *
   * @param reader {@code Reader} used.  It is not closed in this method.
   * @return {@code List} of {@code Map<String, String>}
   * @throws com.github.palindromicity.syslog.dsl.ParseException if there is an error parsing
   * @throws IllegalArgumentException                            if reader is null
   */
  public static List<Map<String, @Nullable String>> simpleFlat5424(Reader reader) {
    SyslogParser<Map<String, @Nullable String>> parser =
        new SyslogParserBuilder<Map<String, @Nullable String>>().withSyslogBuilder(
            new Flat5424MessageHandler()).build();
    return parser.parseLines(reader);
  }

  /**
   * Reads each line of RFC 5424 from the {@code Reader} and parses it
   * to {@code Map<String, String>}, which is passed to the
   * provided {@code Consumer}.
   *
   * <p>Uses:
   * {@code DefaultKeyProvider}
   * {@code NilPolicy.OMIT}
   * No Deviations<\p>
   *
   * @param reader   {@code Reader} used.  It is not closed in this method.
   * @param consumer the {@code Consumer}
   * @throws com.github.palindromicity.syslog.dsl.ParseException if there is an error parsing
   * @throws IllegalArgumentException                            if reader or consumer are null
   */
  public static void simpleFlat5424(Reader reader,
                                    Consumer<Map<String, @Nullable String>> consumer) {
    SyslogParser<Map<String, @Nullable String>> parser =
        new SyslogParserBuilder<Map<String, @Nullable String>>().withSyslogBuilder(
            new Flat5424MessageHandler()).build();
    parser.parseLines(reader, consumer);
  }

  /**
   * Parse a RFC 3164 {@code String} to a {@code Map<String, String}.
   *
   * <p>Uses:
   * {@code DefaultKeyProvider}
   * No Deviations<\p>
   *
   * @param line the line of Syslog to parse
   * @return a {@code T}
   * @throws com.github.palindromicity.syslog.dsl.ParseException if there is an error parsing
   */
  public static Map<String, String> simple3164(String line) {
    SyslogParser<Map<String, String>> parser =
        new SyslogParserBuilder<Map<String, String>>().forSpecification(
                SyslogSpecification.RFC_3164).withSyslogBuilder(new Default3164MessageHandler())
            .build();
    return parser.parseLine(line);
  }

  /**
   * Parse a RFC 3164 {@code String} to a {@code Map<String, String} and provides that {@code T}
   * to the provided {@code Consumer}.
   *
   * <p>Uses:
   * {@code DefaultKeyProvider}
   * No Deviations</p>
   *
   * @param line     the line of 3164 Syslog to parser
   * @param consumer the {@code Consumer}
   * @throws com.github.palindromicity.syslog.dsl.ParseException if there is an error parsing
   */
  public static void simple3164(String line, Consumer<Map<String, String>> consumer) {
    SyslogParser<Map<String, String>> parser =
        new SyslogParserBuilder<Map<String, String>>().forSpecification(
                SyslogSpecification.RFC_3164).withSyslogBuilder(new Default3164MessageHandler())
            .build();
    parser.parseLine(line, consumer);
  }

  /**
   * Reads each line of RFC 3164 from the {@code Reader} and parses it
   * to a {@code List} of {@code Map<String, String>}.
   *
   * <p>Uses:
   * {@code DefaultKeyProvider}
   * No Deviations*<\p>
   *
   * @param reader {@code Reader} used.  It is not closed in this method.
   * @return {@code List} of {@code Map<String, String>}
   * @throws com.github.palindromicity.syslog.dsl.ParseException if there is an error parsing
   * @throws IllegalArgumentException                            if reader is null
   */
  public static List<Map<String, String>> simple3164(Reader reader) {
    SyslogParser<Map<String, String>> parser =
        new SyslogParserBuilder<Map<String, String>>().forSpecification(
                SyslogSpecification.RFC_3164).withSyslogBuilder(new Default3164MessageHandler())
            .build();
    return parser.parseLines(reader);
  }

  /**
   * Reads each line from the {@code Reader} and parses it
   * to {@code Map<String, String>}, which is passed to the
   * provided {@code Consumer}.
   *
   * <p>Uses:
   * {@code DefaultKeyProvider}
   * No Deviations<\p>
   *
   * @param reader   {@code Reader} used.  It is not closed in this method.
   * @param consumer the {@code Consumer}
   * @throws com.github.palindromicity.syslog.dsl.ParseException if there is an error parsing
   * @throws IllegalArgumentException                            if reader or consumer are null
   */
  public static void simple3164(Reader reader, Consumer<Map<String, String>> consumer) {
    SyslogParser<Map<String, String>> parser =
        new SyslogParserBuilder<Map<String, String>>().forSpecification(
                SyslogSpecification.RFC_3164).withSyslogBuilder(new Default3164MessageHandler())
            .build();
    parser.parseLines(reader, consumer);
  }
}
