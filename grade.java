//Program to find grade for entered score
import java.io.*;
class grade
{
static char grade;
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your score");
		int score = Integer.parseInt(br.readLine());
		if(score>=90 && score<=100)
		{
			grade = 'A';
		}
		else if(score>=80 && score <=90)
		{
			grade = 'B';
		}
		else if(score>=70 && score <=80)
		{
			grade = 'C';
		}
		else if(score>=60 && score <=70)
		{
			grade = 'I';
		}
		else 
		{
			grade = 'F';
		}
		System.out.println("Your Grade = "+grade);
	}
}



