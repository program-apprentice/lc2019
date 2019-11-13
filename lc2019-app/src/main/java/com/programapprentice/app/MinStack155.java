package com.programapprentice.app;

import java.util.Stack;

public class MinStack155 {
  class MinStack {
    Stack<Integer> minStack;
    Stack<Integer> normalStack;
    /** initialize your data structure here. */
    public MinStack() {
      minStack = new Stack<Integer>();
      normalStack = new Stack<Integer>();
    }

    public void push(int x) {
      normalStack.push(x);
      if (minStack.isEmpty() || x <= minStack.peek()) {
        minStack.push(x);
      }
    }

    public void pop() {
      if (normalStack.isEmpty()) {
        return;
      }
      int x = normalStack.pop();
      if (x == minStack.peek().intValue()) {
        minStack.pop();
      }
    }

    public int top() {
      if (normalStack.isEmpty()) {
        return -1;
      }
      return normalStack.peek();
    }

    public int getMin() {
      return minStack.peek();
    }
  }

}
