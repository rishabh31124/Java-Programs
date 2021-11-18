package lecture26;
// no consecutive heads come
public class Rec_coinTossPer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coin(3,"",false);
	}
	static void coin(int n,String ans,boolean check)
	{
		if(n==0)
		{
			System.out.println(ans);
			return;
		}
		if(check)// no consecutive heads come-- head is true
		{
			coin(n-1,ans+"T",false);
		}
		else
		{
			coin(n-1,ans+"H",true);
			coin(n-1,ans+"T",false);
		}
		
	}

}
