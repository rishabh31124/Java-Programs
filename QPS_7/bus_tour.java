package QPS_7;

public class bus_tour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 0, 2, 3 }, { -1, 1, 1 }, { 6, 1, 2 } };
		int ans = rec(arr, 0, 0);
		if (!found) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}

	static boolean found = false;
	// for reverse path -------
	public static int rec_p2(int[][] arr, int r, int c) {
		if (r == 0 && c == 0)
			return 0;
		if (r == -1 || c == -1 || arr[r][c] == -1)// blocking state = -1;
			return Integer.MIN_VALUE;

		int temp = arr[r][c];
		arr[r][c] = 0;// backtrack

		int sp1 = rec_p2(arr, r - 1, c);// up
		int sp2 = rec_p2(arr, r, c - 1);// left

		arr[r][c] = temp;

		return Math.max(sp1, sp2) + arr[r][c];

	}

	public static int rec(int[][] arr, int r, int c) {

		if (r == arr.length - 1 && c == arr[0].length - 1) {
			found = true;
			int ans2 = rec_p2(arr, r, c);
			return ans2;
		}

		if (r == arr.length || c == arr[0].length || arr[r][c] == -1) {
			return Integer.MIN_VALUE;
		}

		int temp = arr[r][c];
		arr[r][c] = 0;// backtrack;
		
		int sp1 = rec(arr, r + 1, c);//down
		int sp2 = rec(arr, r, c + 1);//right
		
		arr[r][c] = temp;
		
		if (Math.max(sp1, sp2) == Integer.MIN_VALUE)// to handle minimum value..
			return Integer.MIN_VALUE;
		return Math.max(sp1, sp2) + arr[r][c];

	}

}
