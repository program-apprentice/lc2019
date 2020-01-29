package com.programapprentice.app.hard;

import org.junit.Test;

public class SlidingWindowMedian480_T {
  SlidingWindowMedian480 solution = new SlidingWindowMedian480();

  @Test
  public void test1() {
    int[] nums = {1,3,-1,-3,5,3,6,7};
    int k = 3;
    double[] result = solution.medianSlidingWindow(nums, k);
    for(double num : result) {
      System.out.print(num + "   ");
    }
  }

  @Test
  public void test2() {
    int[] nums = {1,4,2,3};
    int k = 4;
    double[] result = solution.medianSlidingWindow(nums, k);
    for(double num : result) {
      System.out.print(num + "   ");
    }
  }
}
