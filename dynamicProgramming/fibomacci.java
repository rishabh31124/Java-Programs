package dynamicProgramming;

public class fibomacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =7;
		System.out.println(fib(n));
	}
	//recursion
	public static int rec(int n) {
		if (n < 2) {
			return n;
		}

		int sp1 = rec(n - 1);
		int sp2 = rec(n - 2);

		return sp1 + sp2;
	}
	//top down approach
	public static int rec_TD(int n, int[] dp) {
		if (n < 2) {
			return n;
		}
		if (dp[n] != 0) {
			return dp[n];
		}
		int sp1 = rec_TD(n - 1, dp);
		int sp2 = rec_TD(n - 2, dp);

		dp[n] = sp1 + sp2; // memorization!!

		return sp1 + sp2;
	}
	//my code bottom up approach
	public static int fib(int n)
	{
		int dp[] = new int[n+2];
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2;i<=n;i++)
			dp[i] = dp[i-1]+dp[i-2];
		return dp[n];
		
	}

}
