/**Caeser Cipher
 * Lets say message being transmitted: "Hello World"
 * a value N is an offset for each letter
 * for above message, "jgnnq yqtnf"
 * for ending letters, alphabet repeats
 * This program encrypts and decrypts such ciphers.
 * Brute force method used for decryption
 * Author - Suraj Jena
 * Date last updated : 11/25/2013
 * Homework 2
 */
package apcs;
import java.io.*;
public class Crypt
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your choice?");
		int ch = Integer.parseInt(br.readLine());
		switch(ch)
		{
			case 1:
				System.out.println("Enter the String");
				String encryptSubject = br.readLine();
				System.out.println("Enter the Crypt Key");
				int cryptKey = Integer.parseInt(br.readLine());
				char[] result = cryptor(encryptSubject, cryptKey);
				for(int i = 0; i < result.length; i++)
				{
					System.out.print(result[i]);
				}
				break;
			case 2:
				System.out.println("Enter the String");
				String decryptSubject = br.readLine();
				decryptor(decryptSubject);
				break;
			default:
					System.out.println("Invalid Choice. Run Again");
					break;
		}
	}
	public static char[] cryptor(String subject, int key)
	{
		String results = "";
		if(key > 26)
		{
			key %= 26;
		}
		char[] subjectArr = subject.toCharArray();
		char[] result = new char[subjectArr.length];
		for(int i = 0; i<subject.length(); i++)
		{
			if(Character.isUpperCase(subjectArr[i]))
			{
				if((subjectArr[i] + key) > 90)
				{
					int index = (subjectArr[i] + key) - 90;
					subjectArr[i] = (char)(index+64);
				}
				else
				{
					subjectArr[i] = (char)(key + subjectArr[i]);
				}
			}
			else if(Character.isLowerCase(subjectArr[i]))
			{
				if((subjectArr[i] + key) > 122)
				{
					int index = (subjectArr[i] + key) - 122;
					subjectArr[i] = (char)(index+96);
				}
				else
				{
					subjectArr[i] = (char)(key + subjectArr[i]);
				}
			}
		}
		return subjectArr;
	}
	public static void decryptor(String str)
	{
		char[] letters = str.toCharArray();
		for(int j = 0; j<str.length(); j++)
		{
			for(int i = 0; i<str.length(); i++)
			{
				letters[i] += 1;
			}
			for(int k = 0; k < str.length(); k++)
			{
				System.out.print(letters[k]);
			}
			System.out.println();
		}
	}
}