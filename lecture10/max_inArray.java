package lecture10;

import java.util.Scanner;

public class max_inArray {
//-------To find max element in an array---------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(max(a,n));
		System.out.println(min(a,n));

	}
//	----------TO RETURN FIND MAXIMUM ELEMENT IN AN ARRAY--------------------------
	public static int max(int[] a, int n) {
		int max = a[0];
		for(int i = 1 ; i<n ;i++) {
			if(max<a[i]) {
				max = a[i];
			}
		}
		return max;
		
	}
//	---------------------------------------------------------------------------
//	------TO SWAP ELEMENT WITHIN AN ARRAY--------------------------------------
	public static void swap(int[] a ,int b,int c) {
		int temp = b;
		b = a[c];
		a[c] = temp;
	}
//	---------------------------------------------------------------------------
//	-----------TO RETURN FIND MINIMUM ELEMENT IN AN ARRAY-----------------------
	public static int min(int[] a, int n) {
//		----MOST NEGTIVE MUNBER(minimum = Integer.MIN_VAUE)---------------------
		int min = a[0];
		for(int i = 1 ; i<n ;i++) {
			if(min>a[i]) {
				min = a[i];
			}
		}
		return min;
		
	}

}
