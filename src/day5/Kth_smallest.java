package day5;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_smallest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++) {
            heap.add(arr[i]);
            if(heap.size() > k) {
                heap.poll();
            }
        }
        System.out.println(heap.peek());
    }
}
