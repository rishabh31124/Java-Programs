package lecture32;

import java.util.ArrayList;

import java.util.List;

public class permutationArrayLeetCode2 {
	//https://leetcode.com/problems/permutations/submissions/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,1,3};
		List<List<Integer>> list = new ArrayList<>();
		permutation(ar,new boolean[ar.length],new ArrayList<>(),list );
		System.out.println(list);
	}
	static void permutation(int[] ar,boolean[] pick,ArrayList<Integer> ans,List<List<Integer>> list)
	{
		if(ar.length == ans.size())
		{
			list.add(new ArrayList<>(ans));
		}
		
		for(int i = 0; i < ar.length;i++)
		{
			if(i > 0 && ar[i] == ar[i-1] && pick[i-1] == false)// very important condition
			{
				continue;
			}

			if(pick[i] == false)
			{
				
				pick[i] = true;// backtracking
				ans.add(ar[i]);// ans backtracking
				permutation(ar,pick,ans,list);
				ans.remove(ans.size()-1);// ans backtracking
				pick[i] = false;// backtracking
			}
		}
		
	}

}
