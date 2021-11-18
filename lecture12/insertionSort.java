package lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sort(a, n);
	}
// ------To sort an array using insertion sort------------
	public static void sort(int[] a, int n) {
//		----imaginary division of array ------------
		for (int i = 1; i < n; i++) {
			int ele = a[i];
			for (int j = i - 1; j >= 0; j--) {
//		-------shifting greater element to 1 index greater---------
				if (a[j] > ele) {
					a[j + 1] = a[j];
				} else {
					a[j + 1] = ele;
					break;
				}
			}
			if (a[0] > ele) {
				a[0] = ele;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
