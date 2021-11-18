package lecture7;

public class rotate_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 654321;
		int k = -2;
		int count = 0;
		int temp = n;
		System.out.println(temp);
		while (temp != 0)
		{
			temp /= 10;
			count++;
		}
		if(k > count) // condition for greater rotation number
		{
			k = k % count;
		}
		if(k < 0) // condition for negative rotation number
		{
			k = k + count;
		}
		int div = (int)Math.pow(10, k);
		int p1 = n % div;
		int p2 = n / div;
		int mult = (int)Math.pow(10, count - k);
		int rot = p1 * mult + p2;
		System.out.println(rot);
	}

}
