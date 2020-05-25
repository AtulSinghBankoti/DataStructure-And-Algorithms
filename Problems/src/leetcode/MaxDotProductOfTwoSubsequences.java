package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class MaxDotProductOfTwoSubsequences {

	public int maxDotProduct(int[] nums1, int[] nums2) {
		int [][] memo = new int[nums1.length+1][nums2.length+1];
	
		System.out.println(memo.length);
		System.out.println(memo[0].length);
		for(int i=0; i<memo.length; i++) {
			memo[i][0]=-1007;
		}
		
		for(int i=0; i<memo[0].length; i++) {
			memo[0][i]=-1007;
		}
		
		for(int i=0; i<memo.length; i++) {
			System.out.println(Arrays.toString(memo[i]));
		}
		
		System.out.println(":::::::::::::::");
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		
		System.out.println(":::::::::::::::");
		for(int i=1; i<memo.length; i++) {
			for(int j=1; j<memo[0].length; j++) {
				int p =nums1[i-1]*nums2[j-1];
				
				int m= Collections.max(Arrays.asList(
						new Integer(memo[i-1][j-1]),
						new Integer(memo[i][j-1]),
						new Integer(memo[i-1][j])
					));
				
				System.out.println("p>"+p);
				System.out.println("m>"+m);
				
				memo[i][j]=Collections.max(Arrays.asList(memo[i-1][j-1]+p, p, m));
				
			}
		}
	
		
	
		for(int i=0; i<memo.length; i++) {
			System.out.println(Arrays.toString(memo[i]));
		}
		
		System.out.println(":::::::::::::::");
		
		return memo[memo.length-1][memo[0].length-1];
    }
	
	public static void main(String[] args) {
		int nums1 [] = {2,1,-2,5};
		int nums2 [] = {3,0,-6};
		
		System.out.println(new MaxDotProductOfTwoSubsequences().maxDotProduct(nums1, nums2));
		

	}

}
