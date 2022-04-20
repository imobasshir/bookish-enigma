package day9;

public class SubsetSum {
    public static void main(String[] args) {
        int[] set = { 2, 3, 7, 8, 10 };
        int sum = 12;
        int n = set.length;
        System.out.println(subsetSum(set, sum, n));
    }

    private static boolean subsetSum(int[] arr, int sum, int n) {
        boolean[][] T = new boolean[n + 1][sum + 1];
        // initialization condition
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    T[i][j] = false;
                }
                if (j == 0) {
                    T[i][j] = true;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    T[i][j] = T[i - 1][j - arr[i - 1]] || T[i - 1][j];
                } else {
                    T[i][j] = T[i - 1][j];
                }
            }
        }
        return T[n][sum];
    }
}
