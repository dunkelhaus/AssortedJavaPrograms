package apcs;
import java.io.IOException;
public class TowersOfHanoi
{
	public static void main(String[] args)throws IOException
	{
		int n = Utilities.oneIntegerInput("Enter number of blocks");
		steps(n);
	}
	public static void steps(int n)
	{
		if (n== 0)
		{
			return; 
		}
		if(n==1)
		{
			System.out.println("Move to 2");
		}
		int A = 1;
		int B = 2;
		int C = 3;
		steps(n-1);
		System.out.println("Move " +n + " from " + A + " to " +C);
		steps(n-1);
	}
}
