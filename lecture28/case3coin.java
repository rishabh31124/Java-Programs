package lecture28;

public class case3coin {
	// coins are finite,duplicate coins,combinations,output unique
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 2,2,2,4,4 };
		coin(coins, 6, 0, "",true); 
		// similar to head and tails case
	}
	static void coin(int[] coins, int amt, int index, String ans,boolean flag) {
		
		if (amt < 0 || index == coins.length) {
			return;
		}
		if (amt == 0) {
			System.out.println(ans);
			return;
		}
		if(flag == false && coins[index] == coins[index-1])// important step
		{ // we stop calss that previously occured
			coin(coins, amt, index + 1, ans,false);
			return;
		}
		coin(coins, amt - coins[index], index+1, ans + coins[index],true);// placed
		coin(coins, amt, index + 1, ans,false);// not to be placed
	}

}
