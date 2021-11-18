package lecture21;

public class rec_Both_incDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		pdi(n);
//		pi(n);
//		pd(n);
	}

//	static void pi(int n) {
//		if (n == 0) {
//			return;
//		}
//		System.out.println(n);
//		pi(n - 1);
//	}
//
//	static void pd(int n) {
//		if (n == 0) {
//			return;
//		}
//		pd(n - 1);
//		System.out.println(n);
//
//	}
	static void pdi(int n)
	{
		if(n==0) // Base case( Termination Condition )
		{
			return;
		}
		System.out.println(n);
		pdi(n-1);
		System.out.println(n);
		
			
	}

}
