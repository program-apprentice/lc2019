package com.programapprentice.app.hard;

import org.junit.Assert;
import org.junit.Test;

public class RangeSumQuery2DMutable308_T {
  @Test
  public void test1() {
    int[][] matrix = {
      {3, 0, 1, 4, 2},
      {5, 6, 3, 2, 1},
      {1, 2, 0, 1, 5},
      {4, 1, 0, 1, 7},
      {1, 0, 3, 0, 5}
    };
    RangeSumQuery2DMutable308.NumMatrix solution = new RangeSumQuery2DMutable308.NumMatrix(matrix);
    Assert.assertEquals(21, solution.sumRegion(0, 0, 2, 2));
  }
}
