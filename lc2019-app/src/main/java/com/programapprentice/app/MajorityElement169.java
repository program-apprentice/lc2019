package com.programapprentice.app;

public class MajorityElement169 {
  public int majorityElement(int[] nums) {
    if (nums == null || nums.length == 0) {
      return -1;
    }
    int counter = 1;
    int candidate = nums[0];
    for(int i = 1; i < nums.length; i++) {
      int cur = nums[i];
      if (candidate != cur) {
        counter--;
        if (counter == 0) {
          candidate = cur;
          counter = 1;
        }
      } else {
        counter++;
      }
    }
    return candidate;
  }
}
