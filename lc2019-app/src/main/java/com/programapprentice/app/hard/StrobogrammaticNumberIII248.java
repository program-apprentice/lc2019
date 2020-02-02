package com.programapprentice.app.hard;

public class StrobogrammaticNumberIII248 {
  public int strobogrammaticInRange(String low, String high) {
    int result = 0;
    for(int i = low.length(); i <= high.length(); i++) {
      result += find(low, high, "", i);
      result += find(low, high, "0", i);
      result += find(low, high, "1", i);
      result += find(low, high, "8", i);
    }

    return result;
  }

  private int find(String low, String high, String path, int len) {
    int counter = 0;
    if (path.length() >= len) {
      if (path.length() != len || (len != 1 && path.charAt(0) == '0')) {
        return counter;
      }
      if ((path.length() == low.length() && path.compareTo(low) < 0)
        || path.length() == high.length() && path.compareTo(high) > 0) {
        return 0;
      }
      counter += 1;
    }
    counter += find(low, high, "0" + path + "0", len);
    counter += find(low, high, "1" + path + "1", len);
    counter += find(low, high, "8" + path + "8", len);
    counter += find(low, high, "6" + path + "9", len);
    counter += find(low, high, "9" + path + "6", len);
    return counter;
  }
}
