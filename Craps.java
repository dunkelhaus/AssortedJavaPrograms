//A game with dice
import java.io.*;
class Craps
{
	public static void main(String[]args)throws IOException
	{
		int dice1 = 0;
		int dice2 = 0;
		int dice11 = 0;
		int dice12 = 0;
		int sum = 0;
		int sum1 = 0;
		int countwin = 0;
		int countlose = 0;
		int a = 0;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter number of times to Play");
		int num = Integer.parseInt(br.readLine());
		for(int j = 0; j<num; j++)
		{
			dice1 = (int)(6.0*Math.random())+1;
			dice2 = (int)(6.0*Math.random())+1;
			sum = dice1 + dice2;
			if(sum == 7||sum == 11)
			{
				countwin++;
				continue;
			}	
			else if(sum == 2||sum == 3||sum == 12)
			{
				countlose++;
				continue;
			}
			else
			{
				a = sum;
			}
			int i = 0;
			do
			{
				dice11 = (int)(6.0*Math.random())+1;
				dice12 = (int)(6.0*Math.random())+1;
				sum1 = dice11 + dice12;
				if(sum1 == a)
				{
					break;
				}
				else if(sum1 == 7)
				{
					break;
				}
				
			}while(i==0);
			if(sum1==a)
			{
				countwin++;
			}
			else if(sum1==7)
			{
				countlose++;
			}
		}
		double probabilitywin = (double)countwin/(double)num;
		double probabilitylose = (double)countlose/(double)num;
		System.out.println("Probability of Win:"+probabilitywin);
		System.out.println("Probability of Loss:"+probabilitylose);
	}
}