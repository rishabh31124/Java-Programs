package lecture12;

import java.util.Scanner;

public class subArraySum_kadanesAlgo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = {2,3,8,-5,5};
		
		System.out.println(maxSum(a, n));
		System.out.println(kadanes2(a, n));
	}

//	===== kadanes algorithm to find maximum sub array sum ==================
	
	public static int maxSum(int[] a, int n) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + a[i];
			if (sum > max) {
				max = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		return max;
	}

//	also print the sub array ---------------------
	public static int kadanes2(int[] a, int n) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
//		to store starting index of new sub array -------
		int maxSi = -1;
//		to store last index of max sub array sum -----
		int maxEi = -1;
		int si = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + a[i];
			if (sum > max) {
				max = sum;
				maxSi = si;
				maxEi = i;

			}
			if (sum < 0) {
				sum = 0;
//				start new sub array when sum is less than 0 ------
				si = si + 1;
			}
		}
		for (int i = maxSi; i <= maxEi; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		return max;

	}

}
