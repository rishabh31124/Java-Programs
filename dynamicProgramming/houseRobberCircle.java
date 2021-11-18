package dynamicProgramming;

public class houseRobberCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		System.out.println(bu(nums));
	}

	public static int bu(int[] nums) {
		// first case
		int[] dp1 = new int[nums.length + 2];
		// case 1 : exclude last house
		for (int i = nums.length - 2; i >= 0; i--) {
			int c1 = nums[i] + dp1[i + 2];
			int c2 = dp1[i + 1];
			dp1[i] = Math.max(c1, c2);
		}
		int ans1 = dp1[0];
		// second case
		int[] dp2 = new int[nums.length + 2];
		// case 1 : exclude first house
		for (int i = nums.length - 1; i >= 1; i--) {
			int c1 = nums[i] + dp2[i + 2];
			int c2 = dp2[i + 1];
			dp2[i] = Math.max(c1, c2);
		}
		int ans2 = dp2[1];
		int ans = Math.max(ans1, ans2);
		return ans;
	}

}
