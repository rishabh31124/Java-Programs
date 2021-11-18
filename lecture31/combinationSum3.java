package lecture31;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combination-sum-iii/
public class combinationSum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = new ArrayList<>();
		sum(7,3,1,new ArrayList<Integer>(),list);
		System.out.println(list);
	}
	static void sum(int n,int k,int cur,List<Integer> ans,List<List<Integer>> list)
	{
		//+ve bc
		if(k == 0 && n ==0)
		{
			list.add(new ArrayList<>(ans));
			return;
		}
		//-ve bc
		
		if(cur > 9 || n < 0)
		{
			return;
		}
		//code
		ans.add(cur);
		sum(n-cur,k-1,cur+1,ans,list);//placed
		ans.remove(ans.size()-1);//backtracking
		sum(n,k,cur+1,ans,list);//not placed
	}

}
