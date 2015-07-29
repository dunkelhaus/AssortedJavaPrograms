package apcs;

public class Rectangle
{
	protected double w;
	protected double l;
	public Rectangle()
	{
		w = 1.0;
		l = 1.0;
	}
	public Rectangle(double x, double y)
	{
		w = x;
		l = y;
	}
	public double area()
	{
		System.out.println("Tester area rectangle");
		return( w*l );
		
	}
	public double perimeter()
	{
		System.out.println("Tester perimeter rectangle");
		return(2.0*(w+l));
	}
}
