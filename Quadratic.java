import java.io.*;
class Quadratic
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
		double c = Double.parseDouble(br.readLine());
	}
	public static double[] quadratic(double a, double b, double c)
	{
		double[] solutions = new double[2];
		double d = b*b - 4*a*c;
		double num1 = (-b+Math.sqrt(d))/2*a;
		double num2 = (-b-Math.sqrt(d))/2*a;
		