package lecture24;

public class Rec_keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keypad("12","");
	}

	static void keypad(String s, String ans) {

		if (s.isEmpty()) {
			System.out.println(ans);
			return;
		}
		char ch = s.charAt(0);
		String sp = s.substring(1);
		String code = character(ch);
		for (int i = 0; i < code.length(); i++) {
			keypad(sp, ans + code.charAt(i));
		}

	}

	static String character(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jkl";
		else if (ch == '5')
			return "mno";
		else if (ch == '6')
			return "pqrs";
		else if (ch == '7')
			return "tuv";
		else if (ch == '8')
			return "wx";
		else if (ch == '9')
			return "yz";
		else
			return "";
	}

}
