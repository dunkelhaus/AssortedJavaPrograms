package apcs;
import java.io.*;
public class GuessingGame
{
	public static void main(String[] args)throws IOException
	{
		int ch = Utilities.oneIntegerInput("Enter 1 to play, 0 to exit");
		while(ch != 0)
		{
			brain();
			ch = Utilities.oneIntegerInput("Enter 1 to play, 0 to exit");
		}
		System.out.println("Go Away");
	}
	public static void brain()throws IOException
	{
		int ch = Utilities.oneIntegerInput("1 for easy, 2 for medium, 3 for hard");
			switch(ch)
			{
				case 1:
					System.out.println("You Chose EASY. You have 15 chances to guess the right answer from 1 to 1000.");
					int n = (int)(1000.0*Math.random())+1;
					for(int i = 0; i < 15; i++)
					{
						int g = Utilities.oneIntegerInput("Enter your "+(i+1)+"th guess. Remember, limit is 1 - 1000.");
						if(g == n)
						{
							System.out.println("You Won!!!");
							break;
						}
						else
						{
							if(g>n)
							{
								System.out.println("Wrong guess. Try a lower guess. Remember, limit is 1 - 1000. "+(15-(i+1))+" guesses to go.");
							}
							else
							{
								System.out.println("Wrong guess. Try a higher guess. Remember, limit is 1 - 1000. "+(15-(i+1))+" guesses to go.");
							}
							continue;
						}
					}
					break;
				case 2:
					System.out.println("You Chose MEDIUM. You have 10 chances to guess the right answer from 1 to 1000.");
					int n1 = (int)(1000.0*Math.random())+1;
					for(int i = 0; i < 10; i++)
					{
						int g = Utilities.oneIntegerInput("Enter your "+(i+1)+"th guess.");
						if(g == n1)
						{
							System.out.println("You Won!!!");
							break;
						}
						else
						{
							if(g>n1)
							{
								System.out.println("Wrong guess. Try a lower guess. Remember, limit is 1 - 1000. "+(10-(i+1))+" guesses to go.");
							}
							else
							{
								System.out.println("Wrong guess. Try a higher guess. Remember, limit is 1 - 1000. "+(10-(i+1))+" guesses to go.");
							}
							continue;
						}
					}
					break;
				case 3:
					System.out.println("You Chose HARD. You have 5 chances to guess the right answer from 1 to 1000.");
					int n2 = (int)(1000.0*Math.random())+1;
					for(int i = 0; i < 5; i++)
					{
						int g = Utilities.oneIntegerInput("Enter your "+(i+1)+"th guess.");
						if(g == n2)
						{
							System.out.println("You Won!!!");
							break;
						}
						else
						{
							if(g>n2)
							{
								System.out.println("Wrong guess. Try a lower guess. Remember, limit is 1 - 1000. "+(5-(i+1))+" guesses to go.");
							}
							else
							{
								System.out.println("Wrong guess. Try a higher guess. Remember, limit is 1 - 1000. "+(5-(i+1))+" guesses to go.");
							}
							continue;
						}
					}
					break;
			}
	}
}
