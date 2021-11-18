package lecture31;
//https://leetcode.com/problems/sequential-digits/

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class sequentialDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 9;i++)
		{
			dig(i,1000,13000,list);
		}
		Collections.sort(list);
		System.out.println(list);
	}
	static void dig(int cur,int low,int high,ArrayList<Integer> list)
	{
		if(cur>=low && cur<=high)
		{
//			System.out.println(cur);
			list.add(cur);
		}
		int digit = cur%10;
		if(cur > high || digit == 9)
		{
			return;
		}
		dig(cur*10+digit+1,low,high,list);
	}

}
