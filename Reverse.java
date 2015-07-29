import java.io.*;
class Reverse
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
		System.out.println("Reverse Of Entered String: "+reverse);


	}
}