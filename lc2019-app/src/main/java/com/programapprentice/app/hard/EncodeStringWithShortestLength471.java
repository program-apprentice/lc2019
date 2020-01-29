package com.programapprentice.app.hard;

public class EncodeStringWithShortestLength471 {
  public String encode(String s) {
    int len = s.length();
    String[][] opt = new String[len][len];
    for(int i = 0; i < len; i++) {
      for(int j = 0; j < len; j++) {
        opt[i][j] = "";
      }
    }
    for(int step = 1; step <= len; step++) {
      for(int start = 0; start + step <= len; start++) {
        int end = start + step - 1;
        String subStr = s.substring(start, end+1);
//        System.out.println("substring is " + subStr);
        opt[start][end] = subStr;
        for(int k = start; k < end; k++) {
//          System.out.println(String.format("start is %d end is %d k is %d", start, end, k));
          String left = opt[start][k];
          String right = opt[k+1][end];
//          System.out.println("left is " + left + " right is " + right);
          if (left.length() + right.length() < opt[start][end].length()) {
            opt[start][end] = left + right;
          }
        }
        String doubleStr = subStr + subStr;
        int pos = doubleStr.indexOf(subStr, 1);
        if (pos >= subStr.length()) {
          continue;
        } else {
          int counter = subStr.length() / pos;
          String newString = Integer.toString(counter) + "[" + opt[start][start+pos-1] + "]";
//          System.out.println("new String is " + newString);
          if (opt[start][end].length() > newString.length()) {
            opt[start][end] = newString;
          }
        }
      }
    }
    return opt[0][len-1];
  }
}
