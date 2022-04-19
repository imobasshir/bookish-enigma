package day9;

public class RodCutting { // UnboundedKnapsack Type
    public static void main(String[] args) {
        int[] length = { 1, 2, 3, 4, 5, 6 };
        int[] price = { 1, 5, 8, 9, 10, 17 };
        int L = 8;
        int n = length.length;
        System.out.println(rodCutting(length, price, L, n));
    }

    private static int rodCutting(int[] length, int[] price, int l, int n) {
        int[][] T = new int[n + 1][l + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= l; j++) {
                if (i == 0 || j == 0) { // Initialization Condition
                    T[i][j] = 0;
                } else if (length[i - 1] <= j) {
                    // max(length have taken , not taken)
                    T[i][j] = Math.max(price[i - 1] + T[i][j - length[i - 1]], T[i - 1][j]);
                } else {
                    T[i][j] = T[i - 1][j];
                }
            }
        }
        return T[n][l];
    }
}
