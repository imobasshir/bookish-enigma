package day9;

public class CountNoOfSUbsetWithDiff {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3 };
        int diff = 1;
        System.out.println(countNoOfSUbsetWithDiff(arr, diff, arr.length));
    }

    private static int countNoOfSUbsetWithDiff(int[] arr, int diff, int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        int sum = (diff + totalSum) / 2;
        return subsetCount(arr, sum, n);
    }

    private static int subsetCount(int[] arr, int sum, int n) {
        int[][] T = new int[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    T[i][j] = 0;
                }
                if (j == 0) {
                    T[i][j] = 1;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    T[i][j] = T[i - 1][j - arr[i - 1]] + T[i - 1][j];
                } else {
                    T[i][j] = T[i - 1][j];
                }
            }
        }
        return T[n][sum];
    }
}
