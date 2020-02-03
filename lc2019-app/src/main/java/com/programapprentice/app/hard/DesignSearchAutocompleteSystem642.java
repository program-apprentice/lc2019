package com.programapprentice.app.hard;


import java.util.*;

public class DesignSearchAutocompleteSystem642 {
  public class AutocompleteSystem {
    class TrieNode {
      Map<Character, TrieNode> children;
      Map<String, Integer> counts;
      boolean isWord;
      public TrieNode() {
        children = new HashMap<>();
        counts = new HashMap<>();
        isWord = false;
      }
    }

    class Pair {
      public String s;
      public int c;
      public Pair(String s, int c) {
        this.s = s;
        this.c = c;
      }
    }

    TrieNode root;
    String prefix;

    public AutocompleteSystem(String[] sentences, int[] times) {
      root = new TrieNode();
      prefix = "";

      for(int i = 0; i < sentences.length; i++) {
        add(sentences[i], times[i]);
      }
    }

    private void add(String s, int count) {
      TrieNode curr = root;
      for(char c : s.toCharArray()) {
        TrieNode next = curr.children.get(c);
        if (next == null) {
          next = new TrieNode();
          curr.children.put(c, next);
        }
        curr = next;
        curr.counts.put(s, curr.counts.getOrDefault(s, 0) + count);
      }
    }

    public List<String> input(char c) {
      if (c == '#') {
        add(prefix, 1);
        prefix = "";
        return new ArrayList<>();
      }
      prefix = prefix + c;
      TrieNode curr = root;
      for(char cc : prefix.toCharArray()) {
        TrieNode next = curr.children.get(cc);
        if (next == null) {
          return new ArrayList<>();
        }
        curr = next;
      }
      PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
        @Override
        public int compare(Pair o1, Pair o2) {
          return o1.c == o2.c ? o1.s.compareTo(o2.s) : o2.c - o1.c;
        }
      });
      for(String s : curr.counts.keySet()) {
        pq.add(new Pair(s, curr.counts.get(s)));
      }
      List<String> res = new ArrayList<>();
      for(int i = 0; i < 3 && !pq.isEmpty(); i++) {
        res.add(pq.poll().s);
      }
      return res;
    }
  }

}
