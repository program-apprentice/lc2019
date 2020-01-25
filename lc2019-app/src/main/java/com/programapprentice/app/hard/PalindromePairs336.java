package com.programapprentice.app.hard;

import java.util.*;

public class PalindromePairs336 {
  public List<List<Integer>> palindromePairs(String[] words) {
    Map<String, Integer> wordToIdx = new HashMap<>();
    TreeSet<Integer> lengthSet = new TreeSet<>();
    List<List<Integer>> result = new ArrayList<>();
    for(int i = 0; i < words.length; i++) {
      wordToIdx.put(words[i], i);
      lengthSet.add(words[i].length());
    }

    for(int i = 0; i < words.length; i++) {
      String cur = words[i];
      int len = cur.length();
      StringBuilder sb = new StringBuilder();
      sb.append(cur);
      String reverse = sb.reverse().toString();

      if (wordToIdx.get(reverse) != null && wordToIdx.get(reverse) != i) {
        List<Integer> item = new ArrayList<>();
        item.add(i);
        item.add(wordToIdx.get(reverse));
        result.add(item);
      }

      for(int l : lengthSet) {
        if (l == len) {
          break;
        }
        if (isValid(reverse, 0, len-l-1) && (wordToIdx.get(reverse.substring(len-l)) != null)) {
          List<Integer> item = new ArrayList<>();
          item.add(i);
          item.add(wordToIdx.get(reverse.substring(len-l)));
          result.add(item);
        }
        if (isValid(reverse, l, len-1) && (wordToIdx.get(reverse.substring(0, l)) != null)) {
          List<Integer> item = new ArrayList<>();
          item.add(wordToIdx.get(reverse.substring(0, l)));
          item.add(i);
          result.add(item);
        }
      }
    }
    return result;
  }

  private boolean isValid(String str, int left, int right) {
    while(left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
  /*
  Hit run time limit
  class Pair {
    int i;
    int j;
    Pair(int i, int j) {
      this.i = i;
      this.j = j;
    }

    public boolean equals(Object obj) {
      if (! (obj instanceof  Pair)) {
        return false;
      }
      Pair other = (Pair)obj;
      return this.i == other.i && this.j == other.j;
    }

    public int hashCode() {
      return Objects.hash(i, j);
    }
  }
  public List<List<Integer>> palindromePairs(String[] words) {
    Map<Character, Set<String>> start = new HashMap<>();
    Map<Character, Set<String>> end = new HashMap<>();
    Map<String, Integer> wordToIdx = new HashMap<>();
    boolean hasEmpty = false;
    for(int i = 0; i < words.length; i++) {
      wordToIdx.put(words[i], i);
      if (words[i].length() == 0) {
        hasEmpty = true;
        continue;
      }
      char firstChar = words[i].charAt(0);
      char lastChar = words[i].charAt(words[i].length()-1);
      Set<String> startSet = start.get(firstChar);
      if (startSet == null) {
        startSet = new HashSet<>();
        start.put(firstChar, startSet);
      }
      startSet.add(words[i]);

      Set<String> endSet = end.get(lastChar);
      if (endSet == null) {
        endSet = new HashSet<>();
        end.put(lastChar, endSet);
      }
      endSet.add(words[i]);
    }

    Set<Pair> result = new HashSet<>();
    for(Character c : start.keySet()) {
      Set<String> startSet = start.get(c);
      Set<String> endSet = end.get(c);
      if (endSet == null|| start == null) {
        continue;
      }
      for(String s : startSet) {
        int idx1 = wordToIdx.get(s);
        for(String t : endSet) {
          int idx2 = wordToIdx.get(t);
          if (idx1 != idx2 && isPalindrome(s, t)) {
            result.add(new Pair(idx1, idx2));
          }
          if (idx1 != idx2 && isPalindrome(t, s)) {
            result.add(new Pair(idx2, idx1));
          }
        }
        if (hasEmpty) {
          if (isPalindrome(s)) {
            int eIdx = wordToIdx.get("");
            result.add(new Pair(idx1, eIdx));
            result.add(new Pair(eIdx, idx1));
          }
        }
      }
    }

    List<List<Integer>> answer = new ArrayList<>();
    for(Pair p : result) {
      List<Integer> item = new ArrayList<>();
      item.add(p.i);
      item.add(p.j);
      answer.add(item);
    }
    return answer;
  }

  private Boolean isPalindrome(String s1, String s2) {
    return isPalindrome(s1+s2);
  }

  private boolean isPalindrome(String s) {
    int l = 0;
    int h = s.length()-1;
    while(l < h) {
      if (s.charAt(l) == s.charAt(h)) {
        l++;
        h--;
      } else {
        return false;
      }
    }
    return true;
  }
*/
}
