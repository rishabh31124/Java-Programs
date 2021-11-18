package lecture13;

import java.util.Scanner;

	public class jaggedArray 
	// array of different sized arrays -------------------------
	{
	
			public static void main(String[] args) 
			{
				// TODO Auto-generated method stub
//				int[][] ar = new int[3][];
//				System.out.println(ar);
//				System.out.println(ar[0]);
//				System.out.println(ar[1]);
//				System.out.println(ar[2]);
//				ar[0] = new int[3];
//				ar[1] = new int[4];
//				ar[2] = new int[5];
//				System.out.println(ar[0]);
				System.out.println();
				System.out.println("****************************");
				System.out.println();
//		now how we take input ---------------
				Scanner sc = new Scanner(System.in);
				int[][] ar = new int[3][];
				ar[0] = new int[3];
				ar[1] = new int[4];
				ar[2] = new int[5];
				for(int row = 0 ; row < ar.length; row++)
				{
					for(int col = 0 ; col < ar[row].length; col++)
					{
						ar[row][col] = sc.nextInt();
					}
				}
				for(int[] val : ar)
				{
					for(int x : val)
					{
						System.out.print(x+" ");
					}
					System.out.println();
				}
				
				
			}
	}
