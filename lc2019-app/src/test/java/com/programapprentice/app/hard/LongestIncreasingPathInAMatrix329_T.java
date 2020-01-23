package com.programapprentice.app.hard;

import org.junit.Test;

public class LongestIncreasingPathInAMatrix329_T {
  LongestIncreasingPathInAMatrix329 solution = new LongestIncreasingPathInAMatrix329();

  @Test
  public void test1() {
    int[][] matrix =
        {{9,9,4},
        {6,6,8},
        {2,1,1}};
    int result = solution.longestIncreasingPath(matrix);
    System.out.println(result);
  }
}
