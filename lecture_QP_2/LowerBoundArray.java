package lecture_QP_2;

import java.util.Arrays;
// find the first index of repeated elements in the given array
public class LowerBoundArray {
	// Time complexity O(log n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 9, 9 }; // sorted array
		System.out.println(Arrays.toString(arr));
		System.out.println();
		int ele = 3; // element to be search
		int low = 0;
		int ans = -1; // to store the current index of searched element
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == ele) {
				ans = mid;
				high = mid - 1; // this is the main condition to be applied in binary search algo
			} else if (arr[mid] > ele) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		System.out.println("Lower Bound index of the element is " + ans);
	}

}
