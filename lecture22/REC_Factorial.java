package lecture22;

public class REC_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fact(n));
	}

	static int fact(int n) {
		if (n == 0) // Base Case
		{
			return 1;
		}
		// code
		int ans = n * fact(n - 1);
		return ans;
	}

}
		// ans = Bigger Problem
		// fact(n-1) = Smaller Problem 
