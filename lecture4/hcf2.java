package lecture4;

public class hcf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 60;
		int b = 32;
		int divisor = Math.min(a, b);
		int dividend = Math.max(a, b);
		while(true)
		{
			int remainder = dividend % divisor;
			if(remainder == 0)
			{
				break; // terminating condition of while(true) infinite condition
			}
			divisor = dividend;
			divisor = remainder;
			
		}
		System.out.print(divisor);
	}

}
