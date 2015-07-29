//Program to calculate an integral of a curve of function
import java.io.*;
class Integral
{
	public static void main(String[]args)throws IOException
	{
		mainHandler();
	}
	public static void mainHandler()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a");
		double a = Double.parseDouble(br.readLine());
		System.out.println("Enter b");
		double b = Double.parseDouble(br.readLine());
		System.out.println("Enter n");
		int n = Integer.parseInt(br.readLine());
		System.out.println("What to find?");
		System.out.println(" 1. x squared or 2. exp raised to -x squared?");
		int ch = Intgeer.parseInt(br.readLine());
		double area = riemann(a,b,n);
		System.out.println("Area : "+area);
	}
	public static double riemann(double a, double b, int n)
	{
		double delta = (b-a)/(double)n;
		double area = 0.0;
		for(int i = 1; i<=n; i++)
		{
			area += (a+i*delta)*(a+i*delta)*delta;
		}
		return area;
	}
}