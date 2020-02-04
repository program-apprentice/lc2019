package com.programapprentice.app.hard;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubmatricesThatSumToTarget1074 {
  public int numSubmatrixSumTarget(int[][] matrix, int target) {
    int height = matrix.length;
    int width = matrix[0].length;
    int[][] rowPresum = new int[height][width];

    // calculate row presum
    for(int i = 0; i < height; i++) {
      int sum = 0;
      for(int j = 0; j < width; j++) {
        sum += matrix[i][j];
        rowPresum[i][j] = sum;
      }
    }

    int counter = 0;

    for(int left = 0; left < width; left++) {
      for(int right = left; right < width; right++) {
        int[] rowRangeSum = new int[height];
        for(int row = 0; row < height; row++) {
          rowRangeSum[row] = rowPresum[row][right] - (left == 0 ? 0 : rowPresum[row][left-1]);
        }
        counter += countTarget(rowRangeSum, target);
      }
    }

    return counter;
  }

  private int countTarget(int[] rowRangeSum, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int sum = 0;
    int counter = 0;
    map.put(0, 1); // This means sum == target, directly count 1
    for(int i = 0; i < rowRangeSum.length; i++) {
      sum += rowRangeSum[i];
      counter += map.getOrDefault(sum - target, 0);
      map.compute(sum, (k, v)->{
        if(null == v) v = 0;
        return v+1;
      });
    }
    return counter;
  }
}
