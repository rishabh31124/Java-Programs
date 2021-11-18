package lecture35;

import java.util.Arrays;// approach to this question is pivot ko mid mein karna hai
	// jaha pivot k left mein sab chote hone chahiye and right mein sab bade hone chahiye.
public class quickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {50,40,80,90,70,10,30,60,120};
		quick(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	static void quick(int[] a,int start,int end)
	{
		if(start >= end)
		{
			return; 	
		}
		int mid = (start+end)/2;
		int pivot = a[mid];
		int left = start;
		int right = end;
		//swapping pivot at right position
		while(left <= right)
		{
			//move left index
			while(a[left] < pivot)
			{
				left++;
			}
			//move right index
			while(a[right] > pivot)
			{
				right--;
			}
			if(left <= right)
			{
				//swapping
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
				}
			//code 
			quick(a,left,end);
			quick(a,start,right);
		}
	}

}
