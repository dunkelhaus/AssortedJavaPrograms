//Shuffle a number of cardsentered by the user randomly
package apcs;
import java.io.*;
class Shuffle
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter pulls");
		int rolls = Integer.parseInt(br.readLine());
		System.out.println("Enter length");
		int length = Integer.parseInt(br.readLine());
		int[] x = new int[length];
		int[] z = new int[length];
		int count = 0;
		for(int i = 0; i<length; i++)
		{	
			System.out.println("Enter "+(i+1)+"th term");
			x[i] = Integer.parseInt(br.readLine());
		}
		int[] y = shuffle(x);
		for(int i = 0; i<length; i++)
		{	
			System.out.print(y[i]);
		}
	}
	public static int[] shuffle(int[] x)
	{
		int pull = 0;
		int c = 0;
		for(int i = x.length-1; i>=0; i--)
		{
			int j = 0;
			pull = (int)((double)i*Math.random())+1;
			c = x[j];
			x[j] = x[pull];
			x[pull] = c;
			j++;
		}
		return x;
	}
}
	