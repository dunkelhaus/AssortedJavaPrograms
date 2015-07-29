package apcs;
import java.io.*;
import java.util.*;
public class ArrayListTester
{
	public static void main(String[] args)throws IOException
	{
		ArrayList<String> sn = new ArrayList<>();
		sn.add("k");
		sn.add("l");
		sn.add("d");
		int size = sn.size();
		String z = sn.get(1);
		sn.remove(1);
		ArrayList<Complex> x = new ArrayList<>();
		x.add(new Complex(1.0, -2.0));
		List<Complex> l = new ArrayList<>();
		HashMap <String, String> fl = new HashMap<>();
		fl.put("K", "l");
		fl.put("M", "M");
		String result = fl.get("K"); //returns l
		if(fl.containsKey("M"))
			fl.get("M");//returns M
	}
}
