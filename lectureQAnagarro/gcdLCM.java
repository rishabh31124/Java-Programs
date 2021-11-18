package lectureQAnagarro;

public class gcdLCM {
	public static void main(String[] args) {
//		System.out.println(hcf(18,27));
		findGcdLcm(12, 2);
	}

	static void findGcdLcm(int lcm, int hcf) {
		int product = lcm * hcf;
		for (int a = 1; a <= lcm; a++)// pick every number
		{
			if (product % a == 0)// perfectly divisible product by a number
			{
				int b = product / a;
				if (hcf(a, b) == hcf) {
					System.out.println(a + " , " + b);
				}
			}
		}
	}

	public static int hcf(int a, int b) {
		int max = 0;
		int min = (a < b) ? a : b;
		for (int i = 2; i <= min; i++) {
			if (a % i == 0 && b % i == 0) {
				max = i;
			}
		}
		return max;
	}
}
