package lecture10;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class linear_Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int l = linearSearch(a, n, m);
		System.out.println(l);
		int b = binarySearch(a, n, m);
		System.out.println(b);
	}
//	----------------- Linear Search --------------------------------------------

	public static int linearSearch(int[] a, int n, int m) {
		int i = 0;
		while (i < n) {
			if (a[i] == m) {
				return i;
			}
			i++;
		}
		return -1;
	}
//	----------------- Binary Search --------------------------------------------

	public static int binarySearch(int[] a, int n, int m) {
		// ---------------- // condition // ( Arrays should be sorted )--------------------
		Arrays.sort(a);
//		---------------------------------------------------
		int l = 0, h = n - 1;
		while (l <= h) {
			
			int mid = (l + h) / 2;
			if (a[mid] == m) {
				return mid;
			} else if (m > a[mid]) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
			}
		return -1;
			
		
	}
}
