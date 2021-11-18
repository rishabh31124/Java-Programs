package lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sort(a, n);
	}
//------Sort the array using bubble sort technique-------------------
	public static void sort(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			int swap = 0;
//		-------------drag the maximum element at last------------
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					swap++;
//					---Swapping-----------------------
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if(swap == 0)
			{
				break;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
