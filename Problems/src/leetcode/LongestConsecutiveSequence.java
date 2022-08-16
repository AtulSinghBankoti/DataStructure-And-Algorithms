package leetcode;

import java.util.Arrays;

public class LongestConsecutiveSequence {

	public int longestConsecutive(int[] nums) {
    
		 Arrays.sort(nums);
			int res=0;
			int tempRes=1;
			
			for(int i=0; i<nums.length-1; i++) {
				if(nums[i] == nums[i+1]) {
					continue;
				}else if(nums[i]+1 == nums[i+1]) {
					tempRes++;
					if(tempRes>res) {
						res=tempRes;
					}
				}else {
					tempRes=1;
				}
			}
			
			
			return res;
    }
	
	public static void main(String[] args) {
		

	}

}
