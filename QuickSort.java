/** Program to sort a given number of elements using the HeapSort algorithm
 * Author - Suraj Jena
 * Last Updated : 12/31/13
 */
package apcs;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class QuickSort
{
	public static void main(String[] args)throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of random numbers to be generated");
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        array = Utilities.randomGenerator(n, 100);
        quickSort(array, 0, array.length - 1);
        for(int i = 0; i<array.length; i++)
        {
        	System.out.println(array[i]);
        }
    }
    public static void quickSort(int[] array, int lower, int upper)
    {
        if(lower<upper)
        {
        	int q = partition(array,lower,upper);
        	quickSort(array,lower,q);
        	quickSort(array,q+1,upper);
        }
    }
    public static int partition(int[] array, int lower, int upper)
    {
        int pivot = array[lower];
        int i = lower-1 ;
        int j = upper+1 ;
        while(true)
        {
            i++;
            while( i< upper && array[i] < pivot)
            {
                i++;
            }
            j--;
            while (j>lower && array[j] > pivot)
            {
                j--;
            }
            if (i < j)
                swap(array, i, j);
            else
                return j;
        }
    }
    public static void swap(int[] array, int i, int j)
    {
        int temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }
}