package com.programapprentice.app.medium;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSwapToMakeSequenceIncreasing801_T {
  MinimumSwapToMakeSequencesIncreasing801 solution = new MinimumSwapToMakeSequencesIncreasing801();

  @Test
  public void test1() {
    int[] A = {1, 3, 5, 4};
    int[] B = {1, 2, 3, 7};
    Assert.assertEquals(1, solution.minSwap(A, B));
  }
}
