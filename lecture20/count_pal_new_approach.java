package lecture20;

public class count_pal_new_approach {
	// less complexity

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		print("nitin");
		print("nittan");
	}
	static void print(String s)
	{
		int count = 0;
		// set the middle
		for(int mid = 0; mid < s.length(); mid++)
		{
			// add the left and right char to the middle element
			for(int rad = 0; mid+rad <s.length() && mid-rad >= 0; rad++)
			{
				if(s.charAt(mid+rad) == s.charAt(mid-rad))
				{
					count++;
					System.out.println(s.substring(mid-rad,mid+rad+1));
				}
				else
				{
					break;
				}
			}
		}
		System.out.println(count);
		for(double mid = 0.5; mid < s.length(); mid++)
			{
				// add the left and right char to the middle element
				for(double rad = 0.5; mid+rad <s.length() && mid-rad >= 0; rad++)
				{
					if(s.charAt((int)(mid+rad)) == s.charAt((int)(mid-rad)))
					{
						count++;
						System.out.println(s.substring((int)(mid-rad),((int)(mid+rad+1))));
					}
					else
					{
						break;
					}
				}
			}
			System.out.println(count);
		}
	
//	static void print2(String s)
//	{
//		int count = 0;
//		// set the middle
//		for(double mid = 0.5; mid < s.length(); mid++)
//		{
//			// add the left and right char to the middle element
//			for(double rad = 0.5; mid+rad <s.length() && mid-rad >= 0; rad++)
//			{
//				if(s.charAt((int)(mid+rad)) == s.charAt((int)(mid-rad)))
//				{
//					count++;
//					System.out.println(s.substring((int)(mid-rad),((int)(mid+rad+1))));
//				}
//				else
//				{
//					break;
//				}
//			}
//		}
//		System.out.println(count);
//	}

}
