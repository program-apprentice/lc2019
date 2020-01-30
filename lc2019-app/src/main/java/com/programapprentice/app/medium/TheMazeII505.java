package com.programapprentice.app.medium;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class TheMazeII505 {

  class Point {
    int x,y;
    int distance;
    public Point(int _x, int _y, int _l) {x=_x;y=_y;distance = _l;}
  }
  int[][] dirs = new int[][] {
      {-1,0}, // up
      {1,0}, // down
      {0,1},// right
      {0,-1} // left
  };

  private boolean isValid(int row, int col, int h, int w, int[][] maze) {
    return row >= 0 && row < h && col >= 0 && col < w && maze[row][col] == 0;
  }

  public int shortestDistance(int[][] maze, int[] start, int[] destination) {
    int h = maze.length;
    int w = maze[0].length;

    if (start[0] == destination[0] && start[1] == destination[1]) {
      return 0;
    }

    int[][] length= new int[h][w];
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        length[i][j] = Integer.MAX_VALUE;
      }
    }

    PriorityQueue<Point> list = new PriorityQueue<>(new Comparator<Point>() {
      @Override
      public int compare(Point o1, Point o2) {
        return o1.distance - o2.distance;
      }
    });
    list.add(new Point(start[0], start[1], 0));

    while(!list.isEmpty()) {
      Point p = list.poll();
      int x = p.x;
      int y = p.y;
      if (length[x][y] <= p.distance) {
        continue;
      }
      length[x][y] = p.distance;
      for(int[] dir : dirs) {
        int xx = x;
        int yy = y;
        int dist = p.distance;
        while(isValid(xx,yy, h, w, maze)) {
          xx += dir[0];
          yy += dir[1];
          dist += 1;
        }
        xx -= dir[0];
        yy -= dir[1];
        dist -= 1;
        list.offer(new Point(xx, yy, dist));
      }
    }
    return length[destination[0]][destination[1]] == Integer.MAX_VALUE ? -1 : length[destination[0]][destination[1]];
  }


}
