package day7; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FAIRELCT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tC = sc.nextInt();
		while(tC > 0) {
		    PriorityQueue<Integer> minh = new PriorityQueue<>();
		    PriorityQueue<Integer> maxh = new PriorityQueue<>(Collections.reverseOrder());
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int[] arrN = new int[n];
		    int sumn = 0;
		    int summ = 0;
		    int[] arrM = new int[m];
		    for (int i=0; i<n; i++) {
		        arrN[i] = sc.nextInt();
		        sumn += arrN[i];
		        minh.add(arrN[i]);
		    }
		    for (int i=0; i<m; i++) {
		        arrM[i] = sc.nextInt();
		        summ += arrM[i];
		        maxh.add(arrM[i]);
		    }
		    int ans = 0;
		    if (sumn > summ) {
		        System.out.println(ans);
		    } else {
		        while(sumn <= summ) {
		            if (minh.peek() >= maxh.peek()) {
		                ans = -1;
		                break;
		            }
		            ans += 1;
		            int a = minh.peek();
		            minh.poll();
		              //  int a = minh.poll();
		            int b = maxh.peek();
	                maxh.poll();
		              //  int b = maxh.poll();
		              //  int temp = a;
		              //  a = b;
		              //  b = temp;
	                sumn = sumn - a + b;
	                summ = summ - b + a;
		            minh.add(b);
		            maxh.add(a);
		        }
		        System.out.println(ans);
		    }
		    
		    tC--;
		}
	}
}
