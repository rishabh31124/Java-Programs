package testPractice;

public class apples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {2849,1620,705,1,30};
		int n = num.length;
		System.out.println("No. of apples moved- "+app(num,n));
	}

	public static int app(int[] num, int n) {
		int sum = 0;
		for (int i = 0; i < num.length; i++)
			sum += num[i];
		int avg = sum / n;
//		System.out.println(avg);
		int req = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > avg)
				req += num[i] - avg;
		}
		return req;
	}
}
