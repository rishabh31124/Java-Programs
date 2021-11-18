package lecture18;
// time complexity = O(t*n)

import java.util.Scanner;

public class max_cir_sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			cir_sum(a);
			t--;
		}
//		int[] a = { 8, -8, 9, -9, 10, -11, 12 };

	}

	public static void cir_sum(int[] a) {
		int max = Math.max(case1(a), case2(a));
		System.out.println(max);
	}

	public static int case1(int[] a) {
		int case1 = Algo_kadance(a);
		return case1;
	}

	public static int case2(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			a[i] = -1 * a[i];
		}
		int b = Algo_kadance(a);
		int case2 = sum + b;
		return case2;
	}

	public static int Algo_kadance(int[] a) {
		int max_sum = Integer.MIN_VALUE;
		int cur_sum = 0;
		for (int i = 0; i < a.length; i++) {
			cur_sum += a[i];
			if (max_sum < cur_sum) {
				max_sum = cur_sum;
			}
			if (cur_sum < 0) {
				cur_sum = 0;
			}
		}
		return (max_sum);
	}

}
