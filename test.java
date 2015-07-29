package apcs;

public class test {

	public static void main(String[] args) 
	{
		int[] coefficients = {5, 4, 3, 1, 2};
		for (int i = 0; i < coefficients.length / 2; i++)
		{
			  int temp = coefficients[i];
			  coefficients[i] = coefficients[coefficients.length - 1 - i];
			  coefficients[coefficients.length - 1 - i] = temp;
		}
		Utilities.printArray(coefficients);
	}

}
