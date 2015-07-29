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
/** This class calculates the GCD of 2 numbers
 * Takes in 2 integers inputs
 * This class has been tested and verified by peers
 */
public class Euclidian
{
	static int div = 0;
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int gcd = euclidian(a, b);
		System.out.println("GCD = "+gcd);
	}
	public static int euclidian(int a, int b)
	{
		while(a!=0 && b!=0)
		{
			int c = b;
			b = a % b;
			a = c;
		}
		return a+b;
	}
}