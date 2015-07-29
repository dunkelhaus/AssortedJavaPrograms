package apcs;

public class InheritTest
{
	public static void main(String[] args)
	{
		Square x = new Square(10.0);
		double a = x.area();
		System.out.println("a "+a);
		double p = x.perimeter();
		System.out.println("p "+p);
	}
}
