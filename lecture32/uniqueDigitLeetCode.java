package lecture32;

public class uniqueDigitLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] used = new boolean[10];// picked or not
		unique(0, used, 2);

	}

	static void unique(int cur, boolean[] used, int n) {

		if (cur >= Math.pow(10, n))// main step bc
		{
			return;
		}

		System.out.println(cur);

		int i = 0;
		if (cur == 0) {
			i = 1;
		}
		for (; i < 10; i++) {
			if (used[i] == false) {

				used[i] = true;// backtracking
				unique(cur * 10 + i, used, n);
				used[i] = false;// backtracking
			}
		}
	}

}
