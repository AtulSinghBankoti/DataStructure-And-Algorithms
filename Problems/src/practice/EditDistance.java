package practice;

import java.util.Arrays;
import java.util.Collections;

/**
 * 
 * @author Atul
 *https://leetcode.com/problems/edit-distance/
 *O(n*m) O(o*m) where n,m is length of word1 & word 2
 */
public class EditDistance {

	
	public int minDistance(String word1, String word2) {

		int [][] table = new int[word1.length()+1][word2.length()+1];
		
		for(int i=0; i<table.length; i++) {
			table[i][0]=i;
		}
		
		for(int i=0; i<table[0].length; i++) {
			table[0][i]=i;
		}
					
		for(int i=1; i<table.length; i++) {
			for(int j=1; j<table[0].length; j++) {
				if(word1.charAt(i-1) == word2.charAt(j-1)) {
					table[i][j] = table[i-1][j-1];
				}else {
					table[i][j] = 1+Collections.min(Arrays.asList(new Integer(table[i][j-1]),
							new Integer(table[i-1][j]),new Integer(table[i-1][j-1])
							));
				}
		
			}
		}	
		
		for(int i=0;i<table.length;i++) {
			System.out.println(Arrays.toString(table[i]));  
			
		}
		return table[word1.length()][word2.length()];
	}

	public int harishApproach(String s1, String s2) {
		
		
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		EditDistance ob = new EditDistance();
		System.out.println("output>"+ob.minDistance("horse", "ros"));
	}

}
