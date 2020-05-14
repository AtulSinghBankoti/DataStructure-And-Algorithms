package leetcode;

import java.util.Arrays;

public class Shortest_Unsorted_Continuous_Subarray {
	
	
	public int findUnsortedSubarray(int[] nums) {
		
		int temp[]= nums.clone();
		Arrays.sort(temp);
		int start=0;
		int end=nums.length-1;
		
		
		while(start<end && nums[start]==temp[start])start++;
	
		while(start<end && nums[end]==temp[end])end--;
		return (start==end)?0:end-start+1;
    }
	
	public static void main(String[] args) {
		System.out.println(new Shortest_Unsorted_Continuous_Subarray().findUnsortedSubarray(
				new int[] {1,2,3,4}));
	}
}
