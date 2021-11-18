package lecture23;

public class Rec_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5 };
		print1(a, a.length -1);
		System.out.println();
		print2(a,0);
	}
//               first type 
	static void print1(int[] a, int index) {
		// first type
		// base case
		if(index == 0)
		{
			System.out.println(a[index]); // it works only once
			return;
		}
		// code
		print1(a,index-1);
		System.out.println(a[index]);

	}
	//           second type
	static void print2(int[] a,int index)
	{
		// base case
		if (index == a.length) {
			return;
		}
//		// code
		System.out.println(a[index]);
		print2(a, index + 1);
	}

}
