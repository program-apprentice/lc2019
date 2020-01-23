package com.programapprentice.app.hard;

import java.util.Arrays;
import java.util.LinkedList;

public class CreateMaximumNumber321 {
  public int[] maxNumber(int[] nums1, int[] nums2, int k) {
    int len1 = nums1.length;
    int len2 = nums2.length;
    int[] result = null;
    for(int i = Math.max(0, k - len2); i <= Math.min(k, len1); ++i) {
      int[] list1 = generateMax(nums1, i);
      int[] list2 = generateMax(nums2, k-i);
      int[] merge = mergeMax(list1, list2, k);
      if (result == null) {
        result = merge;
      } else {
        result = getMax(result, merge);
      }
    }
    return result;
  }

  public int[] generateMaxRight(int[] nums, int k) {
    int n = nums.length;
    int[] ans = new int[k];
    for (int i = 0, j = 0; i < n; ++i) {
      while (n - i + j > k && j > 0 && ans[j - 1] < nums[i]) j--;
      if (j < k) ans[j++] = nums[i];
    }
    return ans;
  }
  public int[] generateMax(int[] nums, int k) {
    int numOfDrop = nums.length - k;
    int[] result = new int[k];
    if (k == 0) {
      return result;
    }
    int idx = 0;
    for(int num : nums) {
      while(numOfDrop > 0 && idx > 0 && result[idx-1] < num) {
        idx --;
        numOfDrop -= 1;
      }
      if (idx < k) {
        result[idx] = num;
        idx++;
      } else {
        numOfDrop-= 1;
      }
    }
    return result;
  }

  // tell whether nums1 is greater than nums2
  private boolean greater(int[] nums1, int i, int[] nums2, int j) {
    // if i & j are the same, use the digit after them to decide greater or not
    while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
      i++;
      j++;
    }
    if (j == nums2.length) {
      return true;
    }
    if (i == nums1.length) {
      return false;
    }

    return nums1[i] > nums2[j];
  }

  private int[] mergeMax(int[] nums1, int[] nums2, int k) {
    System.out.println("mergeMax: ");
    System.out.println("num1: " + Arrays.toString(nums1));
    System.out.println("num2: " + Arrays.toString(nums2));
    int[] result = new int[k];
    int idx1 = 0;
    int idx2 = 0;
    int idx = 0;
    while(idx < k) {
      if (greater(nums1, idx1, nums2, idx2)) {
        result[idx] = nums1[idx1];
        idx1++;
      } else {
        result[idx] = nums2[idx2];
        idx2++;
      }
      idx++;
    }
    System.out.println("result: " + Arrays.toString(result));
    return result;
  }

  private int[] getMax(int[] nums1, int[] nums2) {

    int len = nums1.length;

    for(int i = 0; i < len; i++) {
      int num1 = nums1[i];
      int num2 = nums2[i];
      if (num1 > num2) {
        return nums1;
      } else if (num1 < num2) {
        return nums2;
      }
    }
    return nums1;
  }

}
