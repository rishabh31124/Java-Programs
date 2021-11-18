package QPS_7;

import java.util.ArrayList;
// approach - o(n)
public class money_change_csd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 6, 3, 1 };
		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int val : arr)
			al.add(val);
		int org_amt = amount(al);
		int ans = org_amt;
		for (int i = 0; i < al.size(); i++) {
			ArrayList<Integer> cur = new ArrayList<>(al);
			int amount = org_amt;
			for (int j = i + 1; j < arr.length; j++) {
				amount = amount + arr[i] - arr[j];
				ans = Math.max(amount, ans);
			}
			amount = org_amt;
			for (int j = i - 1; j >= 0; j--) {
				amount = amount + arr[j] - arr[i];
				ans = Math.max(amount, ans);
			}
		}
		return ans;

	}

	public static int amount(ArrayList<Integer> al) {
		int amount = 0;
		for (int i = 0; i < al.size(); i++)
			amount += al.get(i) * (i + 1);
		return amount;
	}

}
