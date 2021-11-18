package lecture10;

import java.util.Arrays;
import java.util.Scanner;

public class rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		rotate(arr,n,k);
	}
	public static void rotate(int[] a, int n, int k) {
//		-- For high number of rotation if k == 5 , array repeats-------
		if(k>n) {
			k = k % n ;
		}
//		-----------------------
		if(k<0) {
//			---For negative rotation-----
			k = k + n;
		}
//		----------------------------

		for(int j = 1 ; j <= k ; j++) {
//			-----For single rotation-------
			int temp = a[n-1];
			for(int i = n-1;i>0;i--) {
				a[i] = a[i-1];
			}
			a[0] = temp;
//			---------------------------
		}
		System.out.println(Arrays.toString(a));
		
	}

}
