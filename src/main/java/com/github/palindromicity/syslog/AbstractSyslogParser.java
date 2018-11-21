package com.github.palindromicity.syslog;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.github.palindromicity.syslog.dsl.Syslog3164Listener;
import com.github.palindromicity.syslog.util.Validate;

abstract class AbstractSyslogParser implements SyslogParser {

  /**
   * {@link com.github.palindromicity.syslog.KeyProvider} to provide keys.
   */
  private KeyProvider keyProvider;

  /**
   * {@code EnumSet} of {@link AllowableDeviations}.
   */
  private EnumSet<AllowableDeviations> deviations;

  /**
   * {@link NilPolicy}.
   */
  private NilPolicy nilPolicy = NilPolicy.OMIT;

  /**
   * {@link StructuredDataPolicy}.
   */
  private StructuredDataPolicy structuredDataPolicy = StructuredDataPolicy.FLATTEN;

  /**
   * Create a new {@code AbstractSyslogParser}.
   *
   * @param keyProvider {@link com.github.palindromicity.syslog.KeyProvider} to provide keys for the
   * {@link Syslog3164Listener}.
   * @param deviations {@link AllowableDeviations} for parsing
   */
  AbstractSyslogParser(KeyProvider keyProvider, EnumSet<AllowableDeviations> deviations) {
    Validate.notNull(keyProvider, "keyProvider");
    this.keyProvider = keyProvider;
    this.deviations = deviations;
  }

  /**
   * Create a new {@code AbstractSyslogParser}.
   *
   * @param keyProvider {@link com.github.palindromicity.syslog.KeyProvider} to provide keys for the
   * {@link Syslog3164Listener}.
   * @param deviations {@link AllowableDeviations} for parsing
   * @param nilPolicy {@link NilPolicy}
   * @param structuredDataPolicy {@link StructuredDataPolicy}
   */
  AbstractSyslogParser(KeyProvider keyProvider, EnumSet<AllowableDeviations> deviations, NilPolicy nilPolicy,
      StructuredDataPolicy structuredDataPolicy) {
    Validate.notNull(keyProvider, "keyProvider");
    this.keyProvider = keyProvider;
    this.deviations = deviations;
    if (nilPolicy != null) {
      this.nilPolicy = nilPolicy;
    }
    if (structuredDataPolicy != null) {
      this.structuredDataPolicy = structuredDataPolicy;
    }
  }

  /**
   * Get the {@link KeyProvider}.
   *
   * @return {@link KeyProvider}
   */
  KeyProvider getKeyProvider() {
    return keyProvider;
  }

  /**
   * Get the {@link AllowableDeviations}.
   *
   * @return {@code EnumSet} of {@link AllowableDeviations}
   */
  EnumSet<AllowableDeviations> getDeviations() {
    return deviations;
  }

  /**
   * Get the {@link NilPolicy}.
   *
   * @return {@link NilPolicy}
   */
  NilPolicy getNilPolicy() {
    return nilPolicy;
  }

  /**
   * Get the {@link StructuredDataPolicy}.
   *
   * @return {@link StructuredDataPolicy}
   */
  StructuredDataPolicy getStructuredDataPolicy() {
    return structuredDataPolicy;
  }

  @Override
  public abstract Map<String, Object> parseLine(String syslogLine);

  @Override
  public void parseLine(String line, Consumer<Map<String, Object>> consumer) {
    Validate.notNull(consumer, "consumer");
    consumer.accept(parseLine(line));
  }

  @Override
  public List<Map<String, Object>> parseLines(Reader reader) {
    Validate.notNull(reader, "reader");
    return new BufferedReader(reader).lines()
        .map(this::parseLine)
        .collect(Collectors.toList());
  }

  @Override
  public void parseLines(Reader reader, Consumer<Map<String, Object>> consumer) {
    Validate.notNull(reader, "reader");
    Validate.notNull(consumer, "consumer");
    new BufferedReader(reader).lines()
        .map(this::parseLine)
        .forEach(consumer);
  }

  @Override
  public void parseLines(Reader reader, Consumer<Map<String, Object>> messageConsumer,
      BiConsumer<String, Throwable> errorConsumer) {
    Validate.notNull(reader, "reader");
    Validate.notNull(reader, "messageConsumer");
    Validate.notNull(reader, "errorConsumer");

    List<String> lines = new BufferedReader(reader).lines().collect(Collectors.toList());
    lines.forEach((line) -> {
      try {
        messageConsumer.accept(parseLine(line));
      } catch (Throwable throwable) {
        errorConsumer.accept(line, throwable);
      }
    });
  }
}
