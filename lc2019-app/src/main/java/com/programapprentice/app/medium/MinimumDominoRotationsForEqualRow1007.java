package com.programapprentice.app.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MinimumDominoRotationsForEqualRow1007 {
  private int findTarget(int[] A, int[] B) {
    int n = A.length;
    HashMap<Integer, Integer> numberToCount = new HashMap<>();
    for(int i = 0; i < n; i++) {
      numberToCount.put(A[i], numberToCount.getOrDefault(A[i], 0) + 1);
      numberToCount.put(B[i], numberToCount.getOrDefault(B[i], 0) + 1);
    }
    int candidate = -1;
    for(Integer key : numberToCount.keySet()) {
      int counter = numberToCount.get(key);
      if(counter >= n) {
        candidate = key;
        break;
      }
    }
    if (candidate == -1) {
      return -1;
    }
    for(int i = 0; i < n; i++) {
      if(A[i] == candidate && candidate == B[i]) {
        numberToCount.put(candidate, numberToCount.get(candidate)-1);
      }
    }
    if (numberToCount.get(candidate) == n) {
      return candidate;
    }
    return -1;
  }
  public int minDominoRotations(int[] A, int[] B) {
    int target = findTarget(A, B);
    if (target == -1) {
      return -1;
    }
    int n = A.length;
    int aIsSame = 0;
    int bIsSame = 0;
    for(int i = 0; i < n; i++) {
      if(A[i] != target) {
        if (B[i] == target) {
          aIsSame++;
        } else {
          return -1;
        }
      }
    }

    for(int i = 0; i < n; i++) {
      if(B[i] != target) {
        if (A[i] == target) {
          bIsSame++;
        } else {
          return -1;
        }
      }
    }
    return Math.min(aIsSame, bIsSame);
  }
}
