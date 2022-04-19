package day4; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class ZOZ
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc= sc.nextInt();
		while(tc>0){
		    int n = sc.nextInt();
		    long k = sc.nextInt();
		    int[] arr = new int[n];
		    long sum = 0;
		    for(int i = 0; i<arr.length; i++){
		        arr[i] = sc.nextInt();
		        sum += arr[i];
		    }
		    int count = 0;
		    for(int a: arr){
		        if(sum-a< (long)(a+k))count++;
		    }
		    System.out.println(count);
                    tc--;
		}
	}
}
