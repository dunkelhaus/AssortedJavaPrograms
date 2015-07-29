/* AP(r) Computer Science Assignment:
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
import java.io.*;
/** This class sorts entered numbers using the MergeSort algorithm
 * Takes in integer as well as double inputs
 * This class has been tested and verified by peers
 */
public class MergeSort
{
	static int[] array1;
	static int[] array2;
	static int length;
	public static void main(String[] args)throws IOException
	{
		int[] values = Utilities.manyIntegerInput("Enter the elements");
		sort(values);
		Utilities.printArray(array1);
	}
	public static void sort(int[] values)
	{
		array1 = values;
	    length = values.length;
	    array2 = new int[length];
	    mergeSort(0, length - 1);
	}
	private static void mergeSort(int lower, int higher)
	{
		if (lower < higher)
		{
			int middle = lower + (higher - lower) / 2;
			mergeSort(lower, middle);
			mergeSort(middle + 1, higher);
			merge(lower, middle, higher);
		}
	}
	private static void merge(int lower, int middle, int higher)
	{
		for(int i = lower; i <= higher; i++)
		{
			array2[i] = array1[i];
	    }
	    int i = lower;
	    int j = middle + 1;
	    int k = lower;
	    while(i <= middle && j <= higher)
	    {
		      if (array2[i] <= array2[j])
		      {
		    	  array1[k] = array2[i];
		    	  i++;
		      }
		      else
		      {
		    	  array1[k] = array2[j];
		    	  j++;
		      }
		      k++;
	    }
	    while(i <= middle)
	    {
		      array1[k] = array2[i];
		      k++;
		      i++;
	    }
	}
} 