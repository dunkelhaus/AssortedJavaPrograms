//Find integral using Monte Carlo integration method
import java.io.*;
class Recfibo
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter num");
		int num = Integer.parseInt(br.readLine());
		int f = fibo(num);
		System.out.println(f);
	}
	public static int fibo(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else if(n == 1)
		{
			return 1;
		}
		else 
		{
			return (fibo(n-1)+fibo(n-1));
		}
	}
}