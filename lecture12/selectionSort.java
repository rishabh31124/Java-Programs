package lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sort(a, n);
	}
//----------To return Minimum element index to swap------------------
	public static int minimumEle(int[] a, int n, int si, int ei) {
		int min = si;
		for (int i = si + 1; i <= ei; i++) {
			if (a[min] > a[i]) {
				min = i;
			}
		}
		return min;
	}
//----------to sort an array using selection sort---------------------
	public static void sort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int min = minimumEle(a, n, i, n - 1);
			swap(a, min, i);
		}
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));

	}
// ------------to swap (i)th index with minimum element------------------
	public static void swap(int[] a, int b, int c) {
		int temp = a[b];
		a[b] = a[c];
		a[c] = temp;
	}

}
