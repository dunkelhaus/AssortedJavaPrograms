/**Find the probability of two people having the same birthday in a classroom
*Date last updated - 12/2/13
*Author - Suraj Jena
*Homework 2
*/
package apcs;
import java.io.*;
public class Bday
{
	static int[] days = new int[365];
	public static void main(String []args)throws IOException
	{
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of students");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Enter number of times to run");
		int n1 = Integer.parseInt(br.readLine());
		count = bday(n, n1);
		double prob = (double)count/(double)n1;
		System.out.println("The Probability of Two birthdays is = "+prob);
	}
	public static void numberSetter(int n)
	{
		int num = 0;
		for(int i = 0; i<n; i++)
		{
			num = (int)(365.0*Math.random());
			days[i] = num;
		}
	}
	public static boolean areTwoBdays(int n)
	{
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				if(i!=j && days[i] == days[j])
				{
					return true;
				}
			}
		}
		return false;
	}
	public static int bday(int n, int n1)
	{
		int sum = 0;
		for(int i = 0; i<n1; i++)
		{
			numberSetter(n);
			if(areTwoBdays(n))
				sum++;
			else
				continue;
		}
		return sum;
	}
}