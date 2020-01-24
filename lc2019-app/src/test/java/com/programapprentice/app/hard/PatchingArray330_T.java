package com.programapprentice.app.hard;

import org.junit.Test;

public class PatchingArray330_T {
  PatchingArray330 solution = new PatchingArray330();

  @Test
  public void test1() {
    int[] nums = {1, 2, 4, 11, 30};
    int n = 50;
    int result = solution.minPatches(nums, n);
    System.out.println(result);
  }

  @Test
  public void test2() {
    int[] nums = {1, 3};
    int n = 6;
    int result = solution.minPatches(nums, n);
    System.out.println(result);
  }
}
