package lecture26;

public class PalindromePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		partition_palindrome("nitin", "");
	}

	static void partition_palindrome(String s, String ans) {
		if (s.isEmpty()) {  // Base Case
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= s.length(); i++) {
			String chopped = s.substring(0, i); // partion of string into substring
			String rem = s.substring(i); // remaining substring
			if (checkPal(chopped)) { // checking palindrome of partition
				partition_palindrome(rem, ans + " - " + chopped);
			}
		}
	}

	static boolean checkPal(String s) {
		int si = 0;
		int ei = s.length() - 1;
		while (si < ei) {
			if (s.charAt(si) != s.charAt(ei)) {
				return false;
			} else {
				si++;
				ei--;
			}
		}
		return true;
	}

}
