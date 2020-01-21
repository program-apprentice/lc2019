package com.programapprentice.app.hard;

import org.junit.Test;

public class ShortestDistanceFromAllBuildings317_T {
  ShortestDistanceFromAllBuildings317 solution = new ShortestDistanceFromAllBuildings317();

  @Test
  public void test1() {
    int[][] matrix = {{1,0,2,0,1},{0,0,0,0,0},{0,0,1,0,0}};
    int result = solution.shortestDistance(matrix);
    System.out.println(result);
  }

  @Test
  public void test2() {
    int[][] matrix = {{1,2, 0}};
    int result = solution.shortestDistance(matrix);
    System.out.println(result);
  }

  @Test
  public void test3() {
    int[][] matrix = {{0,2,1},{1,0,2},{0,1,0}};
    int result = solution.shortestDistance(matrix);
    System.out.println(result);
  }
}
