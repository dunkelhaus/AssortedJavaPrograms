package apcs;
import java.io.*;
public class ComputeMatrix
{
   	double matrix[][];
   	double array[][];
   	int num;
    int start;
    int end;
    public static void main(String[] args)throws IOException
    {
    	int n = Utilities.oneIntegerInput("Enter the dimension NXN");
    	double[][] mat = new double[n][n];
    	for(int i = 0; i<n; i++)
    	{
    		for(int j = 0; j<n; j++)
    			mat[i][j] = Utilities.oneIntegerInput("Enter the "+i+" X "+j+"th element");
    	}
    	ComputeMatrix m = new ComputeMatrix(mat, (n*n), 0, n);
    	double res = m.determinant(mat, n);
    	System.out.println(res);
    }
    public ComputeMatrix (double matrix[][], int num, int start, int end)
    {
    	this.matrix = matrix;
        this.num = num;
        this.start = start;
        this.end = end;
    }
    public double[][] generateNewArray (double matrix[][], int num, int j1)
    {
    	array = new double[num-1][];
        for(int k=0; k<(num-1); k++)
        	array[k] = new double[num-1];
        for (int i=1; i<num; i++)
        {
          	int j2=0;
            for (int j=0; j<num; j++)
            {
              	if(j == j1)
              		continue;
                array[i-1][j2] = matrix[i][j];
                j2++;
            }
        }
        return array;
    }
    public double determinant(double matrix[][], int num)
    {
        double res;
        if (num == 1)
            res = matrix[0][0];
        else if(num == 2)
            res = (matrix[0][0] * matrix[1][1]) - (matrix[1][0] * matrix[0][1]);
        else
        {
            res=0;
            for (int j1=0; j1<num; j1++)
            {
            	array = generateNewArray (matrix, num, j1);
                res += Math.pow(-1.0, j1+2.0) * matrix[0][j1] * determinant(array, num-1);
            }
        }
        return res;
    }
}