package com.programapprentice.app.hard;

import java.util.HashMap;
import java.util.Map;

public class ConfusingNumberII1088 {
  /** The brute force solution
  Map<Integer, Integer> map;
  int N;
  int res;
  public int confusingNumberII(int N) {

    map = new HashMap<>();
    map.put(0, 0);
    map.put(1, 1);
    map.put(6, 9);
    map.put(8, 8);
    map.put(9, 6);
    res = 0;
    if (N == 1000000000) {
      res++;
      N--;
    }

    this.N = N;
    search(0, 0);
    return res;
  }

  private void search(int p, int cur) {
    System.out.println("cuyr is " + cur);
    if (p > 9 || cur > N) {
      return;
    }

    if (isConfusing(cur)) {
      res++;
    }
    for (Integer d : map.keySet()) {
      if (p == 0 && d == 0) {
        continue;
      }
      search(p + 1, cur * 10 + d); // construct the number
    }
  }

  private boolean isConfusing(int n) {
    System.out.println("n is " + n);
    long rot = 0;
    int tmp = n;
    while (n > 0) {
      rot = rot * 10 + map.get(n % 10);
      n /= 10;
    }
    return rot != tmp;
  }
   */

  // 最优解
  static char[][] pairs = {{'0', '0'}, {'1', '1'}, {'6', '9'}, {'8', '8'}, {'9', '6'}};
  public int confusingNumberII(int N) {
    String num = Integer.toString(N);
    int res = findTotal(num);
    for (int len = 1; len <= num.length(); len++) {
      char[] curr = new char[len];
      res -= dfs(curr, num, 0, len - 1);
    }
    return res;
  }
  // count the # of numbers from "01689" that is less than N
  private int findTotal(String s) {
    System.out.println("findTotal " + s);
    if (s.length() == 0) {
      System.out.println(String.format("%s %d", s, 1));
      return 1;
    }
    char first = s.charAt(0);
    int res = count(first) * (int) (Math.pow(5, s.length() - 1));
    if (first == '0' || first == '1' || first == '6' || first == '8' || first == '9') {
      res += findTotal(s.substring(1));
    }
    System.out.println(String.format("%s %d", s, res));
    return res;
  }
  // count the # of Strobogrammatic numbers
  private int dfs(char[] curr, String num, int left, int right) {
    int res = 0;
    if (left > right) {
      String s = new String(curr);
      if (s.length() < num.length() || s.compareTo(num) <= 0) {
        res += 1;
      }
    } else {
      for (char[] p : pairs) {
        curr[left] = p[0];
        curr[right] = p[1];
        if ((curr[0] == '0' && curr.length > 1) || (left == right && p[0] != p[1])) {
          continue;
        }
        res += dfs(curr, num, left + 1, right - 1);
      }
    }
    return res;
  }
  // a helper function that counts the # of chars in "01689" less than given 'c'
  private int count(Character c) {
    int res = 0;
    for (char[] p : pairs) {
      if (p[0] < c) {
        res += 1;
      }
    }
    return res;
  }
}
