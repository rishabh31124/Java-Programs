package lecture11;

public class subArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4};
		subArray(a);
		subArrayPrint(a);
		subArrayPrintSum(a);
		subArrayPrintSum2Loop(a);
	}
//	---------print subArray index------------------------------------------
	public static void subArray(int[] a) {
		for(int si = 0 ; si <a.length;si++) {
			for(int ei = si ; ei < a.length ; ei ++) {
				System.out.print("("+si+", "+ei+")");
			}
			System.out.println();
		}
	}
//	-----print subArray Element from Array----------------------------------
	public static void subArrayPrint(int[] a) {
		for(int si = 0 ; si <a.length;si++) {
			for(int ei = si ; ei < a.length ; ei ++) {
				for(int k = si ; k<=ei;k++) {
					System.out.print(a[k]+" ");
				}
				System.out.println();
			}
			
		}
	}
//	-----print subArray sum-----------------------------------------------
	public static void subArrayPrintSum(int[] a) {
		for(int si = 0 ; si <a.length;si++) {
			for(int ei = si ; ei < a.length ; ei ++) {
				int sum = 0;
				for(int k = si ; k<=ei;k++) {
					System.out.print(a[k]+" ");
					sum = sum + a[k];
				}
				System.out.println("---------------> "+sum);
				System.out.println();
			}
			
		}
	}
//	------------------optimize time complexity on finding sum---------------------
	public static void subArrayPrintSum2Loop(int[] a) {
		for(int si = 0 ; si <a.length;si++) {
			int sum = 0;
			for(int ei = si ; ei < a.length ; ei ++) {
				sum = sum + a[ei];
				System.out.println("---------------> "+sum);
				System.out.println();
			}
			
		}
	}

}
