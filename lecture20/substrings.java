package lecture20;

public class substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_ss("hello");
	}
	static void print_ss(String s)
	{
		int count = 0;
		for(int si = 0; si < s.length(); si++)
		{
	// in the second loop , range is upto s.length because (ei) is in excluded part of substring
			for(int ei = si + 1; ei <= s.length(); ei++)
			{
				String ss = s.substring(si,ei);
				count++;
				System.out.println(ss);
			}
		}
		// count number of substrings.
		System.out.println(count);
	}

}
