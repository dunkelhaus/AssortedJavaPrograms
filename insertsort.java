import java.io.*;
public class insertsort
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
		double[] b = insersort(a, n);
		display(b, n);
	}
	public static double[] insersort(double[] a, int n)
	{
		double temp = 0.0;
		int i=0, j=0;
		for(i = 1; i<n; i++)
		{
			temp = a[i];
			for(j = i-1; (j>=0) && (a[j]>temp); j--)
			{
				a[j+1] = a[j];
			}
			a[j+1] = temp;
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