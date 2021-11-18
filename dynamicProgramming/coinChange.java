package dynamicProgramming;

public class coinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int rec(int []arr, int inx,int amount,String str)
	{
		if(amount == 0)
		{
			System.out.println(str);
			return 1;
		}
		if(amount < 0)
		{
			return 0;
		}
		int ans = 0;
		for(int i = inx; i < arr.length;i++)
		{
			ans += rec(arr,i,amount-arr[i],str+arr[i]);
		}
		return ans;
	}
	//top down approach -- 
	public static int topDown(int []arr,int inx,int amt,int[][] dp)
	{
		if (amt == 0)
			return 1;
		if (amt < 0)
			return 0;
		if (dp[inx][amt] != 0)
			return dp[inx][amt];
		int ans = 0;
		for (int i = inx; i < arr.length; i++)
			ans += topDown(arr, i, amt - arr[i], dp);
		dp[inx][amt] = ans;
		return ans;
	}
	//bottom down approach --
//	public static int bottomUp(int[] arr, int amt)
//	{
//		int dp[][] = new int[arr.length][amt+1];
//		for(int j = arr.length;j>=0;j--)
//		{
//			
//		}
//		
//	}
	public static int rec(int[] arr, int idx, int amount, String str, int[][] dp) {
		if (amount == 0) {
//			System.out.println(str);
			return 1;
		}
		if (amount < 0) {
			return 0;
		}
		if (dp[idx][amount] != 0) {
			return dp[idx][amount];
		}

		int ans = 0;
		for (int i = idx; i < arr.length; i++) {
			ans = ans + rec(arr, i, amount - arr[i], str + " " + arr[i], dp);
		}
		dp[idx][amount] = ans;
		return ans;
	}

	public static int topDown2(int[] arr,int amt, int inx, int[][] dp)
	{
		if (amt == 0)
			return 1;
		if (amt < 0 || inx == arr.length)
			return 0;
		if (dp[inx][amt] != 0)
			return dp[inx][amt];
		int sp1 = topDown2(arr, amt - arr[inx], inx, dp);
		int sp2 = topDown2(arr, amt, inx + 1, dp);
		dp[inx][amt] =sp1 + sp2;
		return sp1 + sp2;
	}

}
