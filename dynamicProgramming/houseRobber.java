package dynamicProgramming;

import java.util.Arrays;
//leetcode.com/problems/house-robber/
public class houseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1,4,8,6,2,9};
		int[] dp = new int[nums.length+2];
		Arrays.fill(dp, -1);
		System.out.println(td(nums,0,dp));
		System.out.println(rec(nums,0));
		System.out.println(bu(nums));
	}
	//recursion
	public static int rec(int[] nums,int in)
	{
		if (in >= nums.length)
			return 0;
		int sp1 = nums[in] + rec(nums, in + 2);
		int sp2 = rec(nums, in + 1);
		return Math.max(sp1, sp2);
	}
	//top-down approach
	public static int td(int[] nums, int in, int[] dp) {
		if (in >= nums.length)
			return 0;
		if (dp[in] != -1)
			return dp[in];
		int sp1 = nums[in] + td(nums, in + 2, dp);// considering first element
		int sp2 = td(nums, in + 1, dp);// not considering first element
		dp[in] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}
	//bottoms-up approach
	public static int bu(int[] nums) {
		int[] dp = new int[nums.length + 2];
		for (int i = nums.length - 1; i >= 0; i--) {
			int c1 = nums[i] + dp[i + 2];
			int c2 = dp[i + 1];
			dp[i] = Math.max(c1, c2);
		}
		return dp[0];
	}

}
