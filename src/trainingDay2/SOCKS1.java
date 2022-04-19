/* package codechef; // don't place package name! */
package trainingDay2;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class SOCKS1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a==b || a==c || b==c) {
		    System.out.println("YES");
		} else {
		    System.out.println("NO");
		}
	}
}
