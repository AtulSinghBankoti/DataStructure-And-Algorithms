package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * 
 * 
 * @author Atul
 *
 *link: https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

	
	public int[] twoSum(int[] nums, int target) {	  
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		int [] output = new int[2] ; 
		for(int i =0; i<list.size(); i++) { 
			int n = list.get(i); 
			int required = target - n; 
			int indx = list.indexOf(required);
			if(list.contains(required) &&  indx != i) { 
				int bIndex = indx; 
				output[0] = i; 
				output[1] = bIndex; 
				break; 
			} 
		}
		return output; 
	}

	public static void main(String[] args) {
		
		int[] nums = new int[] {3,2,4};
		System.out.println(Arrays.toString(new TwoSum().twoSum(nums, 6)));
	}

}
