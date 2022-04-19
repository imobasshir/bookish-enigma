/* package codechef; // don't place package name! */
package trainingDay2;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class SNAPE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tC = sc.nextInt();
		while(tC > 0) {
		    int b = sc.nextInt();
		    int ls = sc.nextInt();
		    double ansMax = Math.round(Math.sqrt(b*b + ls*ls)*10000.0)/10000.0;
		    double ansMin = Math.round(Math.sqrt(ls*ls - b*b)*10000.0)/10000.0;
		    System.out.println(ansMin+ " "+ansMax);
		    tC--;
		}
	}
}
