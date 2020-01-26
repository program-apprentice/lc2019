package com.programapprentice.app.hard;

import java.util.Arrays;
import java.util.Comparator;

public class RussianDollEnvelopes354 {

  private boolean isContainable(int[] big, int[] small) {
    return big[0] > small[0] && big[1] > small[1];
  }


  public int maxEnvelopes(int[][] envelopes) {
    if (envelopes == null || envelopes.length == 0) {
      return 0;
    }
    int len = envelopes.length;
    int max = 1;
    int[] opt = new int[len];
    for(int i = 0; i < len; i++) {
      opt[i] = 1;
    }

    Arrays.sort(envelopes, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        if (o1[0] == o2[0]) {
          return o1[1] - o2[1];
        } else {
          return o1[0] - o2[0];
        }
      }
    });

    for(int i = 0; i < len; i++) {
      int[] envelop = envelopes[i];
      for(int j = 0; j < i; j++) {
        int[] other = envelopes[j];
        if (isContainable(envelop, other)) {
          opt[i] = Math.max(opt[i], opt[j]+1);
          max = Math.max(opt[i], max);
        }
      }
    }
    return max;
  }
}
