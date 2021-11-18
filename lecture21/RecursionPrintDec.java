package lecture21;

public class RecursionPrintDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		pd(n);
	}

	static void pd(int n) {
		if (n == 0) {
			return; // terminating condition
		}
		pd(n - 1);
		System.out.println(n);

	}

}
