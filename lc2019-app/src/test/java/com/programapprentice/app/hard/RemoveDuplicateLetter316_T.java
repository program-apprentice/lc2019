package com.programapprentice.app.hard;

import org.junit.Test;

public class RemoveDuplicateLetter316_T {
  RemoveDuplicateLetters316 solution = new RemoveDuplicateLetters316();

  @Test
  public void test1() {
    String s = "cbacdbc";
    String result = solution.removeDuplicateLetters(s);
    System.out.println(result);
  }

  @Test
  public void test2() {
    String s = "bcabc";
    String result = solution.removeDuplicateLetters(s);
    System.out.println(result);
  }

  @Test
  public void test3() {
    String s = "bbcaac";
    String result = solution.removeDuplicateLetters(s);
    System.out.println(result);
  }
}
