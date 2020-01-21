package com.programapprentice.app.hard;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceFromAllBuildings317 {
  int min = Integer.MAX_VALUE;

  class Coordinate {
    int row;
    int column;
    Coordinate(int r, int c) {
      this.row = r;
      this.column = c;
    }
  }

  int[][] directions = { {-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // up, down, left, right

  public void bfs(int row, int column, int[][] grid, int[][] record, int[][] counter, int height, int width) {
    boolean[][] visited = new boolean[height][width];
    Queue<Coordinate> queue = new LinkedList<>();
    queue.add(new Coordinate(row, column));
    int[][] distance = new int[height][width];
    while(!queue.isEmpty()) {
      Coordinate coordinate = queue.remove();
      int curRow = coordinate.row;
      int curColumn = coordinate.column;
      for (int[] direction : directions) {
        int newRow = curRow + direction[0];
        int newColumn = curColumn + direction[1];
        if (newRow >= 0 && newRow < height && newColumn >= 0 && newColumn < width && grid[newRow][newColumn] == 0 && !visited[newRow][newColumn]) {
          visited[newRow][newColumn] = true;
          queue.add(new Coordinate(newRow, newColumn));
          distance[newRow][newColumn] = distance[curRow][curColumn] + 1;
          record[newRow][newColumn] += distance[newRow][newColumn];
          counter[newRow][newColumn] += 1;
        }
      }
    }

  }

  public int shortestDistance(int[][] grid) {
    int height = grid.length;
    int width = grid[0].length;
    int[][] record = new int[height][width];
    int[][] counter = new int[height][width];
    int numberOfBuilding = 0;
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if (grid[i][j] == 1) {
          bfs(i, j, grid, record, counter, height, width);
          numberOfBuilding ++;
        }
      }
    }
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if (grid[i][j] == 0 && record[i][j] != 0 && counter[i][j] == numberOfBuilding) {
          min = Math.min(min, record[i][j]);
        }
      }
    }
    return min == Integer.MAX_VALUE ? -1 : min;
  }
}
