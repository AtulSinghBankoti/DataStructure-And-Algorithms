package leetcode;

import java.util.Arrays;

public class Move_Zeroes {
	public void moveZeroes(int[] nums) {
		int zeroCount=0;
		boolean flag = true;
		for(int i=1; i<nums.length; i++) {
			if(nums[i-1]==0) {
				int p=i;
				while(p>0 && nums[p-1]==0 && nums[p]!=0) {
					nums[p-1]=nums[p];
					nums[p]=0;
					p--;
				}
			}
		}
		
		System.out.println(Arrays.toString(nums));
    }
	
	
	public static void main(String[] args) {
		new Move_Zeroes().moveZeroes(new int[] {0,1,0,3,12});
	}
	
}
