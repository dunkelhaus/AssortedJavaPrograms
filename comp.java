public class comp
{
	private double x; //real part
	private double y; //imaginary part
	public comp(double r,double i)
	{
		x=r;
		y=i;
	}
	public double arg()
	{
		return(Math.atan2(x, y));
	}
}