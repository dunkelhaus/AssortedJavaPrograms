//write a method  public static double[][] matrix multiply(double [][] a, double [][] b)
//C[] = A[]*B[]
//m*p = m*n * n*p;
//Cij = sigma k=0 to n-i Aik * Bkj
import java.io.*;
class MultiplyMatrix
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter m");
		int m = Integer.parseInt(br.readLine());
		System.out.println("Enter n");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Enter p");
		int p = Integer.parseInt(br.readLine());
		double[][] a = new double[m][n];
		double[][] b = new double[n][p];
		double[][] c = new double[m][p];
		for(int i = 0; i<m; i++)
		{
			for(int j = 0; j<n; j++)
			{
				System.out.println("Enter ["+i+"]["+j+"]th term");
				a[i][j] = Double.parseDouble(br.readLine());
			}
		}
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<p; j++)
			{
				System.out.println("Enter ["+i+"]["+j+"]th term");
				b[i][j] = Double.parseDouble(br.readLine());
			}
		}
		c = matrixmultiply(a, b, m, n, p);
		for(int i = 0; i<m; i++)
		{
			for(int j = 0; j<p; j++)
			{
				System.out.println("Multiplied ["+i+"]["+j+"]th term = "+c[i][j]);
			}
		}
	}
	public static double[][] matrixmultiply(double[][] a, double[][] b, int m, int n, int p)
	{
		double[][] c = new double[m][p];
		double sum = 0.0;
		for(int i = 0; i<m; i++)
		{
			for int j = 0; j<p; j++)
			{
				for(int k = 0; k<n; k++)
				{
					sum += a[i][k]*b[k][j];
				}
				c[i][j] = sum;
			}
		}
		return c;
	}