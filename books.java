// date updated - 9/3/13
//program converting fahrenheit to celsius
package apcs;
import java.io.*;
public class books
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of books");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Enter number of times to be run");
		int num = Integer.parseInt(br.readLine());
		int[] names = new int[n];
		for(int i = 0; i<n; i++)
		{
			names[i] = i;
		}
		int ret = 0;
		int count = 0;
		for(int i = 0; i<num; i++)
		{
			ret = countEvent(names, n);
			if(ret == 1)
			{
				count++;
			}
		}
		double prob = (double)count/(double)num;
		System.out.println("Probability = "+prob);
	}
	public static int countEvent(int[] names, int n)
	{
		int count = 0;
		Shuffle sh = new Shuffle();
		int[] y = sh.shuffle(names);
		for(int i = 0; i<n; i++)
		{
			if(y[i] == i)
			{
				return 0;
			}
			else 
			{
				continue;
			}
		}
		return 1;
	}
}
