package com.github.palindromicity.syslog.util;

import com.github.palindromicity.syslog.KeyProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;

/**
 * This utility class takes a 'flattened' syslog map and un-flattens it.
 */
public class StructuredDataUtil {

  /**
   * Unflattens a flat map such that it contains any nested maps required.
   * @param flattenedMap the map to unflatten
   * @param keyProvider the key provider to use
   * @return Map
   */
  @SuppressWarnings("unchecked")
  public static Map<String, Object> unFlattenStructuredData(Map<String, Object> flattenedMap,
                                                            KeyProvider keyProvider) {
    Validate.notNull(keyProvider, "keyProvider");
    Validate.notNull(flattenedMap, "flattenedMap");
    boolean hasStructuredData = false;
    final Map<String, Object> returnMap = new HashMap<>();
    for (String key : flattenedMap.keySet()) {
      if (key.startsWith(keyProvider.getStructuredBase())) {
        hasStructuredData = true;
        break;
      }
    }

    if (!hasStructuredData) {
      return returnMap;
    }
    flattenedMap.forEach((key, value) -> {
      Matcher matcher = keyProvider.getStructuredElementIdParamNamePattern().matcher(key);
      if (matcher.matches()) {
        String id = matcher.group(1);
        String name = matcher.group(2);
        returnMap.putIfAbsent(id, new HashMap<>());
        Map<String, Object> idMap = (Map<String, Object>) returnMap.get(id);
        idMap.put(name, value);
      }
    });
    return returnMap;
  }
}
