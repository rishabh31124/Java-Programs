package lecture17;

public class polynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(7,3));
	}
	public static int solve(int x, int n)
	{
		int sum = 0;
		int x_pow = x;
		for(int i = n; i >= 1; i--)
		{
			sum += i*x_pow;
			x_pow *= x;
		}
		return sum;
	}

}
