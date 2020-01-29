package com.programapprentice.app.hard;

import java.awt.image.PackedColorModel;
import java.util.HashMap;
import java.util.Map;

public class OptimalAccountBalancing465 {

  int counter = 0;

  public int minTransfers(int[][] transactions) {
    Map<Integer, Long> balanceMap = new HashMap<>();
    for(int[] transaction : transactions) {
      Long value = balanceMap.getOrDefault(transaction[0], 0L);
      balanceMap.put(transaction[0], value - transaction[2]);
      value = balanceMap.getOrDefault(transaction[1], 0L);
      balanceMap.put(transaction[1], value + transaction[2]);
    }

    long[] balance = new long[balanceMap.keySet().size()];
    int i = 0;
    for(Integer key : balanceMap.keySet()) {
      balance[i] = balanceMap.get(key);
      i++;
    }
    helper(0, balance);
    return counter;
  }

  private void helper(int startIdx, long[] balance) {
    int len = balance.length;

    while(startIdx < len && balance[startIdx] == 0) {
      startIdx++;
    }

    for(int i = startIdx + 1; i < len; i++) {
      if ((balance[i] < 0 && balance[startIdx] > 0) || (balance[i] > 0 && balance[startIdx] < 0)) {
        balance[i] += balance[startIdx];
        counter += 1;
        helper(startIdx+1, balance);
        balance[i] += balance[startIdx];
      }
    }
  }
}
