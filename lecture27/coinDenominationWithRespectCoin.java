package lecture27;

public class coinDenominationWithRespectCoin {
	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 2, 3, 5, 6 };
		count = 0;
		coin(coins, 10, 0, "");
		System.out.println(count+" <- count");
	}

	static void coin(int[] coins, int amt, int index, String ans) {
		if (amt == 0) {
			count++;
			System.out.println(ans);
			return;
		}
		if (amt < 0 || index == coins.length) {
			return;
		}
		coin(coins, amt - coins[index], index, ans + coins[index]);// placed
		coin(coins, amt, index + 1, ans);// not to be placed
	}

}
