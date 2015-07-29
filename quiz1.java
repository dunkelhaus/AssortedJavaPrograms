//Program to solve problem posed in quiz 1
import java.io.*;
class quiz1
{
	public static void main(String[]args)throws IOException
	{
		double sn = 0.0;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter max value");
		double maxim = Integer.parseInt(br.readLine());
		double i; 
		for(i = 1.0; sn<maxim; i++)
		{
			sn += 1.0/i;
	
		}
		System.out.println("Value = "+(i-1));
	}
}