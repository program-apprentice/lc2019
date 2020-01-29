package com.programapprentice.app.hard;

import org.junit.Test;

public class EncodeStringWithShortestLength471_T {
  EncodeStringWithShortestLength471 solution = new EncodeStringWithShortestLength471();

  @Test
  public void test1() {
    String str = "aabcaabcd";
    System.out.println(solution.encode(str));
  }

  @Test
  public void test2() {
    String str = "abbbabbbcabbbabbbc";
    System.out.println(solution.encode(str));
  }


}
