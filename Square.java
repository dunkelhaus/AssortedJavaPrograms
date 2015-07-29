package apcs;

public class Square extends Rectangle
{
	public Square()
	{
		w = 1;
		l = 1;
	}
	public Square(double x)
	{
		super(x, x);
	}
	@Override
	public double area()
	{
		System.out.println("Tester Square");
		return w*w;
	}
}
