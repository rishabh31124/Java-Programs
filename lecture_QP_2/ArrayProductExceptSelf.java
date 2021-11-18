package lecture_QP_2;

import java.util.Arrays;

public class ArrayProductExceptSelf {
	// time complexity O(n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		int[] leftp = new int[n]; // left product array
		int[] rightp = new int[n]; // right product array
		int ans[] = new int[n]; // answer array
		int p = 1; // initialize product variable
		leftp[0] = p;
		for (int i = 1; i < n; i++) {
			p *= arr[i - 1];
			leftp[i] = p;
		}
		System.out.println(Arrays.toString(leftp));
		int q = 1; // initialize product variable
		rightp[n - 1] = q;
		for (int i = n - 2; i > -1; i--) {
			q *= arr[i + 1];
			rightp[i] = q;
		}
		System.out.println(Arrays.toString(rightp));
		System.out.println();
		for (int i = 0; i < n; i++) {
			ans[i] = leftp[i] * rightp[i];
		}
		System.out.println("Answer is:- " + Arrays.toString(ans));
	}

}
