package dynamicProgramming;

import java.util.Arrays;

public class longestCoomonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "abcd";
		String word2 = "agcd";
//		System.out.println(rec(word2,word2,0,0));
		int[][] dp = new int[word1.length()][word2.length()];
		for (int[] val : dp)
			Arrays.fill(val, -1);
		System.out.println(td(word1, word2, 0, 0, dp));
	}
	//recursion code
	public static int rec(String word1, String word2, int w1, int w2) {

		if (w1 == word1.length() || w2 == word2.length())
			return 0;
		if (word1.charAt(w1) == word2.charAt(w2))
			return 1 + rec(word1, word2, w1 + 1, w2 + 1);
		else {
			int sp1 = rec(word1, word2, w1 + 1, w2);
			int sp2 = rec(word1, word2, w1, w2 + 1);
			return Math.max(sp1, sp2);
		}
	}
	//dp code - top down approach
	public static int td(String word1, String word2, int w1, int w2, int[][] dp) {
		if (w1 == word1.length() || w2 == word2.length())
			return 0;
		if (dp[w1][w2] != -1)
			return dp[w1][w2];
		if (word1.charAt(w1) == word2.charAt(w2)) {
			dp[w1][w2] = 1 + td(word1, word2, w1 + 1, w2 + 1, dp);
			return dp[w1][w2];
		} else {
			int sp1 = td(word1, word2, w1 + 1, w2, dp);
			int sp2 = td(word1, word2, w1, w2 + 1, dp);
			dp[w1][w2] = Math.max(sp1, sp2);
			return Math.max(sp1, sp2);
		}
	}

}
