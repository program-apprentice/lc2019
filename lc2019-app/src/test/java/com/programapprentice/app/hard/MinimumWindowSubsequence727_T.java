package com.programapprentice.app.hard;

import org.junit.Test;

public class MinimumWindowSubsequence727_T {
  MinimumWindowSubsequence727 solution = new MinimumWindowSubsequence727();

  @Test
  public void test1() {
    String s = "abcdebdde";
    String t = "bde";
    System.out.println(solution.minWindow(s,t));
  }

  @Test
  public void test2() {
    String s = "nkzcnhczmccqouqadqtmjjzltgdzthm";
    String t = "bt";
    System.out.println(solution.minWindow(s,t));
  }
}
