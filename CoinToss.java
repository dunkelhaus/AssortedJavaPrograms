//Program to find probability of heads to come up during a coin toss
import java.io.*;
class CoinToss
{
	public static void main(String[]args)throws IOException
	{
		double coin = 0.0;
		int count = 0;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter Number Of Times Dice Is To Be Rolled");
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i<num; i++)
		{
			coin = Math.random();
			if(coin < 0.5)
			{
				count++;
			}
		}
		double p = (double)count/(double)num;
		System.out.println("Probability of Heads:"+p);
	}
}