package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * link : https://leetcode.com/problems/majority-element/
 */

public class Majority_Element {
	public int majorityElement(int[] nums) {
        
		int occur = 0; 
		int e = -1;
		
		Map<Integer, Integer>  map = new HashMap<>();
		
		for (int i=0; i < nums.length; i++) {
			int k=nums[i];
			if(map.containsKey(k)) {
				int v = map.get(k)+1;
				map.put(k, v);
				if(v>occur) {
					occur=v;
					e=k;
				}
			}else {
				map.put(k, 1);
                if(1>occur) {
					occur=1;
					e=k;
				}
			}
		}
		
		return e;
    }	
	
	public static void main(String[] args) {
		System.out.println(new Majority_Element().majorityElement(new int[]{3,2,3}));
	}
	
}
