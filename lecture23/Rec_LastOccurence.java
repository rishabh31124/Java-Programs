package lecture23;

public class Rec_LastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 30, 20, 50, 30, 60, 50 };
		int ele = 50;
//		int ans = lo1(a, 0, ele);
		int ans = lo2(a, 0, ele);
		System.out.println(ans);
	}

	static int lo1(int[] a, int index, int ele) {
		// 1. bp = a0
		// 2. sp = a1 - alast
		// 3. if bp = ele then store the index of it
		int last = 0;
		// base case
		if (index == a.length) {
			return -1;
		}
		// code
		if (a[index] == ele) {
			last = index;
		}
		return (Math.max(lo1(a, index + 1, ele), last));
	}
	static int lo2(int[] a, int index, int ele) // sir method
	{
		if(index == a.length)
		{
			return -1;
			
		}
		int sp = lo2(a,index+1,ele);
		if((sp == -1) && (a[index] == ele))
		{
			return index;
		}
		return sp;
	}

}
