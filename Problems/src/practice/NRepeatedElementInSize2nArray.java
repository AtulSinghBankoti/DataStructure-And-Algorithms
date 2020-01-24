package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * link: https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 * 
 */



public class NRepeatedElementInSize2nArray {

	public int repeatedNTimes(int[] A) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for(int e:A) {
			if(map.containsKey(e)) {
				map.put(e, map.get(e)+1);
			}else {
				map.put(e, 1);
			}
		}

		int max=-1;
		int key=-1;
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			if(entry.getValue()>max) {
				max=entry.getValue();
				key=entry.getKey();
			}
		}


		return key;
	}
	 
	
	 public static void main(String[] args) {
		 int input[] = {1,2,3,3};
		 NRepeatedElementInSize2nArray inSize2nArray=new NRepeatedElementInSize2nArray();
		 int res= inSize2nArray.repeatedNTimes(input);
		 System.out.println(res);
	 }

}
