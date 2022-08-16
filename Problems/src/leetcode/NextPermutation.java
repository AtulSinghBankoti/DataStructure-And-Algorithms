package leetcode;

import java.util.Arrays;

public class NextPermutation {

	 public void nextPermutation(int[] nums) {
		 int startPosition= nums.length-1;
		 for(int pos = nums.length-1; pos>0; pos--) {
			 if(nums[pos] > nums[pos-1]) {
				 break;
			 }
			 startPosition--;
		 }
		 
		 if(startPosition!=0) {
			startPosition = startPosition-1;
		 for(int pos = nums.length-1; pos>0; pos--) {
			 if(nums[pos] > nums[startPosition]) {
			  swap(nums, pos, startPosition);
			  break;
			 }
		 }
		 startPosition++;
		 }
		 

		 for(int pos=nums.length-1; ; pos--) {
			 
			 if(startPosition>=pos) {
				 break;
			 }
			 
			 swap(nums, startPosition, pos);
			 startPosition++;
		 }
	
	 }
	
	 
	 void swap(int [] nums, int p1, int p2) {
		 int tmp = nums[p1];
		 nums[p1] = nums[p2];
		 nums[p2] = tmp;
	 }
	 
	 
	public static void main(String[] args) {
		//int[] input = {1,3,2};

		int [] input = {1,2,3};
		
		//int [] input = {3,2,1};
		new NextPermutation().nextPermutation(input);
		System.out.println(Arrays.toString(input));
	}

}
