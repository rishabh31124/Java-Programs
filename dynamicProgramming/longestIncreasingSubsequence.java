package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class longestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int[][] dp = new int[arr.length][arr.length];
		for (int[] row : dp)
			Arrays.fill(row, -1);
		System.out.println(td(arr,0,-1,dp));
	}
	
	public int rec(int[] nums, int idx, int prev) {
		if (idx == nums.length) {
			return 0;
		}
		int sp1 = 0;
		if (prev < nums[idx]) {
			sp1 = 1 + rec(nums, idx + 1, nums[idx]);
		}
		int sp2 = rec(nums, idx + 1, prev);
		return Math.max(sp1, sp2);
	}

	public static int td(int[] arr, int in, int prev, int[][] dp) {// store the previous index
		if (arr.length == in) {
			return 0;
		}
		if (dp[in][prev + 1] != -1)
			return dp[in][prev + 1];
		int sp1 = 0;
		if (prev == -1 || arr[prev] < arr[in]) {
			sp1 = 1 + td(arr, in + 1, in, dp); // include kar lia
		}
		int sp2 = td(arr, in + 1, prev, dp);// not included
		dp[in][prev + 1] = Math.max(sp1, sp2);// prev+1 isliye kia becz prev ki input value -1 se h
		return Math.max(sp1, sp2);
	}

	public static int bu(int[] arr) {
		int[][] dp = new int[arr.length + 1][arr.length+1];// plus1 isliye base case wali conditn overcome
		for (int in = arr.length - 1; in >= 0; in--) {
			for (int prev = arr.length - 1; prev >= -1; prev--) {
				int sp1 = 0;
				if (prev == -1 || arr[prev] < arr[in])
					sp1 = dp[in + 1][in + 1];
				int sp2 = dp[in + 1][prev + 1];
				dp[in][prev + 1] = Math.max(sp1, sp2);
			}
		}
		return dp[0][-1 + 1];
	}

}
