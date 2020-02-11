package com.programapprentice.app.medium;

public class SentenceScreenFitting418 {
  public int wordsTyping(String[] sentence, int rows, int cols) {
    int n = sentence.length;
    int[] dp = new int[n];
    for(int i = 0; i < n; i++) {
      int count = 0;
      int len = 0;

      while(len <= cols) {
        int idx = (count + i) % n;
        if(len + sentence[idx].length() == cols
        ||len + sentence[idx].length()+1 == cols) {
          count++;
          break;
        }
        len += sentence[idx].length() + 1;
        count++;
      }
      if (len > cols) {
        count--;
      }
      dp[i] = count;
    }

    int totalCount = 0;
    int k = 0;
    for(int i = 0; i < rows; i++) {
      totalCount += dp[k];
      k = (dp[k] + k) % n;
    }
    return totalCount/n;
  }

  // solution from https://leetcode.com/problems/sentence-screen-fitting/discuss/90874/12ms-Java-solution-using-DP
//  public int wordsTyping(String[] sentence, int rows, int cols) {
//    int[] dp = new int[sentence.length];
//    int n = sentence.length;
//
//    for(int i=0, prev=0, len=0; i < n; i++) {
//      // remove the length of previous word and space
//      if (i != 0 && len > 0) {
//        len -= sentence[i-1].length() + 1; // +1 is for one space
//      }
//      while(len + sentence[prev%n].length() <= cols) {
//        len += sentence[prev%n].length() + 1;
//        prev++;
//      }
//      dp[i] = prev;
//    }
//
//    int count = 0; // how many words
//    int k = 0;
//    for(int i = 0; i < rows; i++) {
//      count += dp[k] - k;
//      k = dp[k] % n; // Next starting word.
//    }
//    return count / n;
//  }
}
