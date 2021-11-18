package lecture4;

public class rev_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4321;
		int rev = 0;
		while(n != 0)
		{
			int div = n % 10;
			rev = rev *10 + div;
			n /= 10;
		}
		System.out.println(rev);
	}

}
