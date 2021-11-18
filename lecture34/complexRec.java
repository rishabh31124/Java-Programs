package lecture34;
	//Time complexity o(n)
public class complexRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(3,3));
	}
	static int pow(int a, int n)
	{
		if(n == 0)
		{
			return 1;
		}
		if(n % 2 == 1)
		{
			int sp = (int)Math.pow(a, n/2);
			// step to be taken for odd n.
			return sp*sp*a;
		}
		else {
		int sp = (int)Math.pow(a, n/2);
		return sp*sp;
		}
	}

}
