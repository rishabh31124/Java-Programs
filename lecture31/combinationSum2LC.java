package lecture31;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/combination-sum-ii/

public class combinationSum2LC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,1,2,7,6,1,5};
		Arrays.sort(a);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		sum(a,8,0,new ArrayList<>(),list);
		System.out.println(list);
	}
	static void sum(int[] a,int tar,int in,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> list)
	{
		//-ve bc
		if(tar < 0)
		{
			return;
		}
		//+ve bc
		if(tar == 0)
		{
			list.add(new ArrayList<>(ans));
			return;
		}
		// code
		sum(a,tar-a[in],in+1,ans,list);
		sum(a,tar,in+1,ans,list);
	}

}
