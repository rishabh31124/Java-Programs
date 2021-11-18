package lecture23;

public class Rec_MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,35,5,30,45};
		int ans = max(a,0);
		System.out.println(ans);
	}
	static int max(int[] a, int index)
	{
		// base case
		if(index == a.length)
		{
			return Integer.MIN_VALUE;
		}
		// code
		
//		int sp = max(a,index+1);
//		int bp = Math.max(a[index], sp);
//		return bp;
		// one line code
		return Math.max(max(a,index+1), a[index]);
	}

}
