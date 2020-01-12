package com.programapprentice.app.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestStringChain1048 {
  public int longestStrChain(String[] words) {
    // need to sort words by each word length
    // no need to worry about word order, because we only need length
    Map<String, Integer> dp = new HashMap<>();
    Arrays.sort(words, (a, b)->a.length() - b.length());
    int res = 0;
    for (String w : words){
      int best = 0;
      for (int i = 0; i < w.length(); i++){
        // missing one char
        String tmp = w.substring(0, i) + w.substring(i+1, w.length());
        // if this missing one char string match with any string before
        best = Math.max(best, dp.getOrDefault(tmp, 0) + 1);
      }
      dp.put(w, best);
      res = Math.max(res, best);
    }
    return res;
  }
}
