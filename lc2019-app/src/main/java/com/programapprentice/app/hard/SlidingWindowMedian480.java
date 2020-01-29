package com.programapprentice.app.hard;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SlidingWindowMedian480 {
  PriorityQueue<Integer> minHeap = new PriorityQueue<>();
  PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
      return o2.compareTo(o1);
    }
  });

  public double[] medianSlidingWindow(int[] nums, int k) {
    double[] result = new double[nums.length-k+1];
    for(int i = 0; i < nums.length; i++) {
      add(nums[i]);
      if(i >= k-1) {
        result[i-k+1] = getMedian();
        remove(nums[i-k+1]);
      }
    }
    return result;
  }

  private void balance() {
    if (maxHeap.size() > minHeap.size()) {
      minHeap.add(maxHeap.poll());
    }
    if (minHeap.size()-1 > maxHeap.size()) {
      maxHeap.add(minHeap.poll());
    }
  }
  private void add(int num) {
    if (num > getMedian()) {
      minHeap.add(num);
    } else {
      maxHeap.add(num);
    }
    balance();
  }

  private void remove(int num) {
    if (num < getMedian()) {
      maxHeap.remove(num);
    } else {
      minHeap.remove(num);
    }
    balance();
  }

  private double getMedian() {
    if (maxHeap.isEmpty() && minHeap.isEmpty()) {
      return 0;
    }

    if (maxHeap.size() == minHeap.size()) {
      return ((double)maxHeap.peek() + (double)minHeap.peek())/2.0;
    } else {
      return (double)minHeap.peek();
    }

  }
}
