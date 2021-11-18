package lecture22;

public class REC_IncreasingDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pid(1,5);
	}
	static void pid(int start, int n) // two variables recursion
	{
		if(start > n) // Base case
		{
			return;
		}
		System.out.println(start);  // print condition bigger problem
		pid(start+1,n);  // Smaller Problem
		System.out.println(start);
		
	}

}
