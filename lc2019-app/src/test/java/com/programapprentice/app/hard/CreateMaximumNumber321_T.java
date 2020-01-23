package com.programapprentice.app.hard;

import org.junit.Test;

import java.util.Arrays;

public class CreateMaximumNumber321_T {
  CreateMaximumNumber321 solution = new  CreateMaximumNumber321();

  @Test
  public void test1() {
    int[] num1 = {3,4,6,5};
    int[] num2 = {9,1,2,5,8,3};
    int k = 5;
    int[] result = solution.maxNumber(num1, num2, k);
    System.out.println(Arrays.toString(result));
  }

  @Test
  public void test2() {
    int[] num1 = {6, 7};
    int[] num2 = {6, 0, 4};
    int k = 5;
    int[] result = solution.maxNumber(num1, num2, k);
    System.out.println(Arrays.toString(result));
  }

  @Test
  public void test3() {
    int[] num1 = {2,5,6,4,4,0};
    int[] num2 = {7,3,8,0,6,5,7,6,2};
    int k = 15; //[7,3,8,2,5,6,4,4,0,6,5,7,6,2,0]
    int[] result = solution.maxNumber(num1, num2, k);
    System.out.println(Arrays.toString(result));
  }

  @Test
  public void test4() {
    int[] num1 = {7,6,1,9,3,2,3,1,1};
    int[] num2 = {4,0,9,9,0,5,5,4,7};
    int k = 9; //[9,9,9,7,3,2,3,1,1]
    int[] result = solution.maxNumber(num1, num2, k);
    System.out.println(Arrays.toString(result));
  }

  @Test
  public void test5() {
    int[] num1 = {3,2,3,1,1};
    int[] num2 = {0,5,5,4,7};
    int k = 6; //[9,9,9,7,3,2,3,1,1]
    int[] result = solution.maxNumber(num1, num2, k);
    System.out.println(Arrays.toString(result));
  }

  @Test
  public void test6() {
    int[] num2 = {0,5,5,4,7};
    int k = 2; //[9,9,9,7,3,2,3,1,1]
    int[] result = solution.generateMax(num2, k);
    System.out.println(Arrays.toString(result));
  }
}
