package lecture20;

public class check_palindrome_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pal("hello"));
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
