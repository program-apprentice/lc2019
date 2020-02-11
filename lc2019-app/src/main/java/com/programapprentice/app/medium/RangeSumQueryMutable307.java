package com.programapprentice.app.medium;

public class RangeSumQueryMutable307 {
  public static class NumArray {
    int[] nums;
    int[] segmentSum;

    public NumArray(int[] nums) {
      this.nums = new int[nums.length];
      segmentSum = new int[nums.length+1];

      for(int i = 1; i <= nums.length; i++) {
        update(i-1, nums[i-1]);
      }
    }

    public void update(int i, int val) {
      int oldVal = this.nums[i];
      this.nums[i] = val;
      int diff = val - oldVal;
      i = i + 1;
      while(i <= nums.length) {
        segmentSum[i] += diff;
        i = getNext(i);
      }
    }

    public int sumRange(int i, int j) {
      return preSum(j) - preSum(i-1);
    }

    private int getNext(int x) {
      return x + (x & -x);
    }

    private int getParent(int x) {
      return x - (x & -x);
    }

    private int preSum(int i) {
      if(i < 0) {
        return 0;
      }
      int sum = 0;
      i = i+1;
      while(i != 0) {
        sum += segmentSum[i];
        i = getParent(i);
      }
      return sum;
    }
  }

}
