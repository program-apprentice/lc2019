package com.programapprentice.app.easy;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII229 {
  public List<Integer> majorityElement(int[] nums) {
    List<Integer> result = new ArrayList<>();
    int candidate1 = 0;
    int candidate2 = 0;
    int counter1 = 0;
    int counter2 = 0;

    for(int num : nums) {
      if (num == candidate1) {
        counter1++;
      } else  if (num == candidate2) {
        counter2++;
      } else if (counter1 == 0) {
        counter1 = 1;
        candidate1 = num;
      } else if (counter2 == 0) {
        counter2 = 1;
        candidate2 = num;
      } else {
        counter1--;
        counter2--;
      }
    }
    counter1 = 0;
    counter2 = 0;

    for (int num : nums) {
      if (num == candidate1) {
        counter1++;
      } else if (num == candidate2) {
        counter2++;
      }
    }
    if (counter1 > (nums.length/3)) {
      result.add(candidate1);
    }
    if (counter2 > (nums.length/3)) {
      result.add(candidate2);
    }
    return result;
  }
}
