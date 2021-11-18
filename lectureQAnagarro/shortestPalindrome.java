package lectureQAnagarro;

import java.util.Scanner;

public class shortestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(reverseString("rishu"));
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(pal(s)); // printing palind. string
	}

	static String pal(String s) {
		for (int i = s.length() - 1; i >= 0; i--) { // check short palind. within the string
			if (isPal(s, 0, i)) {
				int n = s.length() - i;// from palindrome upto length add at the first
				String str = reverseString(s.substring(i + 1)) + s;
				return str;
			}
		}
		return "";
	}

	static boolean isPal(String s, int start, int end) {// check palindrome
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	static StringBuffer reverseString(String s) {
		StringBuffer str2 = new StringBuffer();
		for (int i = s.length() - 1; i >= 0; i--) {
			str2.append(s.charAt(i));
		}
		return str2;
	}

}
