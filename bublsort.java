import java.io.*;
public class bublsort
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length");
		int n = Integer.parseInt(br.readLine());
		double[] a= new double[n];
		for(int j = 0; j<n; j++)
		{
			System.out.println("enter value");
			a[j] = Double.parseDouble(br.readLine());
		}
		double[] b = bubsort(a, n);
		display(b, n);
	}
	public static double[] bubsort(double[] a, int n)
	{
		double temp;
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n-1; j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
	public static void display(double[] a, int n)
	{
		for(int j = 0; j<n; j++)
		{
			System.out.print(a[j]+" ");
		}
	}
}