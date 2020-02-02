package com.programapprentice.app.hard;

import java.util.TreeMap;

public class OddEvenJUmp975 {
  //dp[i][0] stands for you can arrive index n - 1 starting from index i at an odd step.
  //dp[i][1] stands for you can arrive index n - 1 starting from index i at an even step.
  public int oddEvenJumps(int[] A) {
    int n = A.length;
    boolean[][] dp = new boolean[A.length][2];
    dp[n-1][0] = true;
    dp[n-1][1] = true;
    TreeMap<Integer, Integer> valueToIdxMap = new TreeMap<>();
    valueToIdxMap.put(A[n-1], n-1);
    int result = 1;
    for(int i = n-2; i >= 0; i--) {
      // Odd number
      Integer nextGreater = valueToIdxMap.ceilingKey(A[i]);
      if (nextGreater != null) {
        dp[i][0] = dp[valueToIdxMap.get(nextGreater)][1];
      }
      Integer nextSmaller = valueToIdxMap.floorKey(A[i]);
      if (nextSmaller != null) {
        dp[i][1] = dp[valueToIdxMap.get(nextSmaller)][0];
      }
      valueToIdxMap.put(A[i], i);
      result += dp[i][0] ? 1 : 0;
    }
    return result;
  }
}
