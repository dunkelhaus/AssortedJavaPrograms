//Program finding average, median, maximum, minimum, and standard deviation for  a randomly generated array
import java.io.*;
class ManipArray
{
	static int n = 100;
	public static void main(String[]args)throws IOException
	{
		mainHandler();
	}
	public static void mainHandler()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter what you want");
		System.out.println("1. Average");
		System.out.println("2. Minimum");
		System.out.println("3. Maximum");
		System.out.println("4. Median");
		System.out.println("5. Standard Deviation");
		int ch = Integer.parseInt(br.readLine());
		if(ch==1)
		{
			double[] rn = makeArray();
			double avg = getAverage(rn, n);
			System.out.println("Average: "+avg);
		}
		if(ch==2)
		{
			double[] rn = makeArray();
			double min = getMinimum(rn, n);
			System.out.println("Minimum: "+min);
		}
		if(ch==3)
		{
			double[] rn = makeArray();
			double n1 = getMaximum(rn, n);
			System.out.println("Maximum: "+n1);
		}
		if(ch==4)
		{
			double[] rn = makeArray();
			double n1 = getMedian(rn, n);
			System.out.println("Median: "+n1);
		}
		if(ch==5)
		{
			double[] rn = makeArray();
			double n1 = getStandardDeviation(rn, n);
			System.out.println("Standard Deviation: "+n1);
		}
	}
	public static double[] makeArray()
	{
		double[] rn = new double[n];
		for(int i= 0; i<n; i++)
		{
			rn[i] = Math.random()*100.0;
		}
		return rn;
	}
	public static double getAverage(double[] rn, int n)
	{
		int sum = 0;
		for(int i = 0; i<n; i++)
		{
			sum += rn[i];
		}
		double avg = sum/n;
		return avg;
	}
	public static double getMinimum(double[] rn, int n)
	{
		double min = 0;
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				if(i>j)
					min = rn[j];
				else
					min = rn[i];
			}
		}
		return min;
	}
	public static double getMaximum(double[] rn, int n)
	{
		double max = 0;
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				if(i>j)
					max = rn[i];
				else
					max = rn[j];
			}
		}
		return max;
	}
	public static double getMedian(double[] rn, int n)
	{
		double median = 0;
		double swapper = 0;
		for(int i = 0; i<n; i++)
		{
			for(int j = n-1; j>i; j--)
			{
				if(rn[j]<rn[j-1])
				{
					swapper = rn[j];
					rn[j] = rn[j-1];
					rn[j-1] = swapper;
				}
			}
		}
		double n1 = rn[49];
		double n2 = rn[50];
		median = (n1+n2)/2;
		return median;
	}
	public static double getStandardDeviation(double[] rn, int n)
	{
		double standardDeviation = 0;
		double avg = getAverage(rn, n);
		for(int i = 0; i<n; i++)
		{
			double temp = rn[i] - avg;
			rn[i] = temp*temp;
		}
		double avg2 = getAverage(rn, n);
		standardDeviation = Math.sqrt(avg2);
		return standardDeviation;
	}
}