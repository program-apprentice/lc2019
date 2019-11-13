package com.programapprentice.app.medium;

public class UniquePaths62 {
  public int uniquePaths(int height, int width) {
    int[] opt = new int[width];
    opt[0] = 1;
    for(int row = 0; row < height; row++) {
      for(int col = 0; col < width; col++) {
        if (col != 0) {
          opt[col] += opt[col - 1];
        }
      }
    }
    return opt[width-1];
  }

}
