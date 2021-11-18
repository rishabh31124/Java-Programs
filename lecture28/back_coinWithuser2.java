package lecture28;
// coins are unique and finite
public class back_coinWithuser2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 2, 3, 4, 6 };
		coin(coins, 6,0, "");
	}
	static void coin(int[] coins, int amount,int index, String ans)
	{
		if(amount < 0 )
		{
			return;
		}
		if(amount == 0)
		{
			System.out.println(ans);
			return;
		}
		for(int i = index; i < coins.length; i++)
		{
			coin(coins,amount-coins[i],i+1,ans+coins[i]);
		}
	}

}
