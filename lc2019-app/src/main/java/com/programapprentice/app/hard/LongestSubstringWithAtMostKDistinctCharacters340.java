package com.programapprentice.app.hard;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinctCharacters340 {
  public int lengthOfLongestSubstringKDistinct(String s, int k) {
    Map<Character, Integer> map = new HashMap<>();
    int max = 0;
    int left = 0;
    for(int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int counter = map.containsKey(c) ? map.get(c) + 1 : 1;
      map.put(c, counter);
      while(map.keySet().size() > k) {
        char leftChar = s.charAt(left);
        map.put(leftChar, map.get(leftChar)-1);
        if (map.get(leftChar) == 0) {
          map.remove(leftChar);
        }
        left++;
      }
      max = Math.max(max, i - left + 1);
    }
    return max;
  }
}
