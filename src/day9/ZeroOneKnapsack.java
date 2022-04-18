package day9;

import java.util.Arrays;

public class ZeroOneKnapsack {
    public static void main(String[] args) {
        int[] wt = { 1, 3, 4, 7 };
        int[] val = { 1, 4, 5, 7 };
        int W = 7;
        int n = 4;
        System.out.println(knapsack(wt, val, W, n));
        System.out.println(zeroOne(wt, val, W, n));
        System.out.println(zeroOneTopDown(wt, val, W, n));
    }

    private static int zeroOneTopDown(int[] wt, int[] val, int w, int n) {
        int[][] T = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0) { // Initialization Condition
                    T[i][j] = 0;
                } else if (wt[i - 1] <= j) {
                    // max(Wt have taken , not taken)
                    T[i][j] = Math.max(val[i - 1] + T[i - 1][j - wt[i - 1]], T[i - 1][j]);
                } else {
                    T[i][j] = T[i - 1][j];
                }
            }
        }
        return T[n][w];
    }

    private static int zeroOne(int[] wt, int[] val, int w, int n) {
        int[][] T = new int[n + 1][w + 1];
        // Initialize matrix with -1
        for (int[] is : T) {
            Arrays.fill(is, -1);
        }
        // Base Condition
        if (n == 0 || w == 0) {
            return 0;
        }
        if (T[n][w] != -1) {
            return T[n][w];
        }
        if (wt[n - 1] <= w) {
            // max(Wt have taken , not taken)
            return T[n][w] = Math.max(val[n - 1] + zeroOne(wt, val, w - wt[n - 1], n - 1), zeroOne(wt, val, w, n - 1));
        } else {
            return T[n][w] = zeroOne(wt, val, w, n - 1);
        }
    }

    private static int knapsack(int[] wt, int[] val, int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (wt[n - 1] <= w) {
            // max(Wt have taken , not taken)
            return Math.max(val[n - 1] + knapsack(wt, val, w - wt[n - 1], n - 1), knapsack(wt, val, w, n - 1));
        } else {
            return knapsack(wt, val, w, n - 1);
        }
    }
}
