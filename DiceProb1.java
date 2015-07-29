//Program to find probability of dice roll to be 2, 7 or 12.
import java.io.*;
class DiceProb1
{
	public static void main(String[]args)throws IOException
	{
		int dice1 = 0;
		int dice2 = 0;
		int sum = 0;
		int count2 = 0;
		int count12 = 0;
		int count7 = 0;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter Number Of Times Dice Is To Be Rolled");
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i<num; i++)
		{
			dice1 = (int)(6.0*Math.random())+1;
			dice2 = (int)(6.0*Math.random())+1;
			sum = dice1 + dice2;
			if(sum == 2)
			{
				count2++;
			}
			else if(sum == 12)
			{
				count12++;
			}
			else if(sum == 7)
			{
				count7++;
			}
		}
		double probability2 = (double)count2/(double)num;
		double probability12 = (double)count12/(double)num;
		double probability7 = (double)count7/(double)num;
		System.out.println("Probability of 2:"+probability2);
		System.out.println("Probability of 12:"+probability12);
		System.out.println("Probability of 7:"+probability7);
	}
}