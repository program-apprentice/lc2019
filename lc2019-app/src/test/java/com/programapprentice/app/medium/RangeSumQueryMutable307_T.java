package com.programapprentice.app.medium;

import org.junit.Test;

public class RangeSumQueryMutable307_T {
  RangeSumQueryMutable307 solution = new RangeSumQueryMutable307();

  @Test
  public void test1() {
    int[] nums = {3, 2, -1, 6, 5, 4, -3, 3, 7, 2, 3};
    RangeSumQueryMutable307.NumArray numArray = new RangeSumQueryMutable307.NumArray(nums);
    numArray.sumRange(3, 8);
  }

  @Test
  public void test2() {
    int x = 3;
    System.out.println("The number is " + x);
    System.out.println(Integer.toBinaryString(x));
    System.out.println(Integer.toBinaryString(0-x));
    System.out.println(Integer.toBinaryString(x&(-x)));

    x = 4;
    System.out.println("The number is " + x);
    System.out.println(Integer.toBinaryString(x));
    System.out.println(Integer.toBinaryString(0-x));
    System.out.println(Integer.toBinaryString(x&(-x)));

    x = 8;
    System.out.println("The number is " + x);
    System.out.println(Integer.toBinaryString(x));
    System.out.println(Integer.toBinaryString(0-x));
    System.out.println(Integer.toBinaryString(x&(-x)));

    x = 5;
    System.out.println("The number is " + x);
    System.out.println(Integer.toBinaryString(x));
    System.out.println(Integer.toBinaryString(0-x));
    System.out.println(Integer.toBinaryString(x&(-x)));

    x = 11;
    System.out.println("The number is " + x);
    System.out.println(Integer.toBinaryString(x));
    System.out.println(Integer.toBinaryString(0-x));
    System.out.println(Integer.toBinaryString(x&(-x)));
  }

  @Test
  public void test3() {
    System.out.println(getNext(5));
    System.out.println(getParent(5));
  }

  private int getNext(int x) {
    return x + (x & (-x));
  }

  private int getParent(int x) {
    return x - (x & (-x));
  }
}
