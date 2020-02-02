package com.programapprentice.app.hard;

import org.junit.Test;

public class FindMedianFromDataStream295_T {

  @Test
  public void test1() {
    FindMedianFromDataStream295.MedianFinder finder = new FindMedianFromDataStream295.MedianFinder();
    finder.addNum(1);
    finder.addNum(2);
    System.out.println(finder.findMedian());
    finder.addNum(3);
    System.out.println(finder.findMedian());
  }

  @Test
  public void test2() {
    FindMedianFromDataStream295.MedianFinder finder = new FindMedianFromDataStream295.MedianFinder();
    finder.addNum(6);
    System.out.println(finder.findMedian());
    finder.addNum(10);
    System.out.println(finder.findMedian());
    finder.addNum(2);
    System.out.println(finder.findMedian());
    finder.addNum(6);
    System.out.println(finder.findMedian());
    finder.addNum(5);
    System.out.println(finder.findMedian());
    finder.addNum(0);
    System.out.println(finder.findMedian());
    finder.addNum(6);
    System.out.println(finder.findMedian());
    finder.addNum(3);
    System.out.println(finder.findMedian());
    finder.addNum(1);
    System.out.println(finder.findMedian());
    finder.addNum(0);
    System.out.println(finder.findMedian());
    finder.addNum(0);
    System.out.println(finder.findMedian());
  }
}
