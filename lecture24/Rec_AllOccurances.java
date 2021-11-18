package lecture24;

import java.util.Arrays;

public class Rec_AllOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 30, 20, 50, 30, 60, 50 };
		int ele = 50;
		int[] ans = all(a, 0, 0, ele);
		System.out.println(Arrays.toString(ans));
	}

	static int[] all(int[] a, int index, int count, int ele) {
		if (a.length == index) { // base case
			int ans[] = new int[count];
			return ans;
		}
		if (a[index] == ele) {
			int[] sp = all(a, index + 1, count + 1, ele);// sp
			sp[count] = index;
			return sp;
		} else {
			int[] sp = all(a, index + 1, count, ele); // sp
			return sp;
		}
	}

}
