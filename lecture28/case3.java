package lecture28;
		//with respecct to user
public class case3 {
	// coins are finite,duplicate coins,combinations,output unique

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 2,2,4,4 };
		coin3(coins, 6,0, "");
	}
	static void coin3(int[] coins,int amt,int index,String ans)
	{
		if(amt < 0)
		{
			return;
		}
		if(amt == 0)
		{
			System.out.println(ans);
			return;
		}
		
		
		for(int  i = index;i < coins.length; i++)
		{
			if((i > index) && (coins[i] == coins[i-1])) // condition important for remove duplicacy
			{
				continue;
			}
			coin3(coins,amt-coins[i],i+1,ans+coins[i]);
		}
	}

}
