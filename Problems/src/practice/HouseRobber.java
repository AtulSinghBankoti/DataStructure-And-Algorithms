package practice;

/**
 * 
 * @author Atul
 *
 *link: https://leetcode.com/problems/house-robber/
 * O(n),O(1)
 */
public class HouseRobber {

	public int rob(int[] nums) {

		int ppMax = 0;
		int pMax = 0;
		int cMax = 0;

		for(int i = 0; i < nums.length; i++) {		
			cMax = pMax;
			cMax = Integer.max(cMax, nums[i] + ppMax);
			ppMax = pMax;
			pMax = cMax;
		}
		
		return cMax;
	}

	public static void main(String[] args) {
		
		System.out.println(new HouseRobber().rob(new int[] {1,2,3,1}));
	}

}
