package lecture26;

public class Rec_jumping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jump(1, 100);
	}

	static void jump(int curr, int end) {
		if (curr > end) {
			return;
		}
		System.out.println(curr + " ");
		if (curr == 0) {
			for (int i = 1; i <= 9; i++) {
				jump(curr * 10 + i, end);
			}

		} else {
			jump(curr * 10 + (curr % 10 - 1), end);
			if(curr%10 != 9)
			{
				jump(curr * 10 + (curr % 10 + 1), end);
			}
			
		}

	}

}
