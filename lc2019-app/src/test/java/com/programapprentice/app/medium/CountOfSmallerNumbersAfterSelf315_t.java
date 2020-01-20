package com.programapprentice.app.medium;

import com.programapprentice.app.hard.CountOfSmallerNumbersAfterSelf315;
import org.junit.Test;

import java.util.List;

public class CountOfSmallerNumbersAfterSelf315_t {
  CountOfSmallerNumbersAfterSelf315 solution = new CountOfSmallerNumbersAfterSelf315();

  @Test
  public void test1() {
    int[] nums = {5,2,6,1};
    List<Integer> result = solution.countSmaller(nums);
    for(Integer i : result) {
      System.out.print(i + "  \t");
    }
    System.out.println();
  }
}
