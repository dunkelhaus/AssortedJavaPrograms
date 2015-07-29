package apcs;
import java.io.*;
public class SumRecursion
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int number = Integer.parseInt(br.readLine());
		int sum = sumDigits(number);
		System.out.println(sum);
	}
	public static int sumDigits(int n)
	{
		return (n<10 ? n : n%10+sumDigits(n/10));
	}
}
