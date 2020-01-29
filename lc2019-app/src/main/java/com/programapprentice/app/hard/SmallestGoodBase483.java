package com.programapprentice.app.hard;

public class SmallestGoodBase483 {
  // This solution didn't pass
  public String smallestGoodBase(String num) {
    long n = Long.parseLong(num);
    for(int i = (int)(Math.log(n)/Math.log(2)); i >= 2; i--) {
      long left = 2;
      long right = (long)Math.pow(n, 1.0/(i-1)) + 1;
      while(left < right) {
        long mid = left + (right - left) / 2;
        long sum = 0;
        for(int j = 0; j < i; j++) {
          sum = sum * mid + 1;
        }
        if (sum == n) {
          return Long.toString(mid);
        }
        if (sum < n) {
          left = mid + 1;
        } else {
          right = mid;
        }
      }
    }
    return Long.toString(n-1);
  }
}
