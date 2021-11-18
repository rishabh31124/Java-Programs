package lecture11;

import java.util.Arrays;
import java.util.Scanner;

public class inverseArray21 {
//---------------
	public static void inverseArray(int[] arr, int n) {
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			int temp = arr[i];
			b[temp] = i;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(b[i] + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		n = arr.length;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		inverseArray(arr, n);
	}

}
