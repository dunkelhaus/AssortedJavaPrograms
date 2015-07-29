//Program to find sum of numbers until given number
import java.util.Scanner;
public class sum
	{
		public static void main(String[]args)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter number");
			int N  = scanner.nextInt();
			int s = 0;
			int i = 1;
			while(i<=N)
			{
				s+=i;
				i++;
			}
			System.out.println(s);
		}
	}