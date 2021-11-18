package lecture29;

public class maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		mazePath(maze, new boolean[4][4], 0, 0, "");
	}

	static void mazePath(int[][] maze, boolean[][] visited, int row, int col, String ans) {
		if (row == maze.length || row == -1 || col == maze[0].length || col == -1 || maze[row][col] == 1
				|| visited[row][col]) {
			return;
		}
		if (row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(ans);
			return;
		}

		visited[row][col] = true;
		mazePath(maze, visited, row - 1, col, ans + "U");
		mazePath(maze, visited, row + 1, col, ans + "D");
		mazePath(maze, visited, row, col + 1, ans + "R");
		mazePath(maze, visited, row, col - 1, ans + "L");
		visited[row][col] = false;
	}

}
