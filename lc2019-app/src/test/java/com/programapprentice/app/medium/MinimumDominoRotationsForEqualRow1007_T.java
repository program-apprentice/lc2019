package com.programapprentice.app.medium;

import org.junit.Assert;
import org.junit.Test;

public class MinimumDominoRotationsForEqualRow1007_T {
  MinimumDominoRotationsForEqualRow1007 solution = new MinimumDominoRotationsForEqualRow1007();

  @Test
  public void test1() {
    int[] A = {2,1,2,4,2,2};
    int[] B = {5,2,6,2,3,2};
    Assert.assertEquals(2, solution.minDominoRotations(A, B));
  }
}
