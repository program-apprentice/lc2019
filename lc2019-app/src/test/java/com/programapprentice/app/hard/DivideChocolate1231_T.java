package com.programapprentice.app.hard;

import org.junit.Assert;
import org.junit.Test;

public class DivideChocolate1231_T {
  DivideChocolate1231 solution = new DivideChocolate1231();

  @Test
  public void test1() {
    int[] sweetness = {1,2,3,4,5,6,7,8,9};
    int k = 5;
    int result = solution.maximizeSweetness(sweetness, k);
    Assert.assertEquals(6, result);
    System.out.println(result);
  }

  @Test
  public void test2() {
    int[] sweetness = {5,6,7,8,9,1,2,3,4};
    int k = 8;
    int result = solution.maximizeSweetness(sweetness, k);
    Assert.assertEquals(1, result);
    System.out.println(result);
  }

  @Test
  public void test3() {
    int[] sweetness = {1,2,2,1,2,2,1,2,2};
    int k = 2;
    int result = solution.maximizeSweetness(sweetness, k);
    Assert.assertEquals(5, result);
    System.out.println(result);
  }
}
