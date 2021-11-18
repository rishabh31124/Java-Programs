package lecture31;
//https://leetcode.com/problems/combinations/

import java.util.List;
import java.util.ArrayList;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> list = new ArrayList<>();
		solve(5,2,1,new ArrayList<>(),list);
		System.out.println(list);
	}
	
	static void solve(int n, int k, int cur,List<Integer> ans,List<List<Integer>> list)
	{
		
		if(k==0)
		{
			list.add( new ArrayList<>(ans));
			return;
		}
		if(cur >n)
		{
			return;
		}
		
		ans.add(cur);
		solve(n,k-1,cur+1,ans,list);// placed
		ans.remove(ans.size()-1);//backtracking removing upto lastand add new 
		solve(n,k,cur+1,ans,list);//not placed
	}

}
