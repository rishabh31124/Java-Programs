package lecture30;
//https:leetcode.com/problems/word-search/
class Solution {
    static boolean flag = false;
    public boolean exist(char[][] maze, String word) {
      // char[][] maze = {{'A','B','C','D'},{'S','F','C','S'},{'A','D','E','E'}};
//		word(maze,new boolean[4][4],0,0,"AB","",0);
		// String word = "ABCD";
		for(int i = 0; i < maze.length;i++)
		{    flag = false;
			for(int j = 0; j < maze[0].length;j++)
			{
				if(maze[i][j] == word.charAt(0) )
				{
                    word(maze,new boolean[maze.length][maze[0].length],i,j,word,0);
                    if(flag){
                        return true;
                    }				
                }
			}
		}
        return false;
	}
	static void word(char[][] maze, boolean[][] visited,int row,int col, String toFind, int index)
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
			// System.out.println(ans);
            flag = true;
			return;
		}
		
		visited[row][col] = true;
		//code
		word(maze,visited,row-1,col,toFind,index+1);
		word(maze,visited,row+1,col,toFind,index+1);
		word(maze,visited,row,col-1,toFind,index+1);
		word(maze,visited,row,col+1,toFind,index+1);
		visited[row][col] = false;
	}  
}