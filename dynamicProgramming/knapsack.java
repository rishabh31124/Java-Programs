package dynamicProgramming;

import java.util.Scanner;

public class knapsack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int[] size = new int[n];
		for (int i = 0; i < n; i++)
			size[i] = sc.nextInt();
		int[] value = new int[n];
		for (int i = 0; i < n; i++)
			value[i] = sc.nextInt();
		int[][] dp = new int[s+1][value.length - 1];
		System.out.println(td(size, value, s, 0, dp));
	}
	public static int rec(int[] wt, int[] cost, int cap, int idx) {
		if (idx == wt.length || cap == 0) {
			return 0;
		}
		int sp1 = 0;
		if (cap >= wt[idx]) {
			sp1 = rec(wt, cost, cap - wt[idx], idx + 1) + cost[idx];
		}
		int sp2 = rec(wt, cost, cap, idx + 1);

		return Math.max(sp1, sp2);

	}

	public static int td(int[] size, int[] value, int x, int in, int[][] dp) {
		if (in == size.length || x == 0)
			return 0;
		if (dp[x][in] != 0)
			return dp[x][in];
		int sp1 = 0;
		if (x >= size[in])
			sp1 = td(size, value, x - size[in], in + 1, dp)+value[in];
		int sp2 = td(size, value, x, in + 1, dp);
		dp[x][in] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}

	public static int bu(int[] size, int[] value, int x) {
		int[][] dp = new int[x + 1][value.length + 1];
		for (int i = 1; i <= x; i++) {
			for (int in = value.length - 1; in >= 0; in--) {
				int sp1 = 0;
				if (x >= size[in])
					sp1 = dp[x - size[in]][in + 1];
				int sp2 = dp[x][in + 1];
				dp[x][in] = Math.max(sp1, sp2);
			}
		}
		return dp[x][0];
	}

}
