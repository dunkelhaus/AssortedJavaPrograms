/**
 * Program as a UI for the Complex class
 * Author : Suraj Jena
 * Subject :Computer Science
 */
package apcs;
import java.io.*;
public class ComplexTest
{
	public static void main(String[] args)throws IOException
	{
		int choice = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("The Complex Operator [Version 1.1]");
		System.out.println("Author: Suraj Jena");
		System.out.println("(c) 2013 Complex Operator Corporation. All Rights Reserved.");
		System.out.println();
		do
		{
			System.out.println("___________________________________________________________");
			System.out.println();
			System.out.println("Welcome To The Complex Operator 1.1");
			System.out.println("Enter The Complex Number In Complex Notation (a+bi format. If negative, -a+bi, or a-bi)");
			String complex = br.readLine();
			while(complex.indexOf('i') == -1 )
			{
			System.out.println("Please Reenter");
			System.out.println("Enter The Complex Number In Complex Notation. (If you are sorting, then enter any random complex number which will not be sorted)");
			complex = br.readLine();
			}
			Complex mainComplex = new Complex();
			mainComplex = mainComplex.toComplex(complex);
			System.out.println("Enter The Serial Number Denoting Your Choice");
			System.out.println("1. Add Two Complex Numbers");
			System.out.println("2. Subtract Two Complex Numbers");
			System.out.println("3. Multiply Two Complex Numbers");
			System.out.println("4. Divide Two Complex Numbers");
			System.out.println("5. Square Root Of Complex Number");
			System.out.println("6. Raise Complex Number To Integer Exponent");
			System.out.println("7. Raise Complex Number To Double Exponent");
			System.out.println("8. Raise Complex Number To Fractional Exponent");
			System.out.println("9. Find Magnitude Of Complex Number");
			System.out.println("10. Check Equality Of Two Complex Numbers");
			System.out.println("11. Convert Complex Notation to Polar Format");
			System.out.println("12. Raise Complex Number To Complex Exponent");
			System.out.println("13. Inverse of Complex Number");
			System.out.println("14. Conjugate of Complex Number");
			System.out.println("15. Result of division of complex by denominator");
			System.out.println("16. Sort Complex Numbers");
			System.out.println("17. Add Many Complex Numbers");
			System.out.println("18. Subtract Many Complex Numbers");
			System.out.println("19. Reciprocal of Complex Number");
			System.out.println("20. Natural Logarithm Of Complex Number");
			choice = Integer.parseInt(br.readLine());
			Complex operand = new Complex();
			Complex result = new Complex();
			switch(choice)
			{
				case 1:
					System.out.println("Enter The Second Complex Number to be added In Complex Notation");
					String complexAdd = br.readLine();
					operand = operand.toComplex(complexAdd);
					result = mainComplex.add(operand);
					System.out.println("The Answer Is = "+result.toString());
					break;
				case 2:
					System.out.println("Enter The Second Complex Number to be subtracted In Complex Notation");
					String complexSubtract = br.readLine();
					operand = operand.toComplex(complexSubtract);
					result = mainComplex.subtract(operand);
					System.out.println("The Answer Is = "+result.toString());
					break;
				case 3:
					System.out.println("Enter The Second Complex Number to be multiplied In Complex Notation");
					String complexMultiply = br.readLine();
					operand = operand.toComplex(complexMultiply);
					result = mainComplex.multiply(operand);
					System.out.println("The Answer Is = "+result.toString());
					break;
				case 4:
					System.out.println("Enter The Denominator In Complex Notation");
					String complexDivide = br.readLine();
					operand = operand.toComplex(complexDivide);
					result = mainComplex.divideComplex(operand);
					System.out.println("The Answer Is = "+result.toString());
					break;
				case 5:
					result = mainComplex.squareRoot();
					System.out.println("The Square Root is = "+result.toString());
					break;
				case 6:
					System.out.println("Enter the Integer Exponent");
					double number = Double.parseDouble(br.readLine());
					result = mainComplex.power(number);
					System.out.println("The Answer Is = "+result.toString());
					break;
				case 7:
					System.out.println("Enter the Double Exponent");
					double number2 = Double.parseDouble(br.readLine());
					result = mainComplex.power(number2);
					System.out.println("The Answer Is = "+result.toString());
					break;
				case 8:
					System.out.println("Enter the Positive Fraction");
					String fraction = br.readLine();
					result = mainComplex.power(fraction);
					System.out.println("The Answer Is = "+result.toString());
					break;
				case 9:
					double ans = mainComplex.magnitude();
					System.out.println("The Magnitude is = "+ans);
					break;
				case 10:
					System.out.println("Enter The Other Complex Number");
					String complexNumber = br.readLine();
					operand = operand.toComplex(complexNumber);
					boolean answer = mainComplex.equals(operand);
					System.out.println("The Answer Is = "+answer);
					break;
				case 11:
					result = mainComplex.toPolar();
					System.out.println("The Answer Is = "+result.toStringPolar());
					break;
				case 12:
					System.out.println("Enter The Exponent In Complex Notation");
					String complexExponent = br.readLine();
					operand = operand.toComplex(complexExponent);
					result = mainComplex.power(operand);
					System.out.println("The Answer Is = "+result.toString());
					break;
				case 13:
					result = mainComplex.inverse();
					System.out.println("The Inverse Is = "+result.toString());
					break;
				case 14:
					result = mainComplex.conjugate();
					System.out.println("The Conjugate Is = "+result.toString());
					break;
				case 15:
					System.out.println("Enter the Number");
					double denominator = Double.parseDouble(br.readLine());
					result = mainComplex.divideByNumber(denominator);
					System.out.println("The Answer Is = "+result.toString());
					break;
				case 16:
					System.out.println("Enter number of complex numbers to be sorted. Note that the previously entered number was not counted and will have to be re-entered");
					int length = Integer.parseInt(br.readLine());
					Complex[] aresult = new Complex[length];
					aresult = mainComplex.sortComplex(length);
					for(int i = 0; i<aresult.length; i++)
					{
						System.out.println((i+1)+"th term = "+aresult[i].toString());
					}
					break;
				case 17:
					result = mainComplex.add();
					System.out.println("The Answer Is = "+result.toString());
					break;
				case 18:
					result = mainComplex.subtract();
					System.out.println("The Answer Is = "+result.toString());
					break;
				case 19:
					System.out.println("The reciprocal is:"+(mainComplex.reciprocal()).toString());
					break;
				case 20:
					System.out.println("The Answer Is = "+(mainComplex.naturalLog()).toString());
					break;
				default:
					System.out.println("Invalid Choice");
					break;
			}
			System.out.println();
			System.out.println("___________________________________________________________");
			System.out.println();
			System.out.println("Do You Want To Exit?");
			System.out.println(" Enter 0 To Exit");
			System.out.println(" Enter 1 To Perform More Operations");
			choice = Integer.parseInt(br.readLine());
		}while(choice!=0);
		System.out.println();
		System.out.println("****************************************");
		System.out.println("Thank You For Using The Complex Operator");
		System.out.println("****************************************");
	}
}
