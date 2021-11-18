
public class lecture42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 15, 25 };
		int[] b = { 1, 5, 20, 30 };
		game(a, b, -1, "", -1, true);
	}

	static void game(int[] a, int b[], int prea, String ans, int preb, boolean turna) {
		if (turna) {
			if (preb > -1) {
				System.out.println(ans);
			}
			for (int i = prea; i < a.length; i++) {
				if(preb > -1 || a[i] > b[preb])
				game(a, b, i, ans + a[i], preb, false);
			}
		} else {
			for (int i = preb; i < b.length; i++) {
				if(prea > -1 || b[i] > a[prea])
				game(a, b, prea, ans + b[i], i, true);
			}
		}

	}

}
