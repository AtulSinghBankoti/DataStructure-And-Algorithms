package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Disappeared_Numbers {
	 
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list =new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			int n=Math.abs(nums[i]);
			if(nums[n-1]>-1) {
				nums[n-1]*=-1;
			}
		}
		
		System.out.println(Arrays.toString(nums));
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>-1) {
				list.add(i+1);
			}
		}
		return list;
	 }
	
	public static void main(String[] args) {
		System.out.println(new Disappeared_Numbers().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
	}
}
