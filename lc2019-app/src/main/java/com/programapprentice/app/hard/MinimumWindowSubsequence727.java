package com.programapprentice.app.hard;

public class MinimumWindowSubsequence727 {
  public String minWindow(String s, String t) {
    // dp[i][j] 表示范围S中前i个字符包含范围T中前j个字符的子串的起始位置，注意这里的包含是子序列包含关系。
    int h = s.length()+1;
    int w = t.length()+1;
    int[][] opt = new int[h+1][w+1];
    for(int i = 0; i <= h; i++) {
      for(int j = 0; j <= w; j++) {
        if (j == 0) {
          opt[i][0] = i;
        } else {
          opt[i][j] = -1;
        }
      }
    }
    int minLeng = Integer.MAX_VALUE;
    String result = "";

    for(int si = 1; si <= s.length(); si++) {
      for(int ti = 1; ti <= t.length(); ti++) {
        if (t.charAt(ti-1) == s.charAt(si-1)) {
          opt[si][ti] = opt[si-1][ti-1];
          if (ti == t.length()) {
            int newLen = si - opt[si][ti];
            if (newLen < minLeng) {
              if (opt[si][ti] != -1) {
                minLeng = newLen;
                result = s.substring(opt[si][ti], si);
              }
            }
          }
        } else {
          opt[si][ti] = opt[si-1][ti];
        }
      }
    }
    return result;
  }
}
