package Qa_practiceSession;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestSellStock {
	public static void profit(int[] price) {

		int maxProfit = 0;
		int min_buy = Integer.MAX_VALUE;
		for (int i = 0; i < price.length; i++) {
			// selling your stock on this day
			int currentDayProfit = price[i] - min_buy;
			maxProfit = currentDayProfit > maxProfit ? currentDayProfit : maxProfit;
			System.out.println(currentDayProfit);
			// update min buy
			min_buy = min_buy > price[i] ? price[i] : min_buy;
		}
		System.out.println("max profit :" + maxProfit);

	}

	public static void main(String[] args) {
		int[] price = { 7, 1, 5, 3, 6, 4 };
		profit(price);
	}
}
