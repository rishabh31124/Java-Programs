package lecture30;
//https:leetcode.com/problems/word-search/
//https:leetcode.com/problems/combination-sum/
//
//https:leetcode.com/problems/combination-sum-ii/
//
//https://leetcode.com/problems/combinations/

////https:leetcode.com/problems/combination-sum-iii/



public class wordSearch {

	public static void main(String[] args) {
	
		char[][] maze = {{'A','B','C','D'},{'S','F','C','S'},{'A','D','E','E'}};
//		word(maze,new boolean[4][4],0,0,"AB","",0);
		String word = "ABCD";
		for(int i = 0; i < maze.length;i++)
		{
			for(int j = 0; j < maze[0].length;j++)
			{
				if(maze[i][j] == word.charAt(0) )
				{
					word(maze,new boolean[4][4],i,j,"ABCD","",0);
				}
			}
		}
	}
	static void word(char[][] maze,boolean[][] visited,int row,int col, String toFind,String ans, int index)
	{
		// -ve bc
		if(row == -1 || row == maze.length || col == -1 || col == maze[0].length || visited[row][col] || 
			maze[row][col] != toFind.charAt(index)	)
		{
			return;
		}
		
		
		//+bc
		if(index == toFind.length()-1)
		{
			System.out.println(ans);
			return;
		}
		
		visited[row][col] = true;
		//code
		word(maze,visited,row-1,col,toFind,ans+maze[row][col],index+1);
		word(maze,visited,row+1,col,toFind,ans+maze[row][col],index+1);
		word(maze,visited,row,col-1,toFind,ans+maze[row][col],index+1);
		word(maze,visited,row,col+1,toFind,ans+maze[row][col],index+1);
		visited[row][col] = false;
	}
	
}
