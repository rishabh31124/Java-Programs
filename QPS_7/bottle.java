package QPS_7;

//find combination of all keys in minimum bottle combinations -- rows -bottle index ||  columns -- key number.
public class bottle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 1, 0, 1, 0 }, { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 0, 1 }, { 0, 0, 1, 0 } };
		int[] curr_keys = new int[mat[0].length];
		System.out.println(rec(mat, 0, curr_keys, ""));
	}

	public static int rec(int[][] mat, int inx, int[] currkey, String str) {

		if (inx == mat.length) {
			for (int i = 0; i < mat[0].length; i++) {
				if (currkey[i] == 0) {
					return 0;
				}
			}
			System.out.println(str);
			return 1;
		}

		// add key
		for (int i = 0; i < mat[0].length; i++) {
			currkey[i] = currkey[i] + mat[inx][i];
		}
		int sp1 = rec(mat, inx + 1, currkey, str + ",B" + inx);// include

		// backtrack -- remove keys
		for (int i = 0; i < mat[0].length; i++) {
			currkey[i] = currkey[i] - mat[inx][i];
		}

		int sp2 = rec(mat, inx + 1, currkey, str);// exclude

		return sp1 + sp2;
	}

}
