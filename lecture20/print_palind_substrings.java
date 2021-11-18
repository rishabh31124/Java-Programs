package lecture20;

public class print_palind_substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_ss("nitin");
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
				// is substring is palin then print
				if(pal(ss))
				{
				System.out.println(ss);
				count++;
				}
			}
		}
		// count number of palin substrings.
		System.out.println(count);
	}
	static boolean pal(String s)
	{
		int si = 0;
		int ei = s.length()-1;
		while(si < ei)
		{
			if(s.charAt(si) != s.charAt(ei))
			{
				return false;
			}
			else
			{
				si++;
				ei--;
			}
		}
		return true;
	}

}
