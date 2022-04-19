/* package codechef; // don't place package name! */
package trainingDay2;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class FCB
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tC = sc.nextInt();
		while(tC > 0) {
		    int k = sc.nextInt();
		    int x = sc.nextInt();
		    int ans = k - x;
		    System.out.println(ans);
		    tC--;
		}
	}
}
