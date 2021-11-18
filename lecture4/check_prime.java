package lecture4;

public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int count = 0;
		for(int i = 2; i*i < n; i++)
		{
			if(n % i == 0)
			{
				count += 1;
			}
		}
		if( count == 0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
