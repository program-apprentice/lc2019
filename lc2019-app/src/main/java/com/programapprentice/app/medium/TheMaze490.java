package com.programapprentice.app.medium;

import java.util.LinkedList;

public class TheMaze490 {
  class Point {
    int x,y;
    public Point(int _x, int _y) {x=_x;y=_y;}
  }
  int[][] dirs = new int[][] {
    {-1,0}, // up
    {1,0}, // down
    {0,1},// right
    {0,-1} // left
  };

  public boolean hasPath(int[][] maze, int[] start, int[] destination) {
    int h = maze.length;
    int w = maze[0].length;

    if (start[0] == destination[0] && start[1] == destination[1]) {
      return true;
    }

    boolean[][] visited = new boolean[h][w];
    LinkedList<Point> list = new LinkedList<>();
    visited[start[0]][start[1]] = true;
    list.add(new Point(start[0], start[1]));

    while(!list.isEmpty()) {
      Point p = list.poll();
      int x = p.x;
      int y = p.y;
      for(int[] dir : dirs) {
        int xx = x;
        int yy = y;
        while(isValid(xx,yy, h, w, maze)) {
          xx += dir[0];
          yy += dir[1];
        }
        xx -= dir[0];
        yy -= dir[1];
        if (visited[xx][yy]) {
          continue;
        }
        visited[xx][yy] = true;
        if (xx == destination[0] && yy == destination[1]) {
          return true;
        }
        list.offer(new Point(xx, yy));
      }
    }
    return false;
  }

  private boolean isValid(int row, int col, int h, int w, int[][] maze) {
    return row >= 0 && row < h && col >= 0 && col < w && maze[row][col] == 0;
  }
}
