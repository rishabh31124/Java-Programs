package lectureQAnagarro;

public class IncreasingDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		digit("",-1,3);
	}
	static void digit(String curr, int lastDigit,int n)
	{
		//code
		if(n == 0)
		{
			System.out.println(curr);
			return;
		}
		for(int i = lastDigit+1; i <= 9;i++)
		{
			digit(curr+i,i,n-1);
		}
	}

}
