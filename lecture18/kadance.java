package lecture18;

public class kadance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-10,-20,-30,-1};
		Algo_kadance(a);
	}
	public static void Algo_kadance(int[] a)
	{
		int max_sum = Integer.MIN_VALUE;
		int cur_sum = 0;
		for(int i =0; i<a.length;i++)
		{
			cur_sum += a[i];
			if(max_sum < cur_sum )
			{
				max_sum = cur_sum;
			}
			if(cur_sum < 0)
			{
				cur_sum = 0;
			}
		}
		System.out.println(max_sum);
	}

}
