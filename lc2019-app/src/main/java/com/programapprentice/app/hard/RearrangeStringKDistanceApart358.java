package com.programapprentice.app.hard;

import java.util.*;

public class RearrangeStringKDistanceApart358 {
  public String rearrangeString(String s, int k) {
    Map<Character, Integer> charToCounter = new HashMap<>();
    for(char c : s.toCharArray()) {
      int counter = charToCounter.getOrDefault(c, 0);
      charToCounter.put(c, counter+1);
    }

    Queue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>() {
      @Override
      public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
        return o2.getValue() - o1.getValue();
      }
    });
    maxHeap.addAll(charToCounter.entrySet());

    Queue<Map.Entry<Character, Integer>> waitQueue = new LinkedList<>();

    StringBuilder rearrangedString = new StringBuilder();

    while(!maxHeap.isEmpty()) {
      Map.Entry<Character, Integer> current = maxHeap.poll();
      rearrangedString.append(current.getKey());
      current.setValue(current.getValue() - 1);
      waitQueue.offer(current);

      if (waitQueue.size() < k) {
        continue;
      }

      Map.Entry<Character, Integer> front = waitQueue.poll();
      if (front.getValue() > 0) {
        maxHeap.offer(front);
      }
    }

    return rearrangedString.length() == s.length() ? rearrangedString.toString() : "";
  }
}
