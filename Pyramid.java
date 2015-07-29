//Find integral using Monte Carlo integration method
import java.io.*;
class Pyramid
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter n");
		int n = Integer.parseInt(br.readLine());
		pyramid(n);
	}
	public static void pyramid(int n)
	{
		int p = 1;
		for(int i = 1, p = 1; i<n, p<n; i++, p++)
		{
			while(p<n)
			{
				System.out.print(" ");
				p++;
			}
			for(int j = n; j<2i+1; 