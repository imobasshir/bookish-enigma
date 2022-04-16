package day7; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CARSELL
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int mod = (int)1e9 + 7;
		Scanner sc = new Scanner(System.in);
		int tC = sc.nextInt();
		while(tC > 0) {
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for (int i=0; i<n; i++) {
		        arr[i] = sc.nextInt();
		    } 
		    Arrays.sort(arr);
		    reverse(arr);
		    int prof = 0;
		    for (int i=0; i<n; i++) {
		      int pro = Math.max(0, arr[i] - i);
		      prof = (prof % mod + pro % mod) % mod;
		    } 
		    System.out.println(prof);
		    tC--;
		}
		
	}
	static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {           
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
