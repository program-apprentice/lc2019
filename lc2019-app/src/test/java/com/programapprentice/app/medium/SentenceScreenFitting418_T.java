package com.programapprentice.app.medium;

import org.junit.Assert;
import org.junit.Test;

public class SentenceScreenFitting418_T {
  SentenceScreenFitting418 solution = new SentenceScreenFitting418();

  @Test
  public void test1() {
    String[] sentences = {"a", "bcd", "e"};
    int result = solution.wordsTyping(sentences, 3,6);
    Assert.assertEquals(2, result);
  }

  @Test
  public void test2() {
    String[] sentences = {"a", "bcd", "e"};
    int result = solution.wordsTyping(sentences, 3,20);
    /*
    a bcd e a bcd e a
    bcd e a bcd e a bcd
    e a bcd e a bcd e a
    * */
    Assert.assertEquals(7, result);
  }
}
