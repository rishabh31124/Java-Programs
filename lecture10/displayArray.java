package lecture10;

import java.util.Arrays;
import java.util.Scanner;

public class displayArray{
//	------------To display in a descent Manner----------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		display(a);
	}
	public static void display(int[]a) {
		
			System.out.println(Arrays.toString(a));
	}

}
