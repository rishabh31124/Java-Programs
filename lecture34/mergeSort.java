package lecture34;
/*                time complexity of merge sort is n* log(n)
 *                no. of levels = log(n) in treee 
 *                each level we have n                        
 *                then n+n+n+n ...... upto log(n) level                       
 *                                       
 *                                       
 *                                       
 *                                       */

import java.util.Arrays;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {9,8,7,6,5,4,3,2,1};
//		int[] a = {5,10,15,20,25,30};
//		int[] b = {2,4,6,8,10,12};
//		System.out.println(Arrays.toString(merge(a,b)));
		System.out.println(Arrays.toString(mergeSort(a,0,a.length-1)));
	}
	static int[] mergeSort(int[] a, int start, int end)
	{
		if(start == end)//base case
		{
			// sp is having one element
			int[] sp = new int[1];
			sp[0] = a[start];
			return sp;
		}
		int mid = (start + end )/2;
		int[] sp1 = mergeSort(a,start,mid);
		int[] sp2 = mergeSort(a,mid+1,end);
		return merge(sp1,sp2);
	}

	static int[] merge(int[] a, int[] b) {
		int c[] = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int p = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[p] = a[i++];
			} else {
				c[p] = b[j++];
			}
			p++;
		}
		if (i < a.length) {
			while (i < a.length) {
				c[p] = a[i++];
				p++;
			}
		} else {
			while (j < b.length) {
				c[p] = b[j++];
				p++;
			}
		}
		return c;
	}

}
