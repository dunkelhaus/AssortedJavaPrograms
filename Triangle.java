package apcs;

public abstract class Triangle
{
	protected String color;
	protected boolean filled;
	
	public abstract double area();
	public abstract double perimeter();
	//Have set methods and get methods
	
	public Triangle()
	{
		filled = false;
		color = "green";
	}
}
