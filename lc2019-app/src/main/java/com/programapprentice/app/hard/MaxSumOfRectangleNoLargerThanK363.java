package com.programapprentice.app.hard;

public class MaxSumOfRectangleNoLargerThanK363 {
  public int maxSumSubmatrix(int[][] matrix, int k) {
    int height = matrix.length;
    int width = matrix[0].length;
    int[][] preSum = new int[height][width];
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < height; i++) {
      for(int j = 0; j < width; j++) {
        int cur = matrix[i][j];
        preSum[i][j] = cur;
        if (i > 0) {
          preSum[i][j] += preSum[i-1][j];
        }
        if (j > 0) {
          preSum[i][j] += preSum[i][j-1];
        }
        if (i > 0 && j > 0) {
          preSum[i][j] -= preSum[i-1][j-1];
        }
        for(int r = 0; r <= i; r++) {
          for(int c = 0; c <= j; c++) {
            int sum = preSum[i][j];
            if (r > 0) {
              sum -= preSum[r-1][j];
            }
            if (c > 0) {
              sum -= preSum[i][c-1];
            }
            if (r > 0 && c > 0) {
              sum += preSum[r-1][c-1];
            }
            if (sum <= k) {
              max = Math.max(sum, max);
            }
          }
        }
      }
    }
    return max;
  }
}
