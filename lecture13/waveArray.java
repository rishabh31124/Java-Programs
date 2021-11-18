package lecture13;

import java.util.Arrays;

public class waveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar[] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println();
		System.out.println("****************************");
		System.out.println();
		System.out.println(Arrays.deepToString(ar));
		System.out.println();
		System.out.println("****************************");
		System.out.println();
		for(int[] val : ar)
		{
			System.out.println(Arrays.toString(val));
		}
		System.out.println();
		System.out.println("****************************");
		System.out.println("Column wave -- vertical wave");
		for(int col = 0 ; col < ar[0].length; col++)
		{
			if(col % 2 == 0)
			{
				for(int row = 0 ; row < ar.length; row++)
				{
					System.out.print(ar[row][col]+" ");
				}
			}
			else
			{
				for(int row = ar.length - 1 ; row >= 0; row--)
				{
					System.out.print(ar[row][col]+" ");
				}
			}
			
		}
	}

}
