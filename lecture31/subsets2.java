package lecture31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,4,4,1,4};
		Arrays.sort(a);// important
		List<List<Integer>> list = new ArrayList<>();
		sub(a,0,new ArrayList<>(),list,true);
		System.out.println(list);
	}
	static void sub(int[] a, int in, ArrayList<Integer> ans,List<List<Integer>> list,boolean b)
	{
		
		//bc
		if(in == a.length)
		{
			list.add(new ArrayList<>(ans));
			return;
		}
		if(b == false && a[in] == a[in-1])// bc for repeated combinations
		{
			sub(a,in+1,ans,list,false);//not placed
			return;
		}
		//code
		sub(a,in+1,ans,list,false);//not placed
		ans.add(a[in]);
		sub(a,in+1,ans,list,true);//placed
		ans.remove(ans.size()-1);
	}

}
