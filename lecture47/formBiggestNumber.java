package lecture47;

import java.util.Arrays;

public class formBiggestNumber {
	public static void main(String[] args) {
		solve("DDIDD");
//		sulve("DDIDD");
	}

	public static void sulve(String str) {
		int[] ans = new int[str.length() + 1];
		int num = 1;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				ans[i] = num;
				num++;
				System.out.println(i + " : ");
				for (int j = i - 1; j >= 0 && str.charAt(j) != 'I'; j--) {
					ans[j] = num;
					num++;
				}

				System.out.println(Arrays.toString(ans));
			}

		}
	}

	public static void solve(String str) {
		int ans[] = new int[str.length() + 1];
		int num = 1;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length()||str.charAt(i) == 'I' ) {// always length wali condition first likhni hai
				ans[i] = num;// 'I'th wali pe num initial num value fill kar do and phir j loop lga do taki ulta fill ho number in inc order 
				num++;
				for (int j = i - 1; j >= 0 && str.charAt(j) != 'I'; j--) {// jaise hi I mile ulta bharna start kar do
					ans[j] = num;
					num++;
				}
			}
		}
		System.out.println(Arrays.toString(ans));

	}
}
