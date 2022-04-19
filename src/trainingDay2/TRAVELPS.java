/* package codechef; // don't place package name! */
package trainingDay2;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class TRAVELPS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tC = sc.nextInt();
		while(tC > 0) {
		    int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc. nextInt();
            String str = sc.next();
            int zero = 0;
            int ones = 0;
            for (int i=0; i<n; i++) {
                if(str.charAt(i) == '1') 
                    ones++;
                else
                    zero++;
                
            } 
            System.out.println(zero*a + ones*b);
		    tC--;
		}
	}
}
