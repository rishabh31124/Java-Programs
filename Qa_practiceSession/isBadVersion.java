package Qa_practiceSession;
//https://leetcode.com/problems/first-bad-version/

public class isBadVersion {
	public static void update(int n) {
		int start = 0;
		int end = 0;
		int ans = -1;
		while (start <= end) {
			int mid = end + (start - end) / 2; // taki range se bahar na jaye
			boolean curr = isBadVersion(mid);// inbuild function
			if (curr == false) {
				start = mid + 1;
			} else {
				end = mid - 1;
				ans = mid;// to store first true
			}
		}
		System.out.println(ans);
	}

	private static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
