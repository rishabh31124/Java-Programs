package lecture22;

public class REC_PowerOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int a = 2;
		System.out.println(pow(a, n));
	}

	static int pow(int a, int n) { // important is to use a return type and without return type its not valid ..
		// Base Case
		if (n == 0) {
			return 1;
		}
		// code
		int ans = a * pow(a, n - 1);
		return ans;
	}

}
