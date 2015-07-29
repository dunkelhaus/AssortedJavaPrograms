package apcs;

import java.io.*;
public class Myfmod 
{
	public static void main(String[] args)throws IOException
	{
		int i = 0;
		do
		{
			double c;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number a");
			double a = Double.parseDouble(br.readLine());
			System.out.println("Enter number b");
			double b = Double.parseDouble(br.readLine());
			if(a > b)
			{
				c = a % b;
			}
			else
			{
				c = b % a;
			}
			System.out.println("The answer is : "+c);
			System.out.println("Enter 1 to continue, 0 to exit");
			i = Integer.parseInt(br.readLine());
		}while(i != 0);
	}
}
