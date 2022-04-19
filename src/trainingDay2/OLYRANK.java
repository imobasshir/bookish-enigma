/* package codechef; // don't place package name! */
package trainingDay2;

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class OLYRANK
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tC = sc.nextInt();
		while (tC > 0) {
		    int g1,g2,b1,b2,s1,s2;
		    g1 = sc.nextInt();
		    s1 = sc.nextInt();
		    b1 = sc.nextInt();
		    g2 = sc.nextInt();
		    s2 = sc.nextInt();
		    b2 = sc.nextInt();
		    if((g1+s1+b1) > (g2+s2+b2)) {
		    System.out.println("1");
		} else {
		    System.out.println("2");
		}
		tC--;
		}
		
	}
}
