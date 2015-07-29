/**
 * Program to perform various operations on the complex class
 * Author : Suraj Jena
 * Subject :Computer Science
 */
package apcs;
import java.io.*;
public class Complex
{
	private double real; //real part
	private double imaginary; //imaginary part
	//Complete Constructor
	public Complex(double real2,double imaginary2)
	{
		real=real2;
		imaginary=imaginary2;
	}
	//one argument constructor
	public Complex(double onevalue)
	{
		real = onevalue; 
		imaginary = 0;
	}
	//no argument constructor
	public Complex()
	{
		real = 0;
		imaginary = 0;
	}
	//copy constructor
	public Complex(Complex number)
	{
		real = number.real;
		imaginary = number.imaginary;
	}
	/* Precondition:takes the number to be added and uses other number as the invoking object 
	 * Postcontition:Returns a complex number, the result of the addition
	 */
	public Complex add(Complex number)
	{
		double addend1 = real+number.real;
		double addend2 = imaginary+number.imaginary;
		return(new Complex(addend1, addend2));
	}
	/* Precondition:Uses the components of the calling object, and takes in input from the user
	 * Postcondition:Returns the result of addition
	 */
	public Complex add()throws IOException
	{
		double finalx = 0.0;
		double finaly = 0.0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of complex numbers to be added (including the previously entered number)");
		int length = Integer.parseInt(br.readLine());
		Complex[] addends = new Complex[length];
		addends[0] = new Complex(real, imaginary);
		String numberPrime = "";
		Complex number = new Complex();
		for(int i = 1; i < length; i++)
		{
			System.out.println("Enter the "+(i+1)+"th number in Complex Notation.");
			numberPrime = br.readLine();
			addends[i] = number.toComplex(numberPrime);
		}
		for(int i = 0; i < length; i++)
		{
			Complex addend = new Complex();
			addend = addends[i];
			finalx += addend.real;
			finaly += addend.imaginary;
		}
		return(new Complex(finalx, finaly));
	}
	/* Precondition:Takes in a complex number and subtracts it from invoking number
	 * Postcondition:Returns a new complex number, the result of subtraction
	 */
	public Complex subtract(Complex number)throws IOException
	{
		double subtrahend1 = real - number.real;
		double subtrahend2 = imaginary - number.imaginary;
		return( new Complex(subtrahend1, subtrahend2));
	}
	/* Precondition:Uses the components of the calling object, and takes in input from the user
	 * Postcondition:Returns the result of subtraction, a complex number
	 */
	public Complex subtract()throws IOException
	{
		double finalReal = 0.0;
		double finalImaginary = 0.0;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number of complex numbers to be subtracted (including the previously entered number)");
			int length = Integer.parseInt(br.readLine());
			Complex[] subtrahends = new Complex[length];
			subtrahends[0] = new Complex(real, imaginary);
			String numberPrime = "";
			Complex number = new Complex();
			for(int i = 1; i < length; i++)
			{
				System.out.println("Enter the "+(i+1)+"th number in Complex Notation.");
				numberPrime = br.readLine();
				subtrahends[i] = number.toComplex(numberPrime);
			}
			for(int i = 0; i < length; i++)
			{
				Complex subtrahend = new Complex();
				subtrahend = subtrahends[i];
				finalReal -= subtrahend.real;
				finalImaginary -= subtrahend.imaginary;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return(new Complex(finalReal, finalImaginary));
	}
	/* Precondition:Only takes in the invoking object
	 * Postcondition:Returns new complex, the conjugate
	 */
	public Complex conjugate()
	{
		return(new Complex(real, -imaginary));
	}
	/* Precondition:Only takes in invoking object
	 * Postcondition:Returns double value, the magnitude
	 */
	public double magnitude()
	{
		return (Math.sqrt(real*real+imaginary*imaginary));
	}
	/* Precondition:Only takes in invoking object
	 * Postcondition:Returns a String, the complex number in proper notation
	 */
	@Override
	public String toString()
	{	
		String complexNotation = "";
		String imaginaryString = String.valueOf(imaginary);
		char sign = imaginaryString.charAt(0);
		String newImaginary = imaginaryString.substring(1);
		if(sign == '-')
			complexNotation = real + "-" + newImaginary +"i";
		else 
			complexNotation = real + "+" + imaginary+"i";
		return complexNotation;
	}
	/* Precondition:Takes in a complex number as factor and invoking object
	 * Postcondition:returns new complex, the product
	 */
	public Complex multiply(Complex number)
	{
		double productReal = (real*number.real) - (imaginary*number.imaginary);
		double productImaginary = (real*number.imaginary) + (imaginary*number.real);
		return(new Complex(productReal, productImaginary));
	}
	/* Precondition:Takes in the denominator and the invoking object
	 * Postcondition:Returns new complex, the result of the division by double value
	 */
	public Complex divideByNumber(double denominator)
	{
		double newReal = real/denominator;
		double newImaginary = imaginary/denominator;
		return(new Complex(newReal, newImaginary));
	}
	/* Precondition:Takes in a complex number
	 * Postcondition:Returns the result of the division by the entered Complex number
	 */
	public Complex divideComplex(Complex number)
	{
		double newReal = 0.0;
		double newImaginary = 0.0;
		double denominator = number.real * number.real + number.imaginary * number.imaginary;
		newReal = (real * number.real + imaginary * number.imaginary)/(denominator); 
		newImaginary = (real * number.imaginary*-1 + imaginary * number.real)/(denominator);
		return(new Complex(newReal, newImaginary));
	}
	/* Precondition:Uses the invoking object
	 * Postcondition:returns the inverse of complex object
	 */
	public Complex inverse() {
		double absSquared=real*real+imaginary*imaginary;
		return new Complex(real/absSquared, imaginary/absSquared);
	}
	/* Precondition:Takes in a complex number
	 * Postcondition:Compares it to the calling object and returns boolean
	 */
	public boolean equals(Complex number)
	{
		if(real == number.real && imaginary == number.imaginary)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/* Precondition:Uses the components of the calling object 
	 * Postcondition:Returns a new Complex number, the reciprocal
	 */
	public Complex reciprocal()
	{
		double denominator = real*real + imaginary * imaginary;
		Complex answer = new Complex(real, -imaginary);
		answer = answer.divideByNumber(denominator);
		return answer;
	}
	/* Precondition:Takes in double exponent and raises the complex to that exponent
	 * Postcondition:Returns a complex number, the raised complex
	 */
	public Complex power(double exponent)
	{
		Complex answer = new Complex();
		if(exponent%1 == 0)
		{
			if(exponent < 0)
			{
				double exp = Math.abs(exponent);
				Complex base = new Complex(1.0, 0.0);
				for(int i = 1; i <= exp; i++)
				{
					base = base.multiply(this);
				}
				return (base);
			}
			else
			{
				Complex base = new Complex(1.0, 0.0);
				for(int i = 1; i <= exponent; i++)
				{
					base = base.multiply(this);
				}
				return (base);
			}
		}
		else
		{
			if(exponent < 0)
			{
				double exp = Math.abs(exponent);
				Complex base = new Complex(real, imaginary);
				String number = String.valueOf(exp);
				int index = number.indexOf('.');
				String previous = number.substring(0, index);
				String figures = number.substring(index+1);
				number = previous+figures;
				int length = figures.length();
				int numerator = Integer.parseInt(number);
				System.out.println(numerator);
				int denominator = (int)Math.pow(10, length);
				System.out.println(denominator);
				answer = base.power(numerator+"/"+(-denominator));
				return answer;
			}
			else
			{
				Complex base = new Complex(real, imaginary);
				String number = String.valueOf(exponent);
				int index = number.indexOf('.');
				String previous = number.substring(0, index);
				String figures = number.substring(index+1);
				number = previous+figures;
				int length = figures.length();
				int numerator = Integer.parseInt(number);
				System.out.println(numerator);
				int denominator = (int)Math.pow(10, length);
				System.out.println(denominator);
				answer = base.power(numerator+"/"+(denominator));
				return answer;
			}
		}
	}
	/* Precondition:Uses the components of the calling object
	 * Postcondition:returns a new complex, the natural logarithm of the original
	 */
	public Complex naturalLog()
	{
		Complex number = new Complex(real, imaginary);
		double newReal = Math.log(number.magnitude());
		double newImaginary = number.argandAngle();
		if(newImaginary > Math.PI)
		{
			newImaginary -= 2.0*Math.PI;
		}
		return( new Complex(newReal, newImaginary));
	}
	/* Precondition:Takes in number of complex numbers to be sorted
	 * Postcondition:Returns sorted array
	 */
	public Complex[] sortComplex(int length)throws IOException
	{
		String numberPrime = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Complex[] numbers = new Complex[length];
		Complex number = new Complex();
		for(int i = 0; i < length; i++)
		{
			System.out.println("Enter the "+(i+1)+"th number in Complex Notation.");
			numberPrime = br.readLine();
			numbers[i] = number.toComplex(numberPrime);
		}
		double newNumber1 = 0.0;
		double newNumber2 = 0.0;
		for(int i = 0; i<numbers.length; i++)
		{
			for(int j = 0; j<numbers.length-1; j++)
			{
				newNumber1 = numbers[j].magnitude();
				newNumber2 = numbers[j+1].magnitude();
				if(newNumber1 > newNumber2)
				{
					number = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = number;
				}
			}
		}
		return numbers;
	}
	/* Precondition:takes in a complex number
	 * Postcondition:returns a complex number, result of the complex number raised to exponent
	 */
	public Complex power(Complex number)
	{
		Complex base = new Complex(real, imaginary);
		double rho = base.magnitude();
		double angle = Math.atan(imaginary/real);
		double factor = Math.pow(rho, number.real)*(Math.pow(Math.E, -number.imaginary*angle));
		double component = (number.real * angle) + (number.imaginary * Math.log(rho));
		double answerReal = factor * Math.cos(component);
		double answerImaginary = factor * Math.sin(component);
		return(new Complex(answerReal, answerImaginary));
	}
	/* Precondition:Takes in fraction in string format
	 * Postcondition:Returns a complex number, the result of raising the number to fractional exponent
	 */
	public Complex power(String fraction)
	{
		Complex base = new Complex(real, imaginary);
		int indexOperand = -1;
		Complex answer = new Complex(1,1);
		indexOperand = fraction.indexOf('/');
		
		if(indexOperand == -1)
		{
			answer = answer.power(String.valueOf(fraction.trim()));
			return answer;
		}
		else
		{
			double numerator = Double.parseDouble(fraction.substring(0, indexOperand));
			double denominator = Double.parseDouble(fraction.substring(indexOperand+1));
			if(numerator < 0 && denominator < 0)
			{
				numerator = Math.sqrt(Math.pow(numerator, 2));
				denominator = Math.sqrt(Math.pow(denominator, 2));
			}
			if(numerator != 1)
			{
				if( numerator > 0 && denominator > 0)
				{
					double k = 0;
					double power = 1/denominator;
					double theta = Math.atan(imaginary/real);
					double component = (theta + 2*Math.PI*k)/denominator;
					double newReal = Math.cos(component)*Math.pow(base.magnitude(), power);
					double newImaginary = Math.sin(component)*Math.pow(base.magnitude(), power);
					Complex ans = new Complex(newReal, newImaginary);
					ans = ans.power(numerator);
					return ans;
				}
				else
				{
					answer = base.egyptianPower(denominator);
					answer = answer.power(numerator);
					return answer;
				}
			}
			else {
				double k = 0;
				double power = 1/denominator;
				double theta = Math.atan(imaginary/real);
				double component = (theta + 2*Math.PI*k)/denominator;
				double newReal = Math.cos(component)*Math.pow(base.magnitude(), power);
				double newImaginary = Math.sin(component)*Math.pow(base.magnitude(), power);
				Complex ans = new Complex(newReal, newImaginary);
				return ans;
			}
		}
	}
	/* Precondition:Takes in a double value, denominator, along with the 
	 * Postcondition:Returns a new complex, the number raised to the fraction
	 */
	public Complex egyptianPower(double denominator)
	{
		Complex base = new Complex(real, imaginary);
		double k = 0;
		double power = 1/denominator;
		double theta = Math.atan(imaginary/real);
		double component = (theta + 2*Math.PI*k)/denominator;
		double newReal = Math.cos(component)*Math.pow(base.magnitude(), power);
		double newImaginary = Math.sin(component)*Math.pow(base.magnitude(), power);
		Complex ans = new Complex(newReal, newImaginary);
		return ans;
	}
	/* Precondition:Uses the calling object to calculate square root
	 * Postcondition:Returns the answer of the square root
	 */
	public Complex squareRoot()
	{
		double answerReal = Math.sqrt((real + Math.sqrt((Math.pow(real, 2) + Math.pow(imaginary, 2)))) / 2);
		double answerImaginary = (imaginary / Math.abs(imaginary)) * (Math.sqrt(((-real) + Math.sqrt((Math.pow(real, 2) + Math.pow(imaginary, 2)))) / 2));
		return(new Complex(answerReal, answerImaginary));
	}
	/* Precondition:Uses the calling object values to calculate the angle
	 * Postcondition:Returns the angle in radians
	 */
	public double argandAngle()
	{
		double angleInclination = Math.atan2(imaginary, real);
		return angleInclination;
	}
	/* Precondition:Converts the object components to polar format
	 * Postcondition:Returns the polar coordinates
	 */
	public Complex toPolar()
	{
		double radius = Math.sqrt((real * real + imaginary * imaginary));
		double angleTemporary = Math.atan2(real, imaginary);
		double angleFinal = 90 - ((angleTemporary * 180)/Math.PI);
		return(new Complex(radius, angleFinal));
	}
	/* Precondition:Takes in the polar coordinates
	 * Postcondition:Returns the rectangular coordinates
	 */
	public Complex toRectangular(double magnitude, double angle)
	{	
		double newReal = 0.0;
		double newImaginary = 0.0;
		newReal = magnitude * Math.cos(angle);
		newImaginary = magnitude * Math.sin(angle);
		return(new Complex(newReal, newImaginary));
	}
	/* Precondition:Takes in a string
	 * Postcondition:Returns a complex number, the result of conversion of that string
	 */
	public Complex toComplex(String complex)
	{
		complex = complex.trim();
		double nReal = 0.0;
		double nImaginary = 0.0;
		int indexOperandPlus = 0;
		int indexOperandMinus = 0;
		int indexi = 0;
		for(int i = 0; i < complex.length(); i++)
		{
			if(complex.charAt(i) == '+')
			{
				indexOperandPlus = i;
			}
			else if(complex.charAt(i) == '-')
			{
				indexOperandMinus = i;
			}
			else if(complex.charAt(i) == 'i')
			{
				indexi = i;
			}
		}
		if(indexOperandPlus == 0)
		{	
			nReal = Double.parseDouble(complex.substring(0, indexOperandMinus));
			nImaginary = -1 * Double.parseDouble(complex.substring(indexOperandMinus + 1, indexi));
		}
		else if(indexOperandMinus == 0)
		{	
			nReal = Double.parseDouble(complex.substring(0, indexOperandPlus));
			nImaginary = Double.parseDouble(complex.substring(indexOperandPlus + 1, indexi));
		}
		return(new Complex(nReal, nImaginary));
	}
	/* Precondition:Uses the calling objects components to convert them to string
	 * Postcondition:returns the converted string
	 */
	public String toStringPolar()
	{
		String polarNotation = "Radius = "+real+", Angle = "+imaginary;
		return polarNotation;
	}
}
