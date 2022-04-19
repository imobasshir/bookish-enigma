/* package codechef; // don't place package name! */
package trainingDay2;

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class AIRLINE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tC = sc.nextInt();
		while(tC > 0) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    int e = sc.nextInt();
		    if (a+b <= d && c <= e) {
		        System.out.println("YES");
		    } else if(a+c <= d && b <= e) {
		        System.out.println("YES");
		    } else if (b+c <= d && a <= e) {
		        System.out.println("YES");
		    } else {
		        System.out.println("No");
		    }
		    tC--;   
		}
	}
}
