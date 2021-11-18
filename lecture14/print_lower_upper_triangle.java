package lecture14;

public class print_lower_upper_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		upper(a);
		lower(a);
		
	}
	public static void upper(int[][] a)
	{
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[0].length; col++)
			{
				if(col < row)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print(a[row][col] + " ");
				}
			}
			System.out.println();
		}
	}
	public static void lower(int[][] a)
	{
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[0].length; col++)
			{
				if(col > row)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print(a[row][col] + " ");
				}
			}
			System.out.println();
		}
	}

}
