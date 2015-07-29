public class oldcomplex
{
	private double x; //real part
	private double y; //imaginary part
	public complex(double r,double i)
	{
		x=r;
		y=i;
	}
	public complex(double z)
	{
		x=0;
		y=z;
	}
	public complex add(complex z)
	{
		double a = x+z.x;
		double b = y+z.y;
		return(new complex(a,b));
	}
	public complex multiply(complex a, complex b)
	{
		return (
	public complex power(int r)
	{
		complex W = new complex(i.0, 0.0);
		for(int i = 1; i <= n; i++)
		{
			W = W.multiply(this);
		}
		return (W);
	}
	public double multiply(complex v)
	{
		
	public double mag()
	{
		return (Math.sqrt(x*x+y*y));
	}
	public double angle(complex v)
	{
		return(Math.atan2(v.x, v.y);
	}
	public complex[] root(int n, complex i)
	{
		complex arr = new complex[n];
		double r = i.mag();
		double theta = arg(i);
		r = Math.pow(r, 1/n);
		double temp = theta
		double a = Math.cos((theta+2*Math
		
		
	@Override
	public String toString()
	{	
		String ret = "";
		ret += x;
		ret += "+";
		ret = ret+y+"i";
		return ret;
	}
}