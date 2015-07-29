//Program checking if entered string is a palindrome
import java.io.*;
class Palindrome
{
	public static void main(String[]args)throws IOException
	{
		String reverse = "";
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter string to be reversed");
		String str = br.readLine();
		int l = str.length();
		for(int i = l-1; i>=0; i--)
		{
			reverse += str.charAt(i);
		}
		if(reverse.equals(str))
		{
			System.out.println("String Is A Palindrome");
			System.out.println("Reverse : "+reverse);

		}
		else
		{
			System.out.println("String Is Not A Palindrome");
			System.out.println("Reverse : "+reverse);

		}

	}
}