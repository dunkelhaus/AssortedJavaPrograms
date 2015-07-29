
import java.io.*;
class palinrec
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter rolls");
		String str = br.readLine();
		boolean b = palin(str);
		if(b == true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println(" not Palindrome");
		}
	}
	public static boolean palin(String str)
	{
		int n1 = 0;
		int n2 = str.length()-1;
		if(str.charAt(n1) == str.charAt(n2))
		{
			while(n1+1 != n2-1)
			{
				return palin(str.substring(n1+1, n2-1));
			
			}
			return true;
		}
		else
		{
			return false;
		}
	}
}