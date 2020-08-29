package com.github.palindromicity.syslog.util;

/**
 * Utility class to validate arguments and the like.
 */
public class Validate {

  /**
   * Validate that an {@code Object} is not {@code Null}.
   *
   * @param object The object to validate
   * @param name   the name to use in the thrown exception
   * @throws IllegalArgumentException if object is null
   */
  public static void notNull(Object object, String name) {
    if (object == null) {
      throw new IllegalArgumentException(String.format("%s cannot be null", name));
    }
  }

  /**
   * Validate that an {@code String} is not {@code Null} or empty.
   *
   * @param string The String to validate
   * @param name   the name to use in the thrown exception
   * @throws IllegalArgumentException if string is null or empty
   */
  public static void notBlank(String string, String name) {
    if (string == null || string.isEmpty() || string.trim().isEmpty()) {
      throw new IllegalArgumentException(String.format("%s cannot be null", name));
    }
  }

}
