//Program depicting the practical use of the Euclidian Algorithm
import java.io.*;
class euclid
{
	static int div = 0;
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		if(a>b)
		{
			div = a%b;
			while(div!=0)
			{
				a=b;
				b=div;
				div = a%b;
			}
		}
		else if(b>a)
		{
			div = b%a;
			while(div!=0)
			{
				b=a;
				a=div;
				div = b%a;
			}
		}

		System.out.println("GCD = "+a);
	}
}