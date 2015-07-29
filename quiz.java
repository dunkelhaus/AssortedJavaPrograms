package apcs;
import java.io.*;
public class quiz
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter Number Of Toys");
		int num = Integer.parseInt(br.readLine());
		System.out.println("Enter Number Of Times To Be Run");
		int t = Integer.parseInt(br.readLine());
		double avg = average(num, t);
		System.out.println(avg);
	}
	public static double average(int n, int t)
	{
		int[] toys = new int[n];
		int[] countl = new int[t];
		for(int i = 0; i<t; i++)
		{
			int count = 0;
			do
			{
				int toy = (int)((double)n*Math.random())+1;
				for(int j = 1; j <= n; j++)
				{
					if(toy == j-1)
					{
						toys[j-1] = 1;
					}
				}
				count++;
				System.out.println("t");
			}while(allTrue(toys) == false);
			countl[i] = count;
			System.out.println("v");
		}
		int s = 0;
		double avg = 0.0;
		for(int i = 0; i<countl.length; i++)
		{
			s = s + countl[i];
		}
		avg = (double)s / t;
		return avg;
	}
	public static boolean allTrue(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			  if (arr[i] == 0) 
			  {
				  return false;
			  }
		}
		return true;
	}
}
