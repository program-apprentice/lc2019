package com.programapprentice.app.hard;

public class LongestIncreasingPathInAMatrix329 {
  private int[][] directions = {
      {-1, 0}, // up
      {1, 0}, // down
      {0, -1}, // left
      {0, 1}}; // right

  public int longestIncreasingPath(int[][] matrix) {
    if(matrix.length == 0) {
      return 0;
    }
    int height = matrix.length;
    int width = matrix[0].length;
    int[][] cache = new int[height][width];
    int max = 0;
    for (int row = 0; row < height; row++) {
      for (int col = 0; col < width; col++) {
        dfs(matrix, row, col, cache);
      }
    }
    for (int row = 0; row < height; row++) {
      for (int col = 0; col < width; col++) {
        max = Math.max(max, cache[row][col]);
      }
    }
    return max;
  }

  private boolean isValid(int height, int width, int row, int col) {
    return row >= 0 && row < height && col >= 0 && col < width;
  }

  private int dfs(int[][] matrix, int row, int col, int[][] cache) {
    System.out.println(String.format("row: %d, col: %d", row, col));
    if (cache[row][col] != 0) {
      return cache[row][col];
    }

    int max = 1;
    for(int[] direction : directions) {
      int newRow = row + direction[0];
      int newCol = col + direction[1];
      if (isValid(matrix.length, matrix[0].length, newRow, newCol)) {
        if (matrix[newRow][newCol] > matrix[row][col]) {
          int len = 1 + dfs(matrix, newRow, newCol, cache);
          max = Math.max(max, len);
        }
      }
    }

    cache[row][col] = max;

    return max;
  }
}
