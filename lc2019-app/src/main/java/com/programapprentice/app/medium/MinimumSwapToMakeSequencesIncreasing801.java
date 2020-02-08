package com.programapprentice.app.medium;

public class MinimumSwapToMakeSequencesIncreasing801 {
    int minSwap(int[] A, int[] B) {
        int n = A.length;
        int[] swap = new int[n];
        int[] nonswap = new int[n];

        swap[0] = 1;

        for(int i = 1; i < n; i++) {
            nonswap[i] = i;
            swap[i] = i;
            if (A[i] > A[i-1] && B[i] > B[i-1]) {
                nonswap[i] = nonswap[i-1];
                swap[i] = swap[i-1] + 1;
            }
            if (A[i] > B[i-1] && B[i] > A[i-1]) {
                nonswap[i] = Math.min(swap[i-1], nonswap[i]);
                swap[i] = Math.min(swap[i], nonswap[i-1]+1);

            }
        }

        return Math.min(swap[n-1], nonswap[n-1]);
    }
}
