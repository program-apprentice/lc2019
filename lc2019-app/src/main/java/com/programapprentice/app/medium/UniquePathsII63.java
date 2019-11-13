package com.programapprentice.app.medium;

public class UniquePathsII63 {
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
      return 0;
    }
    int width = obstacleGrid[0].length;
    int[] opt = new int[width];
    opt[0] = 1;
    for(int[] row : obstacleGrid) {
      for (int col = 0; col < width; col++) {
        if (row[col] == 1) {
          opt[col] = 0;
        } else if (col > 0){
          opt[col] += opt[col-1];
        }
      }
    }
    return opt[width-1];
  }
}
