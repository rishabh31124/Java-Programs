package lecture23;

import java.util.Arrays;

public class Rec_AllOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 30, 30, 30, 20, 50, 30, 60, 50 };
		int ele = 30;
		System.out.println(Arrays.toString(all(a, 0, 0, ele)));
	}
	static int[] all(int[] a, int n, int index, int ele) {
		// base case
		if (index == a.length) {
			int[] b = new int[n];
			return b;
		}
		// code
		if (a[index] == ele) { // important
			int b[] = all(a,n+1,index+1,ele); // smaller problem
			b[n] = index;
			return b;
		}
		else {
			int b[] = all(a,n,index+1,ele);
			return b;
		}
		
	}
}
