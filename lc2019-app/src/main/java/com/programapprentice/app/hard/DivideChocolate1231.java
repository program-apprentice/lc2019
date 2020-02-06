package com.programapprentice.app.hard;

import com.programapprentice.app.model.Util;

public class DivideChocolate1231 {
  public int maximizeSweetness(int[] sweetness, int K) {
    int low = Integer.MAX_VALUE;
    int high = 0;
    for(int i = 0; i < sweetness.length; i++) {
      low = Math.min(low, sweetness[i]);
      high += sweetness[i];
    }

    while(low < high) {
      System.out.println(String.format("low is %d, high is %d", low, high));
      int mid = low + (high - low + 1) / 2;
      if (cutable(sweetness, mid, K+1)) {
        low = mid;
      } else {
        high = mid - 1;
      }
    }
    return high;
  }

  // the target is cutable means the chocolate can be cut that the minimum sub of array is
  // larger than target.
  public boolean cutable(int[] sweetness, int target, int k) {
    int counter = 0;
    int sum = 0;
    for(int i = 0; i < sweetness.length; i++) {
      sum += sweetness[i];
      if (sum >= target) {
        counter++;
        sum = 0;
      }
    }
    return counter >= k;
  }


  // Hit TLE
//  public int maximizeSweetness(int[] sweetness, int K) {
//    int[] presum = new int[sweetness.length];
//    int sum = 0;
//    for(int i = 0; i < sweetness.length; i++) {
//      sum += sweetness[i];
//      presum[i] = sum;
//    }
//
//    int[][] dp = new int[K+1][sweetness.length]; // Use K+1, because K cuts will have K+1 sub-array
//    for(int i = 0; i < sweetness.length; i++) {
//      dp[0][i] = presum[i]; // 0 means no cuts
//    }
//
//    for(int splitNum = 1; splitNum <= K; splitNum++) {
//      for(int i = 0; i < sweetness.length; i++) {
//        for(int j = i+1; j < sweetness.length; j++) {
//          int minSum = Math.min(dp[splitNum-1][i], presum[j]-presum[i]);
//          dp[splitNum][j] = Math.max(dp[splitNum][j], minSum);
//        }
//      }
////      System.out.println(String.format("splitNum = %d", splitNum));
////      Util.printarray(sweetness);
////      Util.print2Darray(dp);
//    }
//
//    return dp[K][sweetness.length-1];
//  }
}