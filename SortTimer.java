/* AP Computer Science Assignment:
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
/** This class calculates the time taken to sort a set of randomized numbers
 * This class has been tested and verified by peers
 */
public class SortTimer
{
	public static void main(String[] args)throws IOException
	{
		int ch = 0;
		do
		{
			ch = Utilities.oneIntegerInput("Which sort do you want to time? \n1. Bubble Sort\n2. Selection Sort\n3. Insertion Sort\n4. Merge Sort\n5. Quick Sort\n6. Heap Sort ");
			int bound = Utilities.oneIntegerInput("Enter the number of values to be sorted");
			double time = timer(ch, bound);
			System.out.println("The Time Taken in Seconds is: "+time);
			ch = Utilities.oneIntegerInput("Enter 1 to time another sort.\nEnter 0 to exit.");
		}while(ch != 0);
	}
	public static double timer(int ch, int bound)
	{
		if(ch == 1)
		{
			double[] input = new double[bound];
			double[] input2 = new double[bound];
			input = Utilities.dRandomGenerator(bound, 1000000000);
			System.arraycopy(input, 0, input2, 0, bound);
			long start = 0, end = 0;
			long[] estimates = new long[100];
			for(int i = 0; i < 100; i++)
			{
				System.arraycopy(input2, 0, input, 0, bound);
				start = System.nanoTime();
				BubbleSort.bubbleSort(input, bound);
				end = System.nanoTime();
				estimates[i] = end-start;
			}
			double timeInSeconds = Utilities.nanoTimeToSeconds(estimates, 100);
			return timeInSeconds;
		}
		else if(ch == 2)
		{
			double[] input = new double[bound];
			double[] input2 = new double[bound];
			input = Utilities.dRandomGenerator(bound, 1000000000);
			System.arraycopy(input, 0, input2, 0, bound);
			long start = 0, end = 0;
			long[] estimates = new long[100];
			for(int i = 0; i < 100; i++)
			{
				System.arraycopy(input2, 0, input, 0, bound);
				start = System.nanoTime();
				SelectionSort.selectSort(input, bound);
				end = System.nanoTime();
				estimates[i] = end-start;
			}
			double timeInSeconds = Utilities.nanoTimeToSeconds(estimates, 100);
			return timeInSeconds;
		}
		else if(ch == 3)
		{
			double[] input = new double[bound];
			double[] input2 = new double[bound];
			input = Utilities.dRandomGenerator(bound, 1000000000);
			System.arraycopy(input, 0, input2, 0, bound);
			long start = 0, end = 0;
			long[] estimates = new long[100];
			for(int i = 0; i < 100; i++)
			{
				System.arraycopy(input2, 0, input, 0, bound);
				start = System.nanoTime();
				InsertionSort.insertSort(input, bound);
				end = System.nanoTime();
				estimates[i] = end-start;
			}
			double timeInSeconds = Utilities.nanoTimeToSeconds(estimates, 100);
			return timeInSeconds;
		}
		else if(ch == 4)
		{
			int[] input = new int[bound];
			int[] input2 = new int[bound];
			input = Utilities.randomGenerator(bound, 1000000000);
			System.arraycopy(input, 0, input2, 0, bound);
			long start = 0, end = 0;
			long[] estimates = new long[100];
			for(int i = 0; i < 100; i++)
			{
				System.arraycopy(input2, 0, input, 0, bound);
				start = System.nanoTime();
				MergeSort.sort(input);
				end = System.nanoTime();
				estimates[i] = end-start;
			}
			double timeInSeconds = Utilities.nanoTimeToSeconds(estimates, 100);
			return timeInSeconds;
		}
		else if(ch == 5)
		{
			int[] input = new int[bound];
			int[] input2 = new int[bound];
			input = Utilities.randomGenerator(bound, 1000000000);
			System.arraycopy(input, 0, input2, 0, bound);
			long start = 0, end = 0;
			long[] estimates = new long[100];
			for(int i = 0; i < 100; i++)
			{
				System.arraycopy(input2, 0, input, 0, bound);
				start = System.nanoTime();
				QuickSort.quickSort(input, 0, bound-1);
				end = System.nanoTime();
				estimates[i] = end-start;
			}
			double timeInSeconds = Utilities.nanoTimeToSeconds(estimates, 100);
			return timeInSeconds;
		}
		else if(ch == 6)
		{
			int[] input = new int[bound];
			int[] input2 = new int[bound];
			input = Utilities.randomGenerator(bound, 1000000000);
			System.arraycopy(input, 0, input2, 0, bound);
			long start = 0, end = 0;
			long[] estimates = new long[100];
			for(int i = 0; i < 100; i++)
			{
				System.arraycopy(input2, 0, input, 0, bound);
				start = System.nanoTime();
				MinHeap.sort(input);
				end = System.nanoTime();
				estimates[i] = end-start;
			}
			double timeInSeconds = Utilities.nanoTimeToSeconds(estimates, 100);
			return timeInSeconds;
		}
		else
		{
			System.out.println("Wrong Choice");
			return 0;
		}
	}
}
