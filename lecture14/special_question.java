package lecture14;

import java.util.Arrays;

// Search an element if found return true otherwise return false-----
// constraint ---- Use Time complexity O(m+n);
// Every row and each column is sorted

public class special_question {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] a = {{1,4,5,9},{2,6,7,10},{8,11,17,20},{12,13,19,21}};
		int k = 11; // the element to be search in the matrix ------
		
		for(int[] val : a)
		{
			System.out.println(Arrays.toString(val));
		}
		System.out.println(ss(a,k));

	}
	public static boolean ss(int[][]a, int k)
	{
		int row = 0;
		int col = a[0].length - 1;
		while(row < a.length && col >= 0)
		{
			if(a[row][col] == k)
			{
				return true;
			}
			else if(a[row][col] > k) 
			{
				col -= 1;
			}
			else
			{
				row += 1;
			}
		}
		
		return false;
	}

}
