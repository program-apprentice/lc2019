package com.programapprentice.app.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf315 {

  public int insert(List<Integer> list, int num) {
    int low = 0;
    int high = list.size();
    while(low < high) {
      int mid = low + (high - low) / 2;
      if (list.get(mid) >= num) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    list.add(high, num);
    return high;
  }

  public List<Integer> countSmaller(int[] nums) {
    if (nums == null || nums.length == 0) {
      return new ArrayList<>();
    }

    int len = nums.length;
    List<Integer> result = Arrays.asList(new Integer[len]);
    List<Integer> temp = new ArrayList<>();
    for (int i = len-1; i>= 0; i--) {
      result.set(i,insert(temp, nums[i]));
    }
    return result;
  }
}
