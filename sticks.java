// date updated - 9/3/13
//program converting fahrenheit to celsius
import java.io.*;
public class sticks
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of red sticks");
		int r = Integer.parseInt(br.readLine());
		System.out.println("Enter number of blue sticks (should be less than red sticks)");
		int b = Integer.parseInt(br.readLine());
	}
	public static int stick(int r,int b)
	{
		int sum = r+b;
		int[] stickarr = new int[sum];
		