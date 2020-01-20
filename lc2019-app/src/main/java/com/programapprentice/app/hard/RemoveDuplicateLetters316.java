package com.programapprentice.app.hard;


import java.util.Stack;

public class RemoveDuplicateLetters316 {
  public String removeDuplicateLetters(String s) {
    int[] counters = new int[26];
    boolean[] visited = new boolean[26];

    for (char c : s.toCharArray()) {
      counters[c-'a'] += 1;
    }

    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (stack.isEmpty()) {
        stack.push(c);
        visited[c-'a'] = true;
        counters[c-'a'] -= 1;
        continue;
      }
      if (visited[c-'a']) {
        counters[c-'a'] -= 1;
        continue;
      }

      while (!stack.isEmpty() && stack.peek() > c && counters[stack.peek()-'a'] > 0) {
        char top = stack.peek();
        stack.pop();
        visited[top - 'a'] = false;
      }
      stack.push(c);
      counters[c-'a'] -= 1;
      visited[c-'a'] = true;
    }

    StringBuilder sb = new StringBuilder();
    while(!stack.isEmpty()) {
      sb.insert(0, stack.pop());
    }
    return sb.toString();
  }
}
