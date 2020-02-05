package com.programapprentice.app.hard;

import org.junit.Test;

public class SplitArrayLargestSum410_T {
  SplitArrayLargestSum410 solution = new SplitArrayLargestSum410();

  @Test
  public void test1() {
    int[] nums = {7,2,5,10,8};
    System.out.println(solution.splitArray(nums, 2));
  }

  @Test
  public void test2() {
    int[] nums = {7,2,5,10,8};
    System.out.println(solution.splitable(nums,14, 2));
  }
}
