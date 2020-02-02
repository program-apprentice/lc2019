package com.programapprentice.app.hard;

import org.junit.Test;

public class ConfusingNumberII1088_T {
  ConfusingNumberII1088 solution = new ConfusingNumberII1088();

  @Test
  public void test1() {
    int n = 20;
    System.out.println(solution.confusingNumberII(n));

  }

  @Test
  public void test2() {
    int n = 100;
    System.out.println(solution.confusingNumberII(n));
  }

  @Test
  public void test3() {
    int n = 300;
    System.out.println(solution.confusingNumberII(n));
  }

}
