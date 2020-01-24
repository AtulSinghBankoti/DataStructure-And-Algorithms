package practice;

import java.util.Arrays;
import java.util.Collections;

/*
 * 
 * Complaxity O(m*n) where m & n is length of two strings
 * Space 
 * 	Tablular Method: O(m*n)
 *  Recursive Method: O(m*n) + O(m+n)stack space
 */

public class LongestCommonSubsequence {

	
	int lengthOfLCS(String s1, String s2) {

		int table[][] = new int[s1.length()+1][s2.length()+1];

		for(int i=0; i<s1.length(); i++) {
			table[i][0]=0;
		}

		for(int i=0; i<s2.length(); i++) {
			table[0][i]=0;
		}

		for(int i=1; i<table.length;i++) {
			for(int j=1; j<table[0].length; j++) {
				if(s1.charAt(i-1)== s2.charAt(j-1)) {
					table[i][j]=table[i-1][j-1]+1;
				}else {
					table[i][j]=Collections.max(Arrays.asList(table[i][j-1],table[i-1][j]));
				}
			}
		}

		/*
		 * for(int i=0;i<table.length;i++) {
		 * System.out.println(Arrays.toString(table[i])); }
		 */		
		return table[s1.length()][s2.length()];
	}

	
	int lengthOfLCS(String s1, int s1p, String s2, int s2p) {
		
		//base condition
		if(s1p<0 || s2p<0) {
			return 0;
		}else if(s1.charAt(s1p) == s2.charAt(s2p)) {
			return 1+lengthOfLCS(s1, s1p-1, s2, s2p-1);
		}else {
			return Collections.max(Arrays.asList(lengthOfLCS(s1, s1p-1, s2, s2p),lengthOfLCS(s1, s1p, s2, s2p-1))); 
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		String s1 ="ABCBDAB";
		String s2 ="BDCABA";
		
		LongestCommonSubsequence subsequence = new LongestCommonSubsequence();
		
	 	int result= subsequence.lengthOfLCS(s1, s2);
		System.out.println("result:>"+result);

		result= subsequence.lengthOfLCS(s1,s1.length()-1, s2, s2.length()-1);
		System.out.println("result:>"+result);

	}

}
