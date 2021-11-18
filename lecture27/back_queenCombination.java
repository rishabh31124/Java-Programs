package lecture27;

public class back_queenCombination {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queenComb(new boolean[4], 0, -1, 2, "");
		System.out.println(count);
	}

	static void queenComb(boolean[] board, int curqueen, int prevBox, int totalqueen, String ans) {
		if (totalqueen == curqueen) {
			System.out.println(ans);
			++count; // to count no of paths
		}
		for (int i = prevBox + 1; i < board.length; i++) {
//			if(board[i] == false) {  no need to put this becoz prev p ja hi ni rhe
//			board[i] = true;// queen baeth gyi .... work for the next queen
			queenComb(board, curqueen + 1, i, totalqueen, ans + "b" + i + "q" + curqueen + ",");
//			board[i] = false; //queeen hta undo work;
//			}
		}
	}

}
