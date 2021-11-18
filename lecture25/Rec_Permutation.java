package lecture25;

public class Rec_Permutation {
	// sequence doesnt matter
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("abc", "");
	}

	static void permutation(String s, String ans) {
		if (s.isEmpty()) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String sp = s.substring(0, i) + s.substring(i + 1);// SMALLER PROBLEM
			permutation(sp, ans + ch);
		}
	}

}
