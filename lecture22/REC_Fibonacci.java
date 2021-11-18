package lecture22;

public class REC_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		System.out.println(fibo(n));
	}

	static int fibo(int n) {
		// Base Case
		if (n == 0) // Base cASE 1 is IMPORTANT for (n-2) case
		{
			return 0;
		}
		if (n == 1) // Base Case 2 is also so Important for (n-1) case
		{
			return 1;
		}
		// Code
		int ans = 0;
		ans = fibo(n - 1) + fibo(n - 2);
		return ans;
	}

}
