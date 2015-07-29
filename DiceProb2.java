//Program to check if 5 comes before 7, you win or else you lose
import java.io.*;
class DiceProb2
{
	public static void main(String[]args)throws IOException
	{
		int i = 0;
		int dice1 = 0;
		int dice2 = 0;
		int sum = 0;
		int count5 = 0;
		int count7 = 0;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter number of times to Play");
		int num = Integer.parseInt(br.readLine());
	for(int j = 0; j<num; j++)
	{
		for(i = 1; i>0; i++)
		{
			dice1 = (int)(6.0*Math.random())+1;
			dice2 = (int)(6.0*Math.random())+1;
			sum = dice1 + dice2;
			if(sum == 5)
			{
				count5++;
				break;
			}	
			else if(sum == 7)
			{
				count7++;
				break;
			}
		}
	}
		double probability5 = (double)count5/(double)num;
		double probability7 = (double)count7/(double)num;
		System.out.println("Probability of Win:"+probability5);
		System.out.println("Probability of Loss:"+probability7);
	}
}