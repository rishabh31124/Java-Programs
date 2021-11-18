package lecture26;

public class Rec_LexicographicallyOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		order(0,10);
	}
	static void order(int cur, int end)
	{
		if(cur > end)
		{
			return;
		}
		System.out.println(cur + " ");
		int i = 0;
		if(cur == 0)
		{
			 i = 1;
		}
		for(; i <= 9;i++)
		{
			order(cur*10+i,end);
		}
	}

}
