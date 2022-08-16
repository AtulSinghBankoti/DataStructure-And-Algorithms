package leetcode;

import java.util.*;

public class P4Sum {

	 public List<List<Integer>> fourSum(int[] nums, int target) {
		 List<List<Integer>> res=  new ArrayList<>();
		 
		 Arrays.sort(nums);
		 int length = nums.length;
		 for(int i=0; i< nums.length; i++) {
			 int target3=target-nums[i];
			 for(int j=i+1; j<nums.length; j++) {
				 int target2=target3-nums[j];
				 
				 int left = j+1;
				 int right=nums.length-1;
				 while(left<right) {
					 int two_sum=nums[left]+nums[right];
					 
					 if(two_sum>target) {
						right--; 
					 }else if(two_sum<target) {
						left++;
					 }else {
						List<Integer> list = new ArrayList<Integer>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[left]);
						list.add(nums[right]);
						
						res.add(list);
						
						while(left<right && list.get(2)==nums[left])++left;
						while(left<right && list.get(3)==nums[right])--right;
					 }
				 }
				 
				 while(j+1<length && nums[j]==nums[j+1]) ++j;
			 }
			 while(i+1<length && nums[i]==nums[i+1]) ++i;
		 }
		
		 
			 
		 return res;
	    }
	
	public static void main(String[] args) {
		//[1000000000,1000000000,1000000000,1000000000]
		//-294967296
		System.out.println(Integer.MIN_VALUE);
	}

}
