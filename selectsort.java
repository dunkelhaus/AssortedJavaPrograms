import java.io.*;
public class selectsort
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
		double[] b = selecsort(a, n);
		display(b, n);
	}
	public static double[] selecsort(double[] a, int n)
	{
		double temp;
		for(int i = 0; i<n; i++)
		{
			for(int j = i+1; j<n; j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
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