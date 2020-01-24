package practice;

/**
 * 
 * 
 * link: https://leetcode.com/problems/maximum-subarray/
 * O(N), O(1)
 */
		
public class MaximumSubarray {
		
	
	public int maxSubArray(int[] nums) {
		 long prevMax = Integer.MIN_VALUE;
			long curMax;
			long  ans = Integer.MIN_VALUE;

			for(int i = 0; i < nums.length; i++) {

				curMax = nums[i];
				curMax = Long.max(curMax, (curMax + prevMax));
				ans = Long.max(ans, curMax);
				prevMax = curMax;

			}
			return (int)ans;
	}


	public static void main(String[] args) {
		System.out.println(new MaximumSubarray().maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));

	}

}
