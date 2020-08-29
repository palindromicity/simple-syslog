package com.github.palindromicity.syslog;

import com.github.palindromicity.syslog.dsl.SyslogFieldKeys;
import java.util.regex.Pattern;

/**
 * Default implementation of {@link KeyProvider}.
 *
 * <p>
 * This implementation uses the {@link SyslogFieldKeys} for values.
 * </p>
 */
public class DefaultKeyProvider implements KeyProvider {

  private static Pattern STRUCTURED_ELEMENT_ID_PNAME_PATTERN = Pattern
      .compile(SyslogFieldKeys.STRUCTURED_ELEMENT_ID_PNAME_PATTERN.getField());

  @Override
  public String getMessage() {
    return SyslogFieldKeys.MESSAGE.getField();
  }

  @Override
  public String getHeaderAppName() {
    return SyslogFieldKeys.HEADER_APPNAME.getField();
  }

  @Override
  public String getHeaderHostName() {
    return SyslogFieldKeys.HEADER_HOSTNAME.getField();
  }

  @Override
  public String getHeaderPriority() {
    return SyslogFieldKeys.HEADER_PRI.getField();
  }

  @Override
  public String getHeaderSeverity() {
    return SyslogFieldKeys.HEADER_PRI_SEVERITY.getField();
  }

  @Override
  public String getHeaderFacility() {
    return SyslogFieldKeys.HEADER_PRI_FACILITY.getField();
  }

  @Override
  public String getHeaderProcessId() {
    return SyslogFieldKeys.HEADER_PROCID.getField();
  }

  @Override
  public String getHeaderTimeStamp() {
    return SyslogFieldKeys.HEADER_TIMESTAMP.getField();
  }

  @Override
  public String getHeaderMessageId() {
    return SyslogFieldKeys.HEADER_MSGID.getField();
  }

  @Override
  public String getHeaderVersion() {
    return SyslogFieldKeys.HEADER_VERSION.getField();
  }

  @Override
  public String getStructuredBase() {
    return SyslogFieldKeys.STRUCTURED_BASE.getField();
  }

  @Override
  public String getStructuredElementIdFormat() {
    return SyslogFieldKeys.STRUCTURED_ELEMENT_ID_FMT.getField();
  }

  @Override
  public String getStructuredElementIdParamNameFormat() {
    return SyslogFieldKeys.STRUCTURED_ELEMENT_ID_PNAME_FMT.getField();
  }

  @Override
  public Pattern getStructuredElementIdParamNamePattern() {
    return STRUCTURED_ELEMENT_ID_PNAME_PATTERN;
  }
}
