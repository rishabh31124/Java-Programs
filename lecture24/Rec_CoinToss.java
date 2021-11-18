package lecture24;

public class Rec_CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		coin(n, "");
	}

	static void coin(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		coin(n - 1, ans + 'h');
		coin(n - 1, ans + 't');
	}
}
