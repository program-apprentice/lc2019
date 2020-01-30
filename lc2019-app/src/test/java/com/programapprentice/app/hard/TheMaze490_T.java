package com.programapprentice.app.hard;

import com.programapprentice.app.medium.TheMaze490;
import org.junit.Test;

public class TheMaze490_T {
  TheMaze490 solution = new TheMaze490();

  @Test
  public void test1() {
    int[][] maze = {
        {0,0,0,0,1,0,0},
        {0,0,1,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,1},
        {0,1,0,0,0,0,0},
        {0,0,0,1,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,1,0,0,0,1},
        {0,0,0,0,1,0,0}};
    int[] start = {0, 0};
    int[] hole = {8,6};
    boolean result = solution.hasPath(maze, start, hole);
    System.out.println(result);
  }
}
