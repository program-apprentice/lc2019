package com.programapprentice.app.hard;

import org.junit.Test;

public class StrobogrammaticNumberIII248_T {
  StrobogrammaticNumberIII248 solution = new StrobogrammaticNumberIII248();

  @Test
  public void test1() {
    String low = "50";
    String high = "100";
    int result = solution.strobogrammaticInRange(low, high);
    System.out.println(result);
  }

}
