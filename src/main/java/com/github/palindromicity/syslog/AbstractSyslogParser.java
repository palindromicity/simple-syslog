package com.github.palindromicity.syslog;

import com.github.palindromicity.syslog.dsl.Syslog3164Listener;
import com.github.palindromicity.syslog.util.Validate;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.jspecify.nullness.NullMarked;

@NullMarked
abstract class AbstractSyslogParser<T> implements SyslogParser<T> {

  /**
   * {@link SyslogMessageConsumer} for storing results.
   *
   */
  AbstractSyslogMessageHandler<T> syslogBuilder;

  /**
   * Create a new {@code AbstractSyslogParser}.
   *
   * @param syslogBuilder {@link AbstractSyslogMessageHandler} used gather data
   */
  AbstractSyslogParser(AbstractSyslogMessageHandler<T> syslogBuilder) {
    Validate.notNull(syslogBuilder, "syslogBuilder");
    this.syslogBuilder = syslogBuilder;
  }

  /**
   * Get the {@link SyslogMessageConsumer}.
   *
   * @return {@link SyslogMessageConsumer}
   */
  AbstractSyslogMessageHandler<T> getSyslogBuilder() {
    return syslogBuilder;
  }

  @Override
  public abstract T parseLine(String syslogLine);

  @Override
  public void parseLine(String line, Consumer<T> consumer) {
    Validate.notNull(consumer, "consumer");
    consumer.accept(parseLine(line));
  }

  @Override
  public List<T> parseLines(Reader reader) {
    Validate.notNull(reader, "reader");
    return new BufferedReader(reader).lines().map(this::parseLine).collect(Collectors.toList());
  }

  @Override
  public void parseLines(Reader reader, Consumer<T> consumer) {
    Validate.notNull(reader, "reader");
    Validate.notNull(consumer, "consumer");
    new BufferedReader(reader).lines().map(this::parseLine).forEach(consumer);
  }

  @Override
  public void parseLines(Reader reader, Consumer<T> messageConsumer,
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
