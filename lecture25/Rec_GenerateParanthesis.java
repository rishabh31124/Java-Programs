package lecture25;

import java.util.ArrayList;

public class Rec_GenerateParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
//		ArrayList<String> list = new ArrayList<String>();
		parath(n, 0, 0, "");
//		System.out.println(list);
	}

	static void parath(int n, int open, int close,String ans) {
		
		if (open == n && close == n) // Base Case
		{
//			list.add(ans);
			System.out.println(ans);
			return;
		}
		if ((close > open) || (open > n)) // negative case
		{
			return;
		}
		parath(n , open + 1, close, ans + "(");
		parath(n , open, close + 1, ans + ")");

	}

}
