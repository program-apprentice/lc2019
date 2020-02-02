package com.programapprentice.app.hard;

import java.util.TreeSet;

public class KEmptySlots683 {
  // Using tree set
  public int kEmptySlots(int[] flowers, int k) {
    TreeSet<Integer> treeSet = new TreeSet<>();
    for(int i = 0; i < flowers.length; i++) {
      int cur = flowers[i];
      Integer next = treeSet.higher(cur);
      if (next != null && next - cur == k+1) {
        return i+1;
      }
      Integer pre = treeSet.lower(cur);
      if (pre != null && cur - pre == k+1){
        return i+1;
      }
      treeSet.add(cur);
    }
    return -1;
  }
}
