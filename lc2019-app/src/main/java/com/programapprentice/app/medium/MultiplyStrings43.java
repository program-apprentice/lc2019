package com.programapprentice.app.medium;

public class MultiplyStrings43 {
  public String multiply(String num1, String num2) {
    if (num1 == null || num2 == null || num1.length() == 0 || num2.length() == 0) {
      return "";
    }
    int length1 = num1.length();
    int length2 = num2.length();
    int[] product = new int[length1 + length2];

    for(int i = length1-1; i >= 0; i--) {
      for (int j = length2-1; j >= 0; j--) {
        int digitPosition = i + j + 1;
        int carryPosition = i + j;
        int cur1 = num1.charAt(i) - '0';
        int cur2 = num2.charAt(j) - '0';
        int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
        int sum = mul + product[digitPosition];
        int digit = sum % 10;
        int carry = sum / 10;

        product[digitPosition] = digit;
        product[carryPosition] += carry;
      }
    }

    StringBuilder sb = new StringBuilder();
    for(int num : product) {
      if (sb.length() == 0 && num == 0) {
        continue;
      }
      sb.append(num);
    }
    return sb.length() == 0 ? "0" : sb.toString();
  }
}
