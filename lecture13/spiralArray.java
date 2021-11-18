package lecture13;

import java.util.Arrays;

public class spiralArray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] ar[] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println();
		System.out.println("****************************");
		System.out.println();
		for(int[] val : ar)
		{
			System.out.println(Arrays.toString(val));
		}
		System.out.println();
		System.out.println("****************************");
		System.out.println("Spiral -- Clockwise pattern");
		System.out.println();
		System.out.println("****************************");
		System.out.println();
		spiralClockwise(ar);
	}
	public static void spiralClockwise(int[][] a) {
		int max_row = a.length - 1;
		int min_row = 0;
		int max_col = a[0].length - 1;
		int min_col = 0;
		int k = 0;
		while (k < a.length * a[0].length) {
			for (int i = min_col; i <= max_col && k < a.length * a[0].length; i++) {
				System.out.print(a[min_row][i] + ", ");
				k++;
			}
			min_row += 1;
			for (int i = min_row; i <= max_row && k < a.length * a[0].length; i++) {
				System.out.print(a[i][max_col] + ", ");
				k++;
			}
			max_col -= 1;
			for (int i = max_col; i >= min_col && k < a.length * a[0].length; i--) {
				System.out.print(a[max_row][i] + ", ");
				k++;
			}
			max_row -= 1;
			for (int i = max_row; i >= min_row && k < a.length * a[0].length; i--) {
				System.out.print(a[i][min_col] + ", ");
				k++;
			}
			min_col += 1;
		}
		System.out.println("END");
	}

}
