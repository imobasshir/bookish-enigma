package day10;

import java.util.Arrays;

public class LCS { // Longest Common Substring
    public static void main(String[] args) {
        String s1 = "abcdgh";
        int n = s1.length();
        String s2 = "abedfhc";
        int m = s2.length();
        System.out.println(lcs(s1, n, s2, m));
        int[][] T = new int[n + 1][m + 1];
        // Initialize array with -1
        for (int[] is : T) {
            Arrays.fill(is, -1);
        }
        System.out.println(lcsMemo(s1, n, s2, m, T));
        System.out.println(lcsTopDown(s1, n, s2, m, T));
    }

    private static int lcsTopDown(String s1, int n, String s2, int m, int[][] t) {
        
        return 0;
    }

    private static int lcsMemo(String s1, int n, String s2, int m, int[][] T) {
        // Base Condition
        if (n == 0 || m == 0) {
            return 0;
        }
        // Choice Digram
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return T[n][m] =  1 + lcs(s1, n - 1, s2, m - 1);
        } else {
            return T[n][m] =  Math.max(lcs(s1, n - 1, s2, m), lcs(s1, n, s2, m - 1));
        }
    }

    private static int lcs(String s1, int n, String s2, int m) {
        // Base Condition
        if (n == 0 || m == 0) {
            return 0;
        }
        // Choice Digram
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return 1 + lcs(s1, n - 1, s2, m - 1);
        } else {
            return Math.max(lcs(s1, n - 1, s2, m), lcs(s1, n, s2, m - 1));
        }
    }
}
