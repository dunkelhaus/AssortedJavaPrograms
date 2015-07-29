import java.io.*;
import java.util.*;
public class filestuf
{
	public static void main(String[] args)throws FileNotFoundException
	{
		File x = new File("somefoo.dat");
		Scanner y = new Scanner(x);
		int n = y.nextInt();
		System.out.println(n);
		y.close();
	}
}
