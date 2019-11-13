package com.programapprentice.app.medium;

public class DecodeWays91 {
  public int numDecodings(String s) {
    // d(i) = {d(i-1), if s[i-1]!='0'} + {d(i-2), if 1X (X=1..9) or 2X (X=1..6)}
    // d(0) = 0, but set d(0) = 1 for computing d(i);
    int n = s.length();
    if (n == 0 || s.charAt(0) == '0') {
      return 0;
    }

    int[] opt = new int[n+1];
    opt[0] = 1;
    opt[1] = s.charAt(0) != '0' ? 1 : 0;

    for(int i = 2; i <= n; i++) {
      int first = Integer.parseInt(s.substring(i-1, i));
      int second = Integer.parseInt(s.substring(i-2, i));
      if (first >= 1 && first <= 9) {
        opt[i] += opt[i-1];
      }
      if (second >= 10 && second <= 26) {
        opt[i] += opt[i-2];
      }
    }
    return opt[n];
  }
}
