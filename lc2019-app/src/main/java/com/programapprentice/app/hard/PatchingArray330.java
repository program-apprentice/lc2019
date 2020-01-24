package com.programapprentice.app.hard;

public class PatchingArray330 {
  public int minPatches(int[] nums, int n) {
    long miss = 1;
    int result = 0;
    int idx = 0;
    int len = nums.length;
    while (miss <= n) {
      if (idx < len && nums[idx] <= miss) {
        miss += nums[idx];
        idx++;
      } else {
        System.out.println("Add number: " + miss);
        miss += miss;
        result++;
      }
    }
    return result;
  }
}
