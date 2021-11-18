package lecture_QP_2;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]x = {{1,2,3},{4,5,6}};
		int [][]y = {{1,4},{2,5},{3,6}};
		int m = x.length;
		int n = y[0].length;
		int[][] ansMatrix = new int[m][n];
		for(int row = 0; row < m; row++)
		{
			for(int col = 0; col < n; col++)
			{
				int ans = 0;
				for(int k = 0; k < y.length; k++) // important here we take range upto y.length i.e row length of y
				{
					ans = ans + x[row][k] * y[k][col]; // x - col and y - row is increasing
				}
				ansMatrix[row][col] = ans;
			}
		}
		System.out.println(Arrays.deepToString(ansMatrix)); // deepString method to display 2D array
		
	}

}
