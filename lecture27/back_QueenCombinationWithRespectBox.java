package lecture27;

public class back_QueenCombinationWithRespectBox {
		static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queenComW_r_T_box(new boolean[4],0,0,2,"");
	}
	static void queenComW_r_T_box(boolean[] board,int index, int currQueen, int totalQueen,String ans)
	{
		if(currQueen == totalQueen)// positive base case
		{
			System.out.println(++count+"- "+ans);
			return;
		}
		if(index == board.length) // negative base case
		{
			return;
		}
		queenComW_r_T_box(board,index+1,currQueen+1,totalQueen,ans+"b"+index);
		queenComW_r_T_box(board,index+1,currQueen,totalQueen,ans);
	}

}
