/**Program to find the Nth prime number
 * N taken as input 
 * Date last updated : 12/3/2013
 * Author : Suraj Jena
 * Homework 2
 */
package apcs;
import java.io.*;
public class PrimeNth
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter N");
		long n = Long.parseLong(br.readLine());
		long val = numberFinder(n);
		System.out.println(val);
    }
	/* Method to find prime number and use isPrime to check it
	 * Returns the prime number, a long
	 */
	public static long numberFinder(long n)
	{
	    long num;
	    int count = 0;
	    for(num = 2; count < n; num++)
	    {
	        if (isPrime(num))
	        {
	            count++;
	        }
	    }
	    return num-1;
	}
	/* Method to check if the number found by numberFinder is prime or not
	 * Returns boolean
	 */
	public static boolean isPrime(long n)
	{
	    for(int i = 2; i < n; i++)
	    {
	        if (n % (long)i == 0)
	        {
	            return false;
	        }
	    }
	    return true;
	}
}