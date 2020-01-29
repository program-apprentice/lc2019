package com.programapprentice.app.hard;

import java.util.HashMap;
import java.util.Map;

public class PerfectRectangle391 {
  public boolean isRectangleCover(int[][] rectangles) {
    if (rectangles == null || rectangles.length == 0 || rectangles[0].length == 0) {
      return false;
    }

    Map<String, Integer> map = new HashMap<>();

    int area = 0;
    int minX = Integer.MAX_VALUE;
    int maxX = Integer.MIN_VALUE;
    int minY = Integer.MAX_VALUE;
    int maxY = Integer.MIN_VALUE;

    for(int[] rect : rectangles) {
      minX = Math.min(minX, rect[0]);
      minY = Math.min(minY, rect[1]);
      maxX = Math.min(maxX, rect[2]);
      maxY = Math.min(maxY, rect[3]);
      area += (rect[2]-rect[0]) * (rect[3] - rect[1]);

      if (!isValid(map, toString(rect[0], rect[1]), 1)) {
        return false;
      }

      if (!isValid(map, toString(rect[0], rect[3]), 2)) {
        return false;
      }

      if (!isValid(map, toString(rect[2], rect[3]), 4)) {
        return false;
      }

      if (!isValid(map, toString(rect[2], rect[1]), 8)) {
        return false;
      }
    }

    int counter = 0;
    for(String key : map.keySet()) {
      int value = map.get(key);
      if (value != 15 && value != 12 && value != 10 && value != 9 && value != 6 && value != 5 && value != 3) {
        counter++;
      }
    }

    return counter == 4 && area == (maxX - minX) * (maxY - minY);
  }

  private String toString(int x, int y) {
    return String.format("%d_%d", x, y);
  }

  private boolean isValid(Map<String, Integer> map, String corner, int type) {
    Integer counter = map.getOrDefault(corner, 0);
    if ((counter & type) == 0) {
      return false;
    }
    counter |= type;
    map.put(corner, counter);
    return true;
  }
}
