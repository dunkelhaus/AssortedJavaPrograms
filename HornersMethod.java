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
/** This class uses the horner method calculating polynomials
 * This class has been tested and verified.
 */
public class HornersMethod
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the degree");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Enter x");
		int x = Integer.parseInt(br.readLine());
		double[] coefficients = new double[n+1];
		for(int i = 0; i<=n; i++)
		{
			System.out.println("Enter the "+(i+1)+"th value");
			coefficients[i] = Double.parseDouble(br.readLine());
		}
		double value = horner(coefficients, x, n);
		System.out.println("Value = "+value);
	}
	public static double horner(double[] coefficients, int x,  int length)
	{
		int n = coefficients.length - 1;
		double temp = coefficients[n];
		for(int i = 1; i <= n; i++)
		{
			temp = (temp*x) + coefficients[n - i];
		}
		return temp;
	}
}
