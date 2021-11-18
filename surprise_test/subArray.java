package surprise_test;

public class subArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int nums[] = {-1,2,-1,-3},k=0;
		int nums[] = {1,2,-3},k=0;
		System.out.println(sum(nums,k));
	}
	static int sum(int[] nums,int k) {
		 int pro = 0;
	        int start=0;
	        int end=0;
	        int ans=0;
	        while(start<nums.length)
	        {
//	            pro=Math.max(pro,1);
//	            end=Math.max(start,end);
	           if(end<nums.length){
	            pro+=nums[end];
//	            end++;
	            if(pro!=0) {
	            	end=end+1;
	            	ans=ans+(end-start);
	            }
	            else {
	            	end++;
	            }
	            	
	            
	           } 
	            else{
	                pro-=nums[start];
	                start++;
	            }
	        }
	        return ans;
	    }
}
