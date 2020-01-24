package practice;

/*
 * link: https://leetcode.com/problems/sort-array-by-parity/
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayByParity {


	public int[] sortArrayByParity(int[] A) {
		
		List<Integer> list=new ArrayList<>();
		int output[]=new int[A.length];
		int p=0;
		
		for(int e:A) {
			if(e%2==0) {
				output[p]=e;
				p++;
			}else {
				list.add(e);
			}
		}
		
		for(int e:list) {
			output[p]=e;
			p++;
		}
		return output;
	}


	public static void main(String[] args) {
		
		int[] input= {3,1,2,4};
		SortArrayByParity sortArrayByParity = new SortArrayByParity();
		int []res= sortArrayByParity.sortArrayByParity(input);
		System.out.println(Arrays.toString(res));

	}

}
