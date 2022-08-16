package leetcode;

public class FindTheDuplicateNumber {

	public int findDuplicate(int[] nums) {
		int fast=0;
		int slow=0;
		do {
			fast=nums[nums[fast]];
			slow=nums[slow];
			
		}while(slow!=fast);
		
		fast=0;
		while(slow!= fast) {
			slow=nums[slow];
			fast=nums[fast];
		}

		return slow;
	 }
	
	public static void main(String[] args) {
		//int[] nums = {1,3,4,2,2};
		int[] nums = {3,1,3,4,2};
		System.out.println(new FindTheDuplicateNumber().findDuplicate(nums));
	}

}
