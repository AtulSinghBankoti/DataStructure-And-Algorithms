package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	
	 public int[] twoSum(int[] nums, int target) {
	     
	     Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		 int []res =  new int[2];
	     
	     for(int i=0; i<nums.length; i++) {
	    	 int num2 = target-nums[i];
	    	 if(map.containsKey(num2)) {
	    		 res[0]=map.get(num2);
	    		 res[1]=i;
	    		 return res;
	    	 }else {
	    		 int num1= nums[i];
	    		 map.put(num1, i);
	    	 }
	     }
	     
		 
		 return res;
	    }

	public static void main(String[] args) {
		
	 	int []nums = {2,7,11,15};
	 	int target = 9;
	 	System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));
	}

}
