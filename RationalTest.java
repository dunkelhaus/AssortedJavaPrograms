package apcs;
import java.io.IOException;

public class RationalTest
{
	public static void main(String[] args)throws RationalOutOfRangeException
	{
		Rational r = new Rational(9, 4);
		//int[] z = r.continuedFractionRepresentation(r, 4);
		//Utilities.printArray(z);
		//double a = r.squareRoot();
		//System.out.println(a);
		double b = r.squareRootToNearestEpsilon(0);
		System.out.println(b);
	}
}
