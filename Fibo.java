//Find integral using Monte Carlo integration method
import java.io.*;
class Fibo
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter n");
		int n = Integer.parseInt(br.readLine());
		fibo(n);
	}
	public static void fibo(int n)
	{
		long fib = 0; 
		long fib2 = 1;
		long sum = 0;
		long swap = 0;
		for(int i = 1; i<=n; i++)
		{
			sum = fib+fib2;
			swap = fib2;
			fib2 = sum;
			fib = swap;
		}
		System.out.println(sum);
	}
}