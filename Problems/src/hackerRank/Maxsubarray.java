package hackerRank;

import java.util.Arrays;

/*
 * https://www.hackerrank.com/challenges/maxsubarray/problem
 * complexity: O(n^2)
 */

public class Maxsubarray {

	static int[] maxSubarray(int[] arr) {

		int maxSubSeqSum = 0;
		int max = Integer.MIN_VALUE;
		int maxSubarraySum = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {		
			if(arr[i]>0) maxSubSeqSum += arr[i];
			if(arr[i] > max) max= arr[i];
			int tempSum = 0 ;
			for(int j=i; j<arr.length; j++) {
				tempSum=tempSum+arr[j];
				if(tempSum > maxSubarraySum) maxSubarraySum = tempSum;
			}
		}

		if(maxSubSeqSum == 0)	maxSubSeqSum = max;
		return new int[] {maxSubarraySum, maxSubSeqSum};
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(maxSubarray(new int[] {1, -1, -1, -1, -1, 5})));
	}

}
