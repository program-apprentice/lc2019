package com.programapprentice.app.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals56 {
  public int[][] merge(int[][] intervals) {
    if (intervals == null || intervals.length < 1) {
      return intervals;
    }

    // Sort by starting point
    Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
    List<int[]> intervalArray = new ArrayList<>();
    int[] newInterval = intervals[0];
    for(int i = 1; i < intervals.length; i++) {
      int[] curInterval = intervals[i];
      if (newInterval[1] >= curInterval[0]) {
        newInterval[1] = Math.max(newInterval[1], curInterval[1]);
      } else {
        intervalArray.add(newInterval);
        newInterval = curInterval;
      }
    }
    intervalArray.add(newInterval);
    return intervalArray.toArray(new int[intervalArray.size()][]);
  }
}
