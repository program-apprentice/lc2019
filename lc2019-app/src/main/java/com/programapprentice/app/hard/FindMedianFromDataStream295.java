package com.programapprentice.app.hard;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FindMedianFromDataStream295 {
  public static class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    /** initialize your data structure here. */
    public MedianFinder() {
      minHeap = new PriorityQueue<>();
      maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
      if (findMedian() == null) {
        minHeap.add(num);
        return;
      }
      if (num > findMedian()) {
        minHeap.add(num);
      } else {
        maxHeap.add(num);
      }
      balance();
    }

    public Double findMedian() {
      if(minHeap.isEmpty() && maxHeap.isEmpty()) {
        return null;
      }
      if (minHeap.size() == maxHeap.size()) {
        return ((double)minHeap.peek()+ (double)maxHeap.peek())/2.0;
      }
      return (double)minHeap.peek();
    }

    private void balance() {
      if (maxHeap.size() > minHeap.size()) {
        minHeap.add(maxHeap.poll());
      }
      if (minHeap.size()-1 > maxHeap.size()) {
        maxHeap.add(minHeap.poll());
      }
    }
  }
}
