package day3;

import java.util.HashSet;
import java.util.Set;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3};
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        Set<Integer> dup = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                set.add(arr[i]);
            } else {
                dup.add(arr[i]);
            }
        }
        // System.out.println(set);
        System.out.println(dup);
    }
}