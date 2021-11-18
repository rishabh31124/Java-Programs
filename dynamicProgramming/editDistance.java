package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/edit-distance/
//https://hack.codingblocks.com/app/contests/2540/1722/problem
public class editDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String w1 = sc.next();
		String w2 = sc.next();
		int[][] dp = new int[w1.length()][w2.length()];
		for (int[] row : dp)
			Arrays.fill(row, -1);
		System.out.println(td(w1, w2, 0, 0, dp));
	}

	public static int td(String w1, String w2, int l1, int l2, int[][] dp) {
		if (w1.length() == l1 || w2.length() == l2)
		{
			return Math.max(w1.length() - l1, w2.length() - l2);
		}
		if (dp[l1][l2] != -1)
		{
			return dp[l1][l2];			
		}
		if (w1.charAt(l1) == w2.charAt(l2)) {
			dp[l1][l2] = td(w1, w2, l1 + 1, l2 + 1, dp);
			return dp[l1][l2];
		} 
		else
		{
			int ci = td(w1, w2, l1, l2 + 1, dp);
			int cd = td(w1, w2, l1 + 1, l2, dp);
			int cr = td(w1, w2, l1 + 1, l2 + 1, dp);
			dp[l1][l2] = 1 + Math.min(Math.min(ci, cr), cd);// opertion kar liya isliye 1 add kar rahe hain
			return dp[l1][l2];
		}
	}

}
