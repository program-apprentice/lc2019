package com.programapprentice.app.hard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringTransformsIntoAnotherString1153 {
  public boolean canConvert(String str1, String str2) {
    // Build conversion map
    Map<Character, Character> convertMap = new HashMap<>();
    Set<Character> s1 = new HashSet<>();
    Set<Character> s2 = new HashSet<>();
    for(int i = 0; i < str1.length(); i++) {
      char c1 = str1.charAt(i);
      char c2 = str2.charAt(i);

      if (convertMap.containsKey(c1) && convertMap.get(c1) != c2) {
        return false;
      }
      convertMap.put(c1, c2);
      s1.add(c1);
      s2.add(c2);
    }
    if (s1.size() < s2.size()) {
      return false;
    }
    if (s1.size() > s2.size()) {
      return true;
    }
    if (s2.size() == 26) {
      return str1.equals(str2);
    }
    return true;
  }


}
