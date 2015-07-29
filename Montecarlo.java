//Find integral using Monte Carlo integration method
import java.io.*;
class MonteCarlo
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter a");
		double a = Integer.parseInt(br.readLine());
		System.out.println("Enter b");
		double b = Integer.parseInt(br.readLine());
		System.out.println("Enter number of times to be run");
		int n = Integer.parseInt(br.readLine());
		montecarlo(a,b,n);
	}
	public static void montecarlo(double a, double b, int n)
	{
		int count = 0;
		double m = b*b;
		for(int i = 0; i<n; i++)
		{
			double x = Math.random()*(b-a)+a;
			double y = Math.random()*(b*b);
			if(y<x*x)
			{
				count++;
			}
		}
		double integral = (count/(double)n)*(m*(b-a));
		System.out.println("Integral = "+integral);
	}
}