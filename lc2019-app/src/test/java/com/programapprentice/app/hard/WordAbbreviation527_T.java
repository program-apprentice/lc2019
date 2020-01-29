package com.programapprentice.app.hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class WordAbbreviation527_T {
  WordAbbreviation527 solution = new WordAbbreviation527();

  @Test
  public void test1() {
    String[] strs = {"like", "god", "internal", "me", "internet", "interval", "intension", "face", "intrusion"};
    List<String> result = solution.wordsAbbreviation(Arrays.asList(strs));
    for(String s : result) {
      System.out.println(s);
    }
  }
}
