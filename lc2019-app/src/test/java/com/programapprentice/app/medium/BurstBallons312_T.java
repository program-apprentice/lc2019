package com.programapprentice.app.medium;

import com.programapprentice.app.hard.BurstBallons312;
import org.junit.Test;

public class BurstBallons312_T {
  BurstBallons312 solution = new BurstBallons312();

  @Test
  public void test1() {
    int[] nums = {3, 1, 5, 8};
    int result = solution.maxCoins(nums);
    System.out.println(result);
  }
}
