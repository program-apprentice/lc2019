package com.programapprentice.app.hard;

public class SplitArrayLargestSum410 {

  public int splitArray(int[] nums, int m) {
    int low = Integer.MIN_VALUE;
    int high = 0;
    for(int i = 0; i < nums.length; i++) {
      low = Math.max(nums[i], low);
      high += nums[i];
    }
    if (m == nums.length) {
      return low;
    }
    if (m == 1) {
      return high;
    }

    while(low < high) {
      int mid = low + (high - low)/2;
      if(splitable(nums, mid, m)) {
        high = mid;
      } else {
        low = mid+1;
      }
    }
    return high;
  }

  public boolean splitable(int[] nums, int minLargestSum, int m) {
    int counter = 0;
    int tmpSum = 0;
    for(int i = 0; i < nums.length; i++) {
      tmpSum += nums[i];
      if (tmpSum > minLargestSum) {
        counter++;
        tmpSum = nums[i];
        if (counter >= m) {
          return false;
        }
      }
    }
    return true;
  }

  // solution 2 use DP
//  public int splitArray(int[] nums, int m) {
//    int[][] dp = new int [m][nums.length];
//
//    int sum = 0;
//    for(int i = 0; i < nums.length; i++) {
//      sum += nums[i];
//      dp[0][i] = sum;
//    }
//    if(m > 1) {
//      for (int i = 1; i < m; i++) {
//        for (int j = 0; j < nums.length; j++) {
//          dp[i][j] = Integer.MAX_VALUE;
//        }
//      }
//    }
//    int[] presum = new int[nums.length];
//    for(int i = 0; i < nums.length; i++) {
//      sum += nums[i];
//      presum[i] = sum;
//    }
//
//    for(int numOfSplit = 1; numOfSplit < m; numOfSplit++) {
//      for(int i = 0; i < nums.length; i++) {
//        for(int j = i+1; j < nums.length; j++) {
//          int largestSumTmp = Math.max(dp[numOfSplit-1][i], presum[j] - presum[i]);
//          dp[numOfSplit][j] = Math.min(dp[numOfSplit][j], largestSumTmp);
//        }
//      }
//    }
//    return dp[m-1][nums.length-1];
//  }
}
