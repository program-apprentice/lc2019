package com.programapprentice.app.hard;

import org.junit.Test;

public class OptimalAccountBalancing465_T {
  OptimalAccountBalancing465 solution = new OptimalAccountBalancing465();

  @Test
  public void test1() {
    int[][] transaction = {{0,1,10}, {2,0,5}};
    int result = solution.minTransfers(transaction);
    System.out.println(result);
  }
}
