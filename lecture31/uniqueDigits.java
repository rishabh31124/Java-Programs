package lecture31;

public class uniqueDigits {
	 static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 9;i++)
		{
			dig(i,0,100,true);
		}
	}
	static void dig(int cur,int low,int high,boolean flag)
	{
		
		int digit = cur % 10;
		
		for(int i = 1; i <= 9;i++)
		{
			if(digit == i)
			{
				flag = false;
			}
//			dig(cur *10+1);
		}
		
		
	}
}
	