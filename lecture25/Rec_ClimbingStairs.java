package lecture25;

public class Rec_ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stair(0,5,"");
	}

	static void stair(int cur, int des, String ans) {
		if (cur > des) // negative base case
		{
			return;
		}
		if (cur == des) {
			System.out.println(ans);
			return;
		}

//		stair(cur+1,des,ans+"1");
//		stair(cur+2,des,ans+"2");
//		stair(cur+3,des,ans+"3");
		for (int i = 1; i <= des; i++) {
			stair(cur + i, des, ans + i); // loops for no of calls
		}
	}

}
