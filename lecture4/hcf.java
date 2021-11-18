package lecture4;

public class hcf { // hcf or gcd ----------------

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 60;
		int b = 30;
		int c = 0;
		for(int i = 2; i <= Math.min(a, b); i++)
		{
			if(a%i ==0 && b%i == 0)
			{
				c = i;
			}
		}
		System.out.println(c);
	}

}
