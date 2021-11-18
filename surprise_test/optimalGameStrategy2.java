package surprise_test;

import java.util.Scanner;

public class optimalGameStrategy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {1,2,3,4};
//		game(nums);
		
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int[] nums=new int[n];
//		for(int i=0;i<n;i++) {
//			nums[i]=sc.nextInt();
//		}
		System.out.println(nums.length);
		System.out.println(game(nums,0,nums.length-1));
		System.out.println(bu(nums));
	}
	// tc = n^2.
	static int bu(int[] arr) {
		int dp[][] = new int[arr.length][arr.length];
		
		for(int start=arr.length-1;start>=0;start--) {
			for(int end=0;end<arr.length;end++) {
				if(start+1>end) {
					continue;
				}
				if(start+1==end) {
					dp[start][end]=Math.max(arr[start], arr[end]);
					continue;
				}
				int sp1=arr[start]+Math.min(dp[start+2][end], dp[start+1][end-1]);// trick is math.min
				int sp2=arr[end]+Math.min(dp[start][end-2], dp[start+1][end-1]);
				dp[start][end]=Math.max(sp1, sp2);
			}
		}
		return dp[0][arr.length-1];
	}
	
	
	static int game(int[] arr,int start,int end) {
		 
		if(start+1==end)
			return Math.max(arr[start], arr[end]);
//		int sp1=arr[start]+game(arr,start+2,end);
//		int sp2=arr[start]+game(arr,start+1,end-1);
		
		int sp10=arr[start]+Math.min(game(arr,start+2,end), game(arr,start+1,end-1));
		
//		int sp3=arr[end]+game(arr,start,end-2);
//		int sp4=arr[end]+game(arr,start+1,end-1);
		
		int sp20=arr[end]+Math.min(game(arr,start,end-2), game(arr,start+1,end-1));
		
		
		return Math.max(sp10,sp20);
	}
	
//	static int game(int[] arr,int start,int end) {
//		
//		if(start+1==end)
//			return Math.max(arr[start], arr[end]);
//		int sp1=arr[start]+game(arr,start+2,end);
//		int sp2=arr[start]+game(arr,start+1,end-1);
//		int sp3=arr[end]+game(arr,start,end-2);
//		int sp4=arr[end]+game(arr,start+1,end-1);
//		return Math.max(Math.max(sp1, sp2),Math.max(sp2, sp3));
//		
//	}
	
}