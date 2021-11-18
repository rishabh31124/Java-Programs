package lecture23;

import java.util.Arrays;

public class Freq_ArrayCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "avdxjhhj";
		freqArray(s);
	}

	static void freqArray(String s) {
		int freq[] = new int[256];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i)]++;
		}
		System.out.println(Arrays.toString(freq));

	}

}
