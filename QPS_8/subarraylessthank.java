package QPS_8;
//https://leetcode.com/problems/subarray-product-less-than-k/
public class subarraylessthank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {10,5,2,6},k=100;
//		int nums[] = {1,2,3},k=0;
		System.out.println(sum(nums,k));
	}
	static int sum(int[] nums,int k) {
		 int pro = 1;
	        int start=0;
	        int end=0;
	        int ans=0;
	        while(start<nums.length)
	        {
	            pro=Math.max(pro,1);
	            end=Math.max(start,end);
	           if(end<nums.length&&pro*nums[end]<k){
	            pro*=nums[end];
	            end++;
	            ans=ans+(end-start);
	            
	           } 
	            else{
	                pro/=nums[start];
	                start++;
	            }
	        }
	        return ans;
	    }
	}
