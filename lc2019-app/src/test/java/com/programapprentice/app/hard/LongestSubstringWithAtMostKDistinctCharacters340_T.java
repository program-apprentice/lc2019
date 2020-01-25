package com.programapprentice.app.hard;

import org.junit.Test;

public class LongestSubstringWithAtMostKDistinctCharacters340_T {
  LongestSubstringWithAtMostKDistinctCharacters340 solution = new LongestSubstringWithAtMostKDistinctCharacters340();

  @Test
  public void test1() {
    String s = "eceba";
    int k = 2;
    int result = solution.lengthOfLongestSubstringKDistinct(s, k);
    System.out.println(result);
  }
}
