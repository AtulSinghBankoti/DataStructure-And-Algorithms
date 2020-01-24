package practice;

/*
 *link:  https://leetcode.com/problems/longest-increasing-subsequence/
 * 
 */
public class LongestIncreasingSubsequence {

	public int lengthOfLIS(int[] nums) {
		
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			int c = 0;
			int current = i;
			int prev = i;
			for(int j=i+1; j<nums.length; j++) {
				if(nums[j] > nums[current]) {
					prev =current;
					current = j;
					c++;
				}else if(nums[j]>nums[prev]){ 
					current = j;
				}
			}
			if(c > count) {
				count = c;
			}	
		}
		return (nums.length==0)?0:count+1;
	}

	public static void main(String[] args) {
		int [] input2 = new int[] {10,9,2,5,3,4};
		LongestIncreasingSubsequence longestIncreasingSubsequence =new LongestIncreasingSubsequence();
		int result = longestIncreasingSubsequence.lengthOfLIS(input2);
		System.out.println("output:>"+result);
	}

}
