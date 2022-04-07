/* package codechef; // don't place package name! */
package trainingDay2;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EITA
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tC = sc.nextInt();
		while(tC > 0) {
		    int d = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    int firstType = x * 7;
		    int secondType = y * d + (7 - d) * z;
		    int ans = Math.max(firstType, secondType);
		    System.out.println(ans);
		    tC--;
		}
	}
}
