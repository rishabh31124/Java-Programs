package lecture29;

import java.util.Scanner;

public class knightProblem {
	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		 int n= sc.nextInt();
		count = 0;
//	    knight(new boolean[n][n],n,0,0,0,"");

		knight(new boolean[2][2], 2, 0, 0, 0, "");
		System.out.println();
		System.out.println(count);
	}

	static void knight(boolean[][] board, int tlq, int curq, int row, int col, String ans) {
		if (tlq == curq)// +ve
		{
			count++;
			System.out.print(ans + "  ");
			return;
		}
		if (col == board[row].length) {
			row = row + 1;
			col = 0;
		}
		if (row == board.length)// -ve
		{
			return;
		}
		if (isSafe(board, row, col)) {
			board[row][col] = true;
			knight(board, tlq, curq + 1, row, col + 1, ans + "{" + row + "-" + col + "} ");// placed
			board[row][col] = false;// backtracking

		}

		knight(board, tlq, curq, row, col + 1, ans);// not placed
	}

	static boolean isSafe(boolean[][] board, int row, int col)// check safe condition queen maregi th ni
	{
		int[] ar1 = { -1, -2, -2, -1 };
		int[] ar2 = { 2, 1, -1, -2 };
		for (int i = 0; i < 4; i++) {
			int cr = row + ar1[i];
			int cc = col + ar2[i];
			if (cr >= 0 && cc >= 0 && cc < board[0].length && board[cr][cc]) {
				return false;
			}
		}
		return true;
	}

}
