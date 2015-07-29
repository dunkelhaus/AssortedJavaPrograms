package apcs;
import java.io.*;
public class Runs
{
	static int[] stats;
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of matches");
		int matches = Integer.parseInt(br.readLine());
		System.out.println("Enter number of wins");
		int wins = Integer.parseInt(br.readLine());
		System.out.println("Enter number of runs");
		int runs = Integer.parseInt(br.readLine());
		System.out.println("Enter number of trials");
		int trials = Integer.parseInt(br.readLine());
		double probability = probabilityFinder(trials, wins, runs, matches);
		System.out.println("Probability = "+probability);
	}
	public static boolean runFinder(int wins, int runs, int matches)
	{
		boolean lost = true;
		int count = 0;
		int[] stats = new int [matches];
		for (int i = 0; i < matches; i++)
		{
			if (i < wins)
			{
				stats[i] = 1;
			}
			else
			{
				stats[i] = 0;
			}
		}
		numberShuffler(stats);
		for (int j = 0; j < matches; j++)
		{
			if (stats[j] == 0)
			{
				lost = true;
			}
			if (lost && stats[j] == 1)
			{
				count++;
				lost = false;
			}
		}
		if(count == runs)
			return true;
		else
			return false;
	}
	public static int[] numberShuffler(int[] stats)
	{
		int container = 0;
		int y;
		for (int i = 0; i < stats.length; i++)
		{
			y = (int)((Math.random()*(stats.length - i)) + i);
			container = stats[i];
			stats[i] = stats[y];
			stats[y] = container;
		}
		return stats;
	}
	public static double probabilityFinder(int trials, int wins, int runs, int matches)
	{
		int count = 0;
		for (int i = 0; i < trials; i++)
		{
			if (runFinder(wins, runs, matches))
				count++;
		}
		double probability = (double) count / (double)trials;
		return probability;
	}
}
		