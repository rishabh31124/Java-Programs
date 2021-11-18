package lecture31;

import java.util.List;
import java.util.ArrayList;

//https://leetcode.com/problems/subsets/
public class subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		List<List<Integer>> list = new ArrayList<>();
		sub(a,0,new ArrayList<>(),list);
		System.out.println(list);
	}
	static void sub(int[] a, int in, ArrayList<Integer> ans,List<List<Integer>> list)
	{
		
		//bc
		if(in == a.length)
		{
			list.add(new ArrayList<>(ans));
			return;
		}
		//code
		sub(a,in+1,ans,list);//not placed
		ans.add(a[in]);
		sub(a,in+1,ans,list);//placed
		ans.remove(ans.size()-1);
	}

}
