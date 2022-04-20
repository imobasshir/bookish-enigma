package day9;

public class EqualSumPart {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 11, 5 };
        int n = arr.length;
        System.out.println(equalPart(arr, n));
    }

    private static boolean equalPart(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        return subsetSum(arr, sum / 2, n);
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
