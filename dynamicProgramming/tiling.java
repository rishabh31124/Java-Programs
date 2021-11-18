package dynamicProgramming;

import java.util.Scanner;

public class tiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dp[] = new int[n+1];
		for(int i = 0; i < n+1;i++)
		{
			dp[i] = -1;
		}
		System.out.println(td(n,dp));
	}

	public static int td(int n,int[] dp) {
		if (n < 2) {
			return n;
		}
		if (dp[n] != -1) {
			return dp[n];
		}
		int sp1 = td(n - 1, dp);
		int sp2 = td(n - 2, dp);

		dp[n] =  sp1 + sp2; // memorization!!

		return sp1 + sp2;
	}

}
