package com.programapprentice.app.hard;

import java.util.PriorityQueue;

public class TheMazeIII499 {

  class Point implements Comparable<Point> {
    int x, y, l;
    String s;
    public Point(int _x, int _y) { x = _x; y = _y; l = Integer.MAX_VALUE; s="";}
    public Point(int _x, int _y, int _l, String _s) { x = _x; y = _y; l = _l; s=_s;}
    public int compareTo(Point p) {return l == p.l ? s.compareTo(p.s) : l-p.l;}
  }
  int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
  String[] dirStrs = {"u", "d", "l", "r"};

  private boolean isValid(int row, int col, int h, int w, int[][] maze) {
    return row >= 0 && row < h && col >= 0 && col < w && maze[row][col] == 0;
  }

  public String findShortestWay(int[][] maze, int[] ball, int[] hole) {
    int height = maze.length;
    int width = maze[0].length;
    Point[][] record = new Point[height][width];
    for(int i = 0; i < height; i++) {
      for(int j = 0; j < width; j++) {
        record[i][j] = new Point(i, j);
      }
    }
    PriorityQueue<Point> list = new PriorityQueue<>();
    list.add(new Point(ball[0], ball[1], 0, ""));
    while(!list.isEmpty()) {
      Point p = list.poll();
      int x = p.x;
      int y = p.y;
      if (record[x][y].compareTo(p) <= 0) {
        // This point has been visited and has shorter distance
        continue;
      }
      record[p.x][p.y] = p; // update x,y point to the new point
      for(int i = 0; i < 4; i++) {
        int[] direction = directions[i];
        String dirStr = dirStrs[i];
        int xx = x;
        int yy = y;
        int ll = p.l;
        while(isValid(xx, yy, height, width, maze) && (xx!= hole[0] || yy != hole[1])) {
          xx += direction[0];
          yy += direction[1];
          ll += 1;
        }
        if (xx != hole[0] || yy != hole[1]) {
          xx -= direction[0];
          yy -= direction[1];
          ll -= 1;
        }
        list.add(new Point(xx, yy, ll, p.s + dirStr));
      }
    }
    return record[hole[0]][hole[1]].l == Integer.MAX_VALUE ? "impossible" : record[hole[0]][hole[1]].s;
  }
}
