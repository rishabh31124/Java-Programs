package lecture13;

import java.util.Arrays;

public class Arrays2D
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[][] ar = new int[3][5];
		System.out.println(ar);
		int[] a = ar[0];
		System.out.println(a);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		ar[0][0] = 10;
		ar[2][4] = 30;
		System.out.println(a[0]);
		System.out.println();
		System.out.println("****************************");
		System.out.println();
		for(int row = 0 ; row < ar.length; row++)
		{
			for(int col = 0 ; col < ar[row].length; col++)
			{
				System.out.print(ar[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("****************************");
		System.out.println();
//		Enhanced For Loop -------------------
		for(int[] val : ar)
		{
			for(int x : val)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
//		------------ Arrays String method -----------------
		System.out.println(Arrays.deepToString(ar));
	}
		
}
