package lecture23;

public class Rec_reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30, 40 };
		rev(a, 0);
	}

	static void rev(int[] a, int index) {
		// base case
		if (index == a.length) {
			return;
		}
		// code
		rev(a, index + 1);
		System.out.println(a[index]);
	}

}
