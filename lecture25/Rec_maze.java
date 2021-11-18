package lecture25;

public class Rec_maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maze(0, 0, 3, 3, "");
	}

	static void maze(int curr, int curc, int endr, int endc, String ans) {
		if (curr == endc && curc == endc) {
			System.out.println(ans);
			return;
		}
		if (curr > endr || curc > endc) {
			return;
		}
		maze(curr + 1, curc, endr, endc, ans + "v");
		maze(curr, curc + 1, endr, endc, ans + "h");
	}

}
