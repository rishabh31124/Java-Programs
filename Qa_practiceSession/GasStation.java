package Qa_practiceSession;
//https://leetcode.com/problems/gas-station

public class GasStation {
	public static void max(int[] gas, int[] cost) {
		int i = 0;
		int sum = 0;
		int index = -1;
		while (index != i) {
			sum = sum + gas[i] - cost[i];
			if (sum < 0) {
//				sum = 0;
			} else {
				index = i;
			}
			i = i + 1;
			if (i == gas.length) {
				i = 0;
			}
		}
		System.out.println(index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };

		complete(gas, cost);
	}

	public static void complete(int[] gas, int[] cost) {
		int sum = 0;
		int ans = 0;
		int curSum = 0;
		for (int i = 0; i < gas.length; i++) {
			sum = sum + gas[i] - cost[i];
			curSum = curSum + gas[i] - cost[i];

			if (curSum < 0) {
				curSum = 0;
				ans = i + 1;
			}
		}
		if (sum < 0) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}

	}

}
