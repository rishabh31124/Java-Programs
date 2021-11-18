package lecture27;

public class back_queenPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queenPerm(new boolean[3],0,2,"");
	}
	static void queenPerm(boolean[] board, int curqueen, int totalqueen, String ans)
	{
		if(totalqueen == curqueen)
		{
			System.out.println(ans);
			return;
		}
		for(int i = 0; i < board.length; i++)
		{
			if(board[i] == false) {
			board[i] = true;
			queenPerm(board,curqueen+1,totalqueen,ans+"b"+i+"q"+curqueen+",");
			board[i] = false;
			}
		}
	}

}
