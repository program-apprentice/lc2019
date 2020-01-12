package com.programapprentice.app.medium;

import java.util.*;

public class WordLadder127 {
  public int ladderLength(String start, String end, Set<String> dict) {
    Set<String> visited = new HashSet<String>();
    visited.add(start); // missing this one
    Queue<String> wordQueue = new LinkedList<String>();
    Queue<Integer> depthQueue = new LinkedList<Integer>();
    wordQueue.add(start);
    depthQueue.add(1);
    String curWord = null;
    int depth = 0;
    while(!wordQueue.isEmpty()) {
      curWord = wordQueue.remove();
      depth = depthQueue.remove();
      // This one is in wrong positon char[] charArray = curWord.toCharArray();
      for(int i = 0; i < curWord.length(); i++) {
        char[] charArray = curWord.toCharArray();
        for(char c = 'a'; c <= 'z'; c++) {
          charArray[i] = c;
          String newWord = new String(charArray);
          if(newWord.equals(end)) { // wrong: if(newWord.equals(end)) {
            return depth+1; // return depth++;
          }
          if(newWord.equals(curWord)) {
            continue;
          }
          if(dict.contains(newWord) && !visited.contains(newWord)) {
            wordQueue.add(newWord);
            depthQueue.add(depth+1); // wrong: depthQueue.add(depth++);
            visited.add(newWord);
          }
        }
      }
    }
    return 0;
  }
}
