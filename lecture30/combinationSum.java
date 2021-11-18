package lecture30;

import java.util.ArrayList;

import java.util.List;

//https://leetcode.com/problems/combination-sum/
public class combinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,3,6,7};
		List<List<Integer>> list = new ArrayList<>();
		sum(a,7,0,new ArrayList<>(),list);
		System.out.println(list);
	}
	static void sum(int[] a,int tar,int in,ArrayList<Integer> ans,List<List<Integer>> list)
	{
		//+ve bc
		if(tar == 0)
		{
			list.add(new ArrayList<>(ans));
			return;
		}
		//-ve bc
		if(in == a.length || tar < 0)
		{
			return;
		}
		ans.add(a[in]);// very important
		sum(a,tar-a[in],in,ans,list);//in
		ans.remove(ans.size()-1);//backtrack
		sum(a,tar,in+1,ans,list);//ex
	}

}
