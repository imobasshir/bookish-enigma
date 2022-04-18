package day4;

import java.util.Arrays;

public class a {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[][] T = new int[5 + 1][6 + 1];
        for (int[] is : T) {
            Arrays.fill(is, -1);
        }
        for (int[] is : T) {
            System.out.println(is.toString());
        }
    }
}
