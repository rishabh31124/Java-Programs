package lecture11;

public class barGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3,7,1,5};
		graph(a);
	}
	public static void graph(int[] a) {
		int max = max(a);
		int row = 1;
		while(row<max) {
			for(int i = 0 ; i < a.length;i++) {
				if((max-a[i])>row) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
			row++;
		}
	}
//	-----Return maximum element that gives number of rows------------
	public static int max(int[] a) {
		int max = a[0];
		for(int i = 1 ; i < a.length;i++) {
			if(max<a[i]) {
				max = a[i];
			}
		}
		return max;
	}

}
