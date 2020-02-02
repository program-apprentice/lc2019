package com.programapprentice.app.hard;

import org.junit.Test;

public class KEmptySlots683_T {
  KEmptySlots683 solution = new KEmptySlots683();

  @Test
  public void test1() {
    int[] flowers = {1, 3, 2};
    int k = 1;
    int result = solution.kEmptySlots(flowers, k);
    System.out.println(result);
  }
}
