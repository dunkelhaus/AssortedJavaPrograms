//Find integral using Monte Carlo integration method
import java.io.*;
class Fact
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter num");
		int num = Integer.parseInt(br.readLine());
		int fact = factorial(num);
		System.out.println(fact);
	}
	public static int factorial(int n)
	{
		if (n == 0)
		{
			return 1;
		}
		else
		{
			return (n*factorial(n-1));
		}
	}
}