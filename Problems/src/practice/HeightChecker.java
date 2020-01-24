package practice;

import java.util.Arrays;
import java.util.Collections;

/*
 * link: https://leetcode.com/problems/height-checker/
 * 
 */
public class HeightChecker {

	public int heightChecker(int[] heights) {
		
		int [] temp =  Arrays.copyOf(heights, heights.length);
		
		Arrays.sort(heights);
		int counter=0;
		for(int i=0; i<heights.length; i++) {
			if(heights[i] != temp[i]) {
				counter++;
			}
		}
		
		return counter;
	}


	public static void main(String[] args) {
		int[] input = {1,1,4,2,1,3};
		
		HeightChecker heightChecker = new HeightChecker();
		System.out.println(heightChecker.heightChecker(input));
		

	}

}
