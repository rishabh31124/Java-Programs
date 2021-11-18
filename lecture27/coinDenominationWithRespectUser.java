package lecture27;

public class coinDenominationWithRespectUser {
		// 1. permutation.
		// 2. infinite number of coins.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 2, 3, 4, 6 };
		coin(coins, 10, "");
	}

	static void coin(int[] coins, int amount, String ans) {
		if (amount < 0) {
			return;
		}
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < coins.length; i++) {
			coin(coins, amount - coins[i], ans + coins[i]);
		}
	}

}
