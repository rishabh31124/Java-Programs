package testPractice;

public class jump {
//minimum - min ka use karo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,0,5,8,9,2,6,7,6,8,9};
		int n=num.length;
		int[] dp = new int[num.length];
		if(rec(num,0,dp)>=999999)
			System.out.println(-1);
		else
			System.out.println(rec(num,0,dp));
	}

	public static int rec(int[] num, int in, int[] dp) {
		if (in == num.length)
			return 0;
		if (in > num.length)
			return 999998;
		if (dp[in] != 0)
			return dp[in];
		int ans = 999998;
		for (int i = 1; i <= num[in]; i++) {	
			int sp = rec(num, in + i, dp);
			ans = Math.min(ans, sp);	
		}
		dp[in] = ans+1;
		return ans+1;
	}

}
