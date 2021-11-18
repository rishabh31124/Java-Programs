package lecture32;

public class tilePossibilities {
	static int count = 0;// for counting number of variables

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "BAA";
		int[] freq = new int[26];
		count = 0;
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'A']++;// making of freq table
		}
		tile(freq, "");
		System.out.println(count - 1);
	}

	static void tile(int[] freq, String ans) {

		count++;
//		System.out.println(ans);
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				char ch = (char) (i + 'A');// extracking character
				freq[i] = freq[i] - 1;// wallet khali karna
				tile(freq, ans + ch);
				freq[i] = freq[i] + 1;// explicit backtracking
			}
		}
	}

}
