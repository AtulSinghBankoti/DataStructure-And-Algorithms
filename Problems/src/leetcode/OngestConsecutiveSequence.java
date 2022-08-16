package leetcode;

import java.util.HashSet;

public class OngestConsecutiveSequence {

	
	public int longestConsecutive(int[] nums) {
		int res=0;
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int e:nums) {
			set.add(e);
		}
		
		for(int i=0; i<nums.length; i++) {
			if(set.contains(nums[i]-1)) {
				continue;
			}else {
				int count=1;
				int e=nums[i]+1;
				while(set.contains(e)) {
					e=e+1;
					count++;
				}
				if(count>res) {
					res=count;
				}
			}
		}
		
		
		return res;
	}
	
	public static void main(String[] args) {
		int [] nums = {100,4,200,1,3,2};
		System.out.println(new OngestConsecutiveSequence().longestConsecutive(nums));
	}

}
