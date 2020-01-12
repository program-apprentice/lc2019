package com.programapprentice.app.medium;

import org.junit.Test;

import java.util.Arrays;

public class LongestStrChain1024_T {
  LongestStringChain1048 solution = new LongestStringChain1048();

  @Test
  public void test1() {
    String[] words = {"a","b","ba","bca","bda","bdca"};
    int result = solution.longestStrChain(words);
    System.out.println(result);
  }
}
