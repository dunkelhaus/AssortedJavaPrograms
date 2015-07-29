package apcs;
import java.io.*;
public class EachProb
{
	static int[] objects = {5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7};
	static int[] newObjects = new int[objects.length];
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of times to run");
		int trials = Integer.parseInt(br.readLine());
		double prob = trialProb(trials);
		System.out.println("Probability = "+prob);
	}
	public static void numberShuffler()
	{
		Shuffle shuffle  = new Shuffle();
		newObjects = shuffle.shuffle(objects);
	}
	public static boolean pickObjects()
	{
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		for(int i = 0; i<5; i++)
		{
			if(newObjects[i] == 5)
				count5++;
			else if(newObjects[i] == 6)
				count6++;
			else if(newObjects[i] == 7)
				count7++;
		}
		if(count5>0 && count6>0 && count7>0)
			return true;
		else
			return false;
	}
	public static double trialProb(int trials)
	{
		int count = 0;
		for(int i = 0; i<trials; i++)
		{
			numberShuffler();
			if(pickObjects())
			{
				count++;
			}
		}
		double prob = (double)count/(double)trials;
		return prob;
	}
}
