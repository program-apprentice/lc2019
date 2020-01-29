package com.programapprentice.app.hard;

import org.junit.Test;

public class FreedomTrain514_T {
  FreedomTrain514 solution = new FreedomTrain514();

  @Test
  public void test1() {
    String ring = "godding";
    String key = "gd";
    System.out.println(solution.findRotateSteps(ring, key));
  }
}
