package com.programapprentice.app.hard;

import org.junit.Test;

public class TheMazeIII499_T {
  TheMazeIII499 solution = new TheMazeIII499();

  @Test
  public void test1() {
    int[][] maze = {
        {0,0,0,0,0},
        {1,1,0,0,1},
        {0,0,0,0,0},
        {0,1,0,0,1},
        {0,1,0,0,0}};
    int[] ball= {4, 3};
    int[] hole = {0, 1};

    String result = solution.findShortestWay(maze, ball, hole);
    System.out.println(result);
  }
}
