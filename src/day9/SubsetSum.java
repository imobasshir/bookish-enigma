package day9;

public class SubsetSum {
    public static void main(String[] args) {
        int[] set = { 2, 3, 7, 8, 10 };
        int sum = 12;
        int n = set.length;
        System.out.println(subsetSum(set, sum, n));
    }

    private static boolean subsetSum(int[] set, int sum, int n) {
        boolean[][] T = new boolean[sum + 1][n + 1];
        for (int i = 0; i <= n; i++)
            T[0][i] = true;
        for (int i = 0; i <= sum; i++)
            T[i][0] = false;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                T[i][j] = T[i][j - 1];
                if (i >= set[j - 1]) {
                    T[i][j] = T[i][j] || T[i - set[j - 1]][j - 1];
                }
            }
        }
        return T[sum][n];
    }
}
