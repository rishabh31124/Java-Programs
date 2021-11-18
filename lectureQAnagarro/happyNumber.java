package lectureQAnagarro;
//https://leetcode.com/problems/happy-number/


public class happyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		happy(17);
	}
	static boolean happy(int n)
	{
		int sum = 0;
		if(sum == 1 || sum == 7)
		{
			return true;
		}
		while(n > 0)
		{
			int digit = n%10;
			sum = sum + digit * digit;
			n /= 10;
		}
		happy(sum);
		return false;		
	}

}
