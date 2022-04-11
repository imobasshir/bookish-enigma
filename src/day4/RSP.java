/* package codechef; // don't place package name! */
package day4;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RSP
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[n+1];
		int[] sum = new int[n+1];
		sum[0] = 0;
		arr[0] = 0;
		for(int i=1;i<=n;i++) {
		    arr[i] = sc.nextInt();
		    sum[i] = sum[i-1] + arr[i];
		}
		while(q > 0) {
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    System.out.println(sum[r] - sum[l-1]);
		    q--;
		}
		
	}
}