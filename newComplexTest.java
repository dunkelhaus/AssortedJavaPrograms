package apcs;
import java.io.*;
public class newComplexTest
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your choice, 1, 2 or 3");
		int choice = Integer.parseInt(br.readLine());
		Complex[] x = new Complex[7];
		Complex z = new Complex();
		Complex T = new Complex(1,1);
		switch(choice)
		{
			case 1:
				System.out.println("part a");
				for(int i = 0; i<7; i++)
				{
					double real = Math.pow(-1, i+1)*Math.pow(1.5, i+1);
					double imag = Math.pow(-1, i)*(i/2.0);
					x[i] = new Complex(real, imag);
					z = new Complex(real, imag);
					System.out.println("Value of "+i+"th term = "+z.toString());
				}
				System.out.println("part b");
				for(int i = 0; i<7; i++)
				{
					z = x[i];
					double magnitude = z.magnitude();
					System.out.println("Magnitude for "+i+" is:"+magnitude);
				}
				System.out.println("Part c");
				for(int i = 0; i<7; i++)
				{
					z = x[i];
					double angle = z.argandAngle();
					angle = (angle*180)/Math.PI;
					System.out.println("Angle for "+i+" is:"+angle);
				}
				System.out.println("Part d");
				for(int i = 0; i<7; i++)
				{
					z = x[i];
					T = T.multiply(z);
				}
				System.out.println("Angle for T is:"+(T.argandAngle()*180)/Math.PI);
				System.out.println("Magnitude for T is:"+T.magnitude());
				System.out.println("T is "+T.toString());
				System.out.println("Part e");
				Complex ans = new Complex();
				ans = T.egyptianPower(7);
				System.out.println(ans.toString());
				break;
			case 2:
				Complex value = new Complex(1, -1);
				value = value.power("5/6");
				System.out.println("Answer:"+value.toString());
				break;
			case 3:
				System.out.println("part a");
				Complex sum = new Complex();
				sum = somefoo(8);
				System.out.println(sum.toString());
				System.out.println("part b");
				sum = somefoo(10);
				System.out.println((sum.argandAngle()*180)/Math.PI);
				System.out.println("part c");
				sum = somefoo(5);
				System.out.println(sum.magnitude());
				break;
			default:
				System.out.println("Invalid");
				break;
		}
	}
	public static Complex somefoo(int k)
	{
		Complex numerator = new Complex(1);
		Complex denominator;
		Complex z = new Complex();
		Complex[] s = new Complex[k];
		Complex sum = new Complex();
		double value = 0;
		for(int i = 1; i<=k; i++)
		{
			value = Math.pow(-1, (double)k)*Math.sqrt((double)k);
			denominator = new Complex(1, value);
			s[i-1] = numerator.divideComplex(denominator);
		}
		for(int i = 0; i<k; i++)
		{
			z = s[i];
			sum = sum.add(z);
		}
		return sum;
	}
}
