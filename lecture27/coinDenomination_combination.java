package lecture27;

public class coinDenomination_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 2, 3, 5, 6 };
		coinComb(coins, 10,0, "");
	}
	static void coinComb(int[] coins, int amount,int prev_index, String ans) {
		if (amount < 0) {
			return;
		}
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = prev_index; i < coins.length; i++) { // for combination we have take prev index so that call should not call again
			coinComb(coins, amount - coins[i],i, ans + coins[i]);
		}
	}

}
