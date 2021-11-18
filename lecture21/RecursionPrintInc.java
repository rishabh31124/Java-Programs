package lecture21;

public class RecursionPrintInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		pi(n);
	}

	static void pi(int n) {
		if (n == 0) // Base Case
		{
			return; // Terminating condition
		}
		System.out.println(n);
		pi(n - 1);
	}

}
