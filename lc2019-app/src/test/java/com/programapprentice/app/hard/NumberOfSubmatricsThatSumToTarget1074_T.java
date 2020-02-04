package com.programapprentice.app.hard;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubmatricsThatSumToTarget1074_T {
  NumberOfSubmatricesThatSumToTarget1074 solution = new NumberOfSubmatricesThatSumToTarget1074();

  @Test
  public void test1() {
    int[][] matrix = {
        {0,1,0},
        {1,1,1},
        {0,1,0}};
    int target = 0;
    System.out.println(solution.numSubmatrixSumTarget(matrix, target));
  }
}
