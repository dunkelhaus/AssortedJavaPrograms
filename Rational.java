package apcs;
/**
 * This class runs various operations on Rational numbers.
 * It is a child of the Number class and implements the Comparable interface.
 * It has 2 parameters, the global variables, which are numerator and denominator.
 * Every Rational number is simplified on construction.
 */
public class Rational extends Number implements Comparable
{
	private long numerator;
	private long denominator;
	public Rational()
	{
		numerator = 0;
		denominator = 1;
	}
	public Rational(long nNumerator, long nDenominator)
	{
		if(nNumerator < 0 && nDenominator < 0)
		{
			nNumerator = Math.abs(nNumerator);
			nDenominator = Math.abs(nDenominator);
		}
		if(nDenominator < 0)
		{
			nNumerator = (nNumerator*2)-nNumerator;
		}
		if(nDenominator == 0)
		{
			System.out.println("Not a Rational number; Denominator cannot be zero.");
		}
		long gcd = gcd(nNumerator, nDenominator);
		numerator = nNumerator/gcd;
		denominator = nDenominator/gcd;
	}
	public Rational(long top)
	{
		numerator = top;
		denominator = 1;
	}
	public Rational(double number)
	{
		long n = (long)number;
		long d = 1;
		while(n < number)
		{
			number*=10;
			d*=10;
			n = (int)number;
		}
		long gcd = gcd((long)number, d);
		numerator = n / gcd;
		denominator = d / gcd;
	}
	/*
	 * Method: This method finds the greatest common divisor of two numbers
	 * Precondition: Takes in two long variables.
	 * Postcondition: Returns the greatest common divisor, a long number.
	 */
	public long gcd(long top, long bottom)
	{
		while(top!=0 && bottom!=0)
		{
			long c = bottom;
			bottom = top % bottom;
			top = c;
		}
		long gcd = top + bottom;
		return gcd;
	}
	@Override
	/*
	 * Method: This method converts Rational to long
	 * Precondition: Converts calling object
	 * Postcondition: Returns a long number.
	 */
	public long longValue()
	{
		return ((long)this.toDouble());
	}
	@Override
	/*
	 * Method: This method converts Rational to double
	 * Precondition: Converts calling object
	 * Postcondition: Returns a double number.
	 */
	public double doubleValue()
	{
		return (this.toDouble());
	}
	@Override
	/*
	 * Method: This method converts Rational to float
	 * Precondition: Converts calling object
	 * Postcondition: Returns a float number.
	 */
	public float floatValue()
	{
		float a = numerator/denominator;
		return a;
	}
	@Override
	/*
	 * Method: This method converts Rational to int.
	 * Precondition: Converts calling object
	 * Postcondition: Returns a int number.
	 */
	public int intValue()
	{
		int a = (int)numerator/(int)denominator;
		return a;
	}
	/*
	 * Method: Adds two rational numbers.
	 * Precondition: Enter a Rational number as parameter,the other one is the invoking object.
	 * Postcondition: Returns the result of addition, a Rational number.
	 */
	public Rational add(Rational r)throws RationalOutOfRangeException
    {
        if(Math.abs((double)numerator * (double)r.denominator) > Long.MAX_VALUE)
                         throw new RationalOutOfRangeException("End");
        if(Math.abs((double)denominator * (double)r.numerator) > Long.MAX_VALUE)
                         throw new RationalOutOfRangeException("End");
        if(Math.abs((double)denominator * (double)r.denominator) > Long.MAX_VALUE)
                         throw new RationalOutOfRangeException("End");
		long n = (numerator * r.denominator)+(r.numerator * denominator);
		long d = denominator * r.denominator;
		return (new Rational(n, d));
	}
	/*
	 * Method: Adds a rational number and a long.
	 * Precondition: Enter a Rational number as parameter,the other one is the invoking object.
	 * Postcondition: Returns the result of addition, a Rational number.
	 */
	public Rational add(long a)
    {
		Rational r = new Rational(a, 1);
		long n = (numerator * r.denominator)+(r.numerator * denominator);
		long d = denominator * r.denominator;
		return (new Rational(n, d));
	}
	/*
	 * Method: (Static method) Adds two rational numbers.
	 * Precondition: Enter 2 Rational numbers as parameters
	 * Postcondition: Returns the result of addition, a Rational number.
	 */
	public static Rational add(Rational r1, Rational r2)
	{
		long n = (r2.numerator * r1.denominator)+(r1.numerator * r2.denominator);
		long d = r2.denominator * r1.denominator;
		return (new Rational(n, d));
	}
	/*
	 * Method: Subtracts two rational numbers.
	 * Precondition: Enter a Rational number as parameter, the other one is the invoking object.
	 * Postcondition: Returns the result of subtraction, a Rational number.
	 */
	public Rational subtract(Rational r)
	{
		long n = (numerator * r.denominator)-(r.numerator * denominator);
		long d = denominator * r.denominator;
		return (new Rational(n, d));
	}
	/*
	 * Method: Subtracts two rational numbers.
	 * Precondition: Enter 2 Rational numbers as parameters
	 * Postcondition: Returns the result of subtraction, a Rational number.
	 */
	public static Rational subtract(Rational r1, Rational r2)
	{
		long n = (r2.numerator * r1.denominator)-(r1.numerator * r2.denominator);
		long d = r2.denominator * r1.denominator;
		return (new Rational(n, d));
	}
	/*
	 * Method: Subtracts a rational number and a long.
	 * Precondition: Enter a Rational number as parameter, the other one is the invoking object.
	 * Postcondition: Returns the result of subtraction, a Rational number.
	 */
	public Rational subtract(long a)
	{
		Rational r = new Rational(a, 1);
		long n = (numerator * r.denominator)-(r.numerator * denominator);
		long d = denominator * r.denominator;
		return (new Rational(n, d));
	}
	
	/*
	 * Method: Multiplies two rational numbers.
	 * Precondition: Enter a Rational number as parameter, the other one is the invoking object.
	 * Postcondition: Returns the result of multiplication, a Rational number.
	 */
	public Rational multiply(Rational r)
	{
		long n = numerator * r.numerator;
		long d = denominator * r.denominator;
		return (new Rational(n, d));
	}
	/*
	 * Method: Multiplies two rational numbers.
	 * Precondition: Enter 2 Rational numbers as parameters
	 * Postcondition: Returns the result of multiplication, a Rational number.
	 */
	public static Rational multiply(Rational r1, Rational r2)
	{
		long n = r2.numerator * r1.denominator;
		long d = r2.denominator * r1.denominator;
		return (new Rational(n, d));
	}
	/*
	 * Method: Multiplies a rational number and a long.
	 * Precondition: Enter a Rational number as parameter, the other one is the invoking object.
	 * Postcondition: Returns the result of multiplication, a Rational number.
	 */
	public Rational multiply(long a)
	{
		Rational r = new Rational(a, 1);
		long n = numerator * r.numerator;
		long d = denominator * r.denominator;
		return (new Rational(n, d));
	}
	/*
	 * Method: Divides two rational numbers.
	 * Precondition: Enter a Rational number as parameter, the other one is the invoking object.
	 * Postcondition: Returns the result of division, a Rational number.
	 */
	public Rational divide(Rational r)
	{
		long n = numerator * r.denominator;
		long d = denominator * r.numerator;
		return (new Rational(n, d));
	}
	/*
	 * Method: Divides two rational numbers.
	 * Precondition: Enter 2 Rational numbers as parameters
	 * Postcondition: Returns the result of division, a Rational number.
	 */
	public static Rational divide(Rational r1, Rational r2)
	{
		long n = r2.numerator * r1.denominator;
		long d = r2.denominator * r1.numerator;
		return (new Rational(n, d));
	}
	/*
	 * Method: Divides a rational number and a long.
	 * Precondition: Enter a Rational number as parameter, the other one is the invoking object.
	 * Postcondition: Returns the result of division, a Rational number.
	 */
	public Rational divide(long a)
	{
		Rational r = new Rational(a, 1);
		long n = numerator * r.denominator;
		long d = denominator * r.numerator;
		return (new Rational(n, d));
	}
	/*
	 * Method: Raises a rational number to a double power.
	 * Precondition: Enter a double exponent.
	 * Postcondition: Returns the Rational number raised to the respective power.
	 */
	public Rational power(double power)
	{
		if(power >= 0)
		{
			long n = (long)Math.pow(numerator, power);
			long d = (long)Math.pow(denominator, power);
			return (new Rational(n, d));
		}
		else
		{
			long n = (long)Math.pow(denominator, -power);
			long d = (long)Math.pow(numerator, -power);
			return (new Rational(n, d));
		}
	}
	/*
	 * Method: Raises a rational number to a Rational power.
	 * Precondition: Enter a double exponent.
	 * Postcondition: Returns the Rational number raised to the respective power.
	 */
	public Rational power(Rational power)
	{
		if(power.toDouble() >= 0)
		{
			long n = (long)Math.pow(numerator, power.toDouble());
			long d = (long)Math.pow(denominator, power.toDouble());
			return (new Rational(n, d));
		}
		else
		{
			long n = (long)Math.pow(denominator, -(power.toDouble()));
			long d = (long)Math.pow(numerator, -(power.toDouble()));
			return (new Rational(n, d));
		}
	}
	@Override
	/*
	 * Method: Convert Rational number to String format
	 * Precondition: Converts calling object to String format
	 * Postcondition: Returns converted String.
	 */
	public String toString()
    {
        return "(" + numerator + "/" + denominator + ")";
    }
	/*
	 * Method: Convert Rational Number to Double format
	 * Precondition: Converts calling object to Double
	 * Postcondition: Returns converted double.
	 */
	public double toDouble()
    {
    	return (double) numerator / denominator;
    }
	/*
	 * Method: Implements the compareTo method in the Comparable Interface
	 * Precondition: Takes in an object to be compared to the calling object
	 * Postcondition: Returns a negative number if calling object is less than parameter, 
	 * positive if greater, and zero if equal. If they are of different classes, returns -999.
	 */
	public int compareTo(Object o)
	{
		if (o.getClass() != this.getClass()) 
		{
        	System.out.println("Error");
        	return -999;
		}
		Rational r = (Rational)o;
		return (int) ((int) (numerator * r.denominator)-(denominator * r.numerator)) ;
	}
	/*
	 * Method: Find the square root of Rational number.
	 * Precondition: Finds square root of calling object.
	 * Postcondition: Returns double answer.
	 */
	public double squareRoot()throws RationalOutOfRangeException
	{
		Rational num, num2;
		num = new Rational(1,1);
		num = this.divide(new Rational(2));
		double error;
		try
		{
			do
		    {
		        num2 = this.divide(num);
		        num2 = num2.add(num);
		        num2 = num2.divide(new Rational(2));
		        error = Math.abs(num2.toDouble() - num.toDouble());
		        num = num2;
		        System.out.println( num+"\t"+num.toDouble() );
		    }while(error > 0.000001);
		}
		catch(RationalOutOfRangeException e) 
        { 
            System.out.println("Error - " + e.getMessage()); 
        }   
		return (num.toDouble());
	}
	/*
	 * Method: Find the square root of Rational number to an entered error.
	 * Precondition: Finds square root of calling object.
	 * Postcondition: Returns double answer.
	 */
	public double squareRootToNearestEpsilon(double epsilon)throws RationalOutOfRangeException
	{
		Rational num, num2;
		num = new Rational(1,1);
		num = this.divide(new Rational(6));
		double error;
		try
		{
			do
		    {
		        num2 = this.divide(num);
		        num2 = num2.add(num);
		        num2 = num2.divide(new Rational(2));
		        error = Math.abs(num2.toDouble() - num.toDouble());
		        num = num2;
		        System.out.println( num+"\t"+num.toDouble() );
		    }while(error > epsilon);
		}
		catch(RationalOutOfRangeException e) 
        { 
            System.out.println("Error - " + e.getMessage()); 
        }   
		return (num.toDouble());
	}/*
	 * Method: Implements equals method in Comparable interface.
	 * Precondition: Checks if calling object = passed object.
	 * Postcondition: Returns boolean.
	 */
	public boolean equals(Object o)
	{
        if (o == null) 
        	return false;
        if (o.getClass() != this.getClass()) 
        	return false;
        Rational r = (Rational) o;
        return (compareTo(r) == 0?true:false);
    }
	/*
	 * Method: Finds the reciprocal of the calling object
	 * Precondition: Uses calling object
	 * Postcondition: Returns a Rational
	 */
	public Rational reciprocal()
	{
		return (new Rational(denominator, numerator));
	}
	/*
	 * Method: Finds the negative of the calling object
	 * Precondition: Uses calling object
	 * Postcondition: Returns a Rational
	 */
	public Rational negative()
	{
		return (new Rational(-numerator, denominator));
	}
	/*
	 * Method: Finds the absolute value of the calling object
	 * Precondition: Uses calling object
	 * Postcondition: Returns a Rational
	 */
	public Rational absoluteValue()
	{
		return (new Rational(((long)Math.abs(numerator)), ((long)Math.abs(denominator))));
	}
	/*
	 * Method: Sorts an array of Rational numbers
	 * Precondition: Takes in a Rational array and the number of elements
	 * Postcondition: Returns an array of Rationals
	 */
	public static Rational[] sort(Rational[] r, int n)
	{
		Rational temp;
		for(int i = 0; i<n; i++)
		{
			for(int j = i+1; j<n; j++)
			{
				Rational x = r[i];
				Rational y = r[j];
				if(x.compareTo(y) > 0)
				{
					temp = r[i];
					r[i] = r[j];
					r[j] = temp;
				}
			}
		}
		return r;
	}
}