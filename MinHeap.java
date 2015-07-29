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
import java.io.IOException;
/** This class sorts entered numbers using the HeapSort algorithm
 * Takes in integer as well as double inputs
 * This class has been tested and verified by peers
 */
public class MinHeap
{
    static int length;
    public static void main(String[] args)throws IOException
    { 
    	int[] array;
        array = Utilities.manyIntegerInput("Enter the elements");
        sort(array); 
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " "); 
        } 
    }
    public static void heapify(int[] array)
    { 
        length = array.length-1; 
        for(int i = length/2; i >= 0; i--)
        { 
            minheap(array, i); 
        } 
    } 
    public static void minheap(int[] array, int i)
    { 
    	int left; 
        int right; 
        int largest;
        left=2*i; 
        right=2*i+1; 
        if(left <= length && array[left] > array[i])
        { 
           largest=left; 
        } 
        else
        { 
           largest=i; 
        } 
        if(right <= length && array[right] > array[largest])
        { 
            largest=right; 
        } 
        if(largest!=i)
        { 
            swap(array, i,largest); 
            minheap(array, largest); 
        } 
    }
    public static void swap(int[] array, int i, int j)
    { 
        int temporary = array[i]; 
        array[i] = array[j]; 
        array[j] = temporary; 
    }
    public static void sort(int[] array)
    { 
        heapify(array); 
        for(int i = length; i>0; i--)
        { 
            swap(array, 0, i); 
            length = length-1; 
            minheap(array, 0); 
        } 
    }
}
