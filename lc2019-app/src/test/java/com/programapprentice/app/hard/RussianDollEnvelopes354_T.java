package com.programapprentice.app.hard;

import org.junit.Test;

public class RussianDollEnvelopes354_T {
  RussianDollEnvelopes354 solution = new RussianDollEnvelopes354();

  @Test
  public void test1() {
    int[][] envelopes = {{5,4},{6,4},{6,7},{2,3}};
    int result = solution.maxEnvelopes(envelopes);
    System.out.println(result);
  }


}
