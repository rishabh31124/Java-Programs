package lecture24;

public class Rec_Subsequence {
		// sequence matters ------ peeche ka select ni karega 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		String ans = "";
		subs(s, ans);
	}
	// in subsequence order matters..................
	static void subs(String s, String ans) {
		if (s.isEmpty()) // base Case
		{
			System.out.println(ans);
			return;
		}
		char ch = s.charAt(0);
		String ques = s.substring(1);
		subs(ques, ans + ch); // included -- sp
		subs(ques, ans); // Excluded -- sp

	}

}
