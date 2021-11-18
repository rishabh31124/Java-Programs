package lecture22;

public class REC_DecreasingIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pdi(5);
	}
	static void pdi(int n) {
		if (n == 0) // Base case( Termination Condition )
		{
			return;
		}
		System.out.println(n);
		pdi(n - 1);
		System.out.println(n);

	}


}
