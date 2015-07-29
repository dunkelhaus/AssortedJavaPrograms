/* Computer Science Home Utility:
 * Copyright(c) 2013-2014 Suraj K. Jena
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Suraj Jena
 */
package apcs;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Utilities
{
	public static int[] randomGenerator(int size, double bound)
	{
		int[] arr = new int[size];
		for(int i = 0; i<size; i++)
		{
			arr[i] = (int)(bound*Math.random())+1;
		}
		return arr;
	}
	public static double[] dRandomGenerator(int size, double bound)
	{
		double[] arr = new double[size];
		for(int i = 0; i<size; i++)
		{
			arr[i] = (bound*Math.random())+1;
		}
		return arr;
	}
	public static int oneIntegerInput(String str)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(str);
		int n = Integer.parseInt(br.readLine());
		return n;
	}
	public static String oneStringInput(String str)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(str);
		String n = br.readLine();
		return n;
	}
	public static double oneDoubleInput(String str)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(str);
		double n = Double.parseDouble(br.readLine());
		return n;
	}
	public static int[] manyIntegerInput(String str)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length");
		int l = Integer.parseInt(br.readLine());
		int[] array = new int[l];
		System.out.println(str);
		for(int i = 0; i<l; i++)
		{
			System.out.println("Enter the "+(i+1)+"th element");
			array[i] = Integer.parseInt(br.readLine());
		}
		return array;
	}
	public static double[] manyDoubleInput(String str, int l)throws IOException
	{
		double[] array = new double[l];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(str);
		for(int i = 0; i<l; i++)
		{
			System.out.println("Enter the "+(i+1)+"th element");
			array[i] = Double.parseDouble(br.readLine());
		}
		return array;
	}
	public static String[] manyStringInput(String str, int l)throws IOException
	{
		String[] array = new String[l];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(str);
		for(int i = 0; i<l; i++)
		{
			System.out.println("Enter the "+(i+1)+"th element");
			array[i] = br.readLine();
		}
		return array;
	}
	public static void printArray(int[] n)
	{
		for(int j = 0; j < n.length; j++)
		{
			System.out.print(n[j]+" ");
		}
	}
	public static void bootstrap(int[] data)
	{
		int n = data.length;
		double[] mean = new double[1000];
		for(int i = 0; i < 1000; i++)
		{
			mean[i] = resampleAndMean(data);
		}
		
	}
	public static double resampleAndMean(int[] data)
	{
		int n = data.length;
		int[] resampled = new int[n];
		int s = 0;
		for(int i = 0; i < n; i++)
		{
			int index = (int)((n-1)*Math.random());
			resampled[i] = data[index];
			s += resampled[i];
		}
		double mean = (double)s/(double)(n-1);
		return mean;
	}
	public static double milliTimeToSeconds(long[] l, int times)
	{
		long s = 0;
		for(int i = 0; i<times; i++)
		{
			s += l[i];
		}
		long mean = s/times;
		double time = (double)mean/1000;
		return time;
	}
	public static double nanoTimeToSeconds(long[] l, int times)
	{
		long s = 0;
		for(int i = 0; i<times; i++)
		{
			s += l[i];
		}
		long mean = s/times;
		double time = (double)mean/1000000000;
		return time;
	}
}
