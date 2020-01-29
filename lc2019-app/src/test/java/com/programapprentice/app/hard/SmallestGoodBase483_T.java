package com.programapprentice.app.hard;

import org.junit.Test;

public class SmallestGoodBase483_T {
  SmallestGoodBase483 solution = new SmallestGoodBase483();

  @Test
  public void test1() {
    String num = "13";
    System.out.println(solution.smallestGoodBase(num));
  }

  @Test
  public void test2() {
    String num = "15";
    System.out.println(solution.smallestGoodBase(num));
  }
}
