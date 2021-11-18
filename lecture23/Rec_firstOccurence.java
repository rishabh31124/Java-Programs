package lecture23;

public class Rec_firstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 30, 20, 50, 30, 60, 50 };
		int ele = 50;
		int ans = fo(a, 0, ele);
		System.out.println(ans);
	}
	static int fo(int[] a, int index, int ele) {
		// base case
		if (index == a.length) {
			return -1;
		}
		// code
		if (a[index] == ele) {
			return index;
		}
		return fo(a, index + 1, ele);
	}
}
