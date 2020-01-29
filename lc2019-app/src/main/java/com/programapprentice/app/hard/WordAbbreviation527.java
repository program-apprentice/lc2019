package com.programapprentice.app.hard;

import java.util.*;

public class WordAbbreviation527 {
  public List<String> wordsAbbreviation(List<String> dict) {
    int len = dict.size();
    String[] result = new String[len];
    int[] prefix = new int[len];
    Map<String, List<String>> abbrToStrsMap = new HashMap<>();
    Map<String, Integer> strToIdx = new HashMap<>();

    for(int i = 0; i < len; i++) {
      String cur = dict.get(i);
      String abbr = makeAbbr(cur, 1);
      result[i] = abbr;
      strToIdx.put(cur, i);
      List<String> strs = abbrToStrsMap.getOrDefault(abbr, new ArrayList<>());
      strs.add(cur);
      abbrToStrsMap.put(abbr, strs);
    }

    for(String abbr : abbrToStrsMap.keySet()) {
      List<String> strs = abbrToStrsMap.get(abbr);
      if(strs.size() > 1) {
        // Need to resolve conflict
//        for(int i = 1; i < strs.size(); i++) {
//          int idx = strToIdx.get(strs.get(i));
//          result[idx] = makeAbbr(strs.get(i), i+1);
//        }
      }
    }
    return Arrays.asList(result);
  }

  private String makeAbbr(String s, int k) {
    if (k >= s.length()-2) {
      return s;
    }
    StringBuilder sb = new StringBuilder();
    sb.append(s, 0, k);
    sb.append(s.length()-k-1);
    sb.append(s.charAt(s.length()-1));
    return sb.toString();
  }

  private Map<String, Integer> resolveConflict(List<String> dict, Map<String, Integer> strToIdx) {
    Map<String, Integer> map = new HashMap<>();
    Trie trie = buildTrie(dict);
    for(String s : dict) {
      Trie cur = trie;
      int i = 0;
      int n = s.length();
      while(i < n && cur.next.get(s.charAt(i)).cnt > 1) {
        cur = cur.next.get(s.charAt(i));
        i++;
      }
      if (i >= n-3) {
        int idx = strToIdx.get(s);
        // TBD
      }
    }
    return map;
  }

  private Trie buildTrie(List<String> dict) {
    Trie root = new Trie();
    for(String s : dict) {
      Trie cur = root;
      for(int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (cur.next.containsKey(c)) {
          cur.next.get(c);
        } else {
          Trie next = new Trie();
          cur.next.put(c, next);
          cur = next;
        }
        cur.cnt++;
      }
    }
    return root;
  }

  private class Trie {
    int cnt = 0;
    Map<Character, Trie> next = new HashMap<>();
  }
}
