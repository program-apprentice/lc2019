package com.programapprentice.app.model;

public class Util {
  public static void print2Darray(int[][] result) {
    for(int r = 0; r < result.length; r++) {
      for(int c = 0; c < result[0].length; c++) {
        System.out.print(result[r][c] + "\t");
      }
      System.out.print("\n");
    }
  }

  public static void printarray(int[] result) {
    for(int r = 0; r < result.length; r++) {
      System.out.print(result[r] + "\t");
    }
    System.out.print("\n");
  }
}
