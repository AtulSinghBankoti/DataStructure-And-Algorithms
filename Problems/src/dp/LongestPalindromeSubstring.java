package dp;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LongestPalindromeSubstring {

	
	public static int LongestPalindromeSubstring(int[] A) {
		int max=1,n=A.length,i,k;
		
		int[][] L =new int[n][n];
		
		for(i=1; i<n-1; i++) {
			L[i][i]=1;
			if(A[i]==A[i+1]) {
				L[i][i+1]=1;
				max=2;
			}else {
				L[i][i+1]=0;
			}
		}
		
		for(k=3; k<n; k++) {
			for(i=1;i<n-k;i++) {
				int j=i+k-1;
				if(A[i] == A[j] && L[i+1][j-1]==0) {
					L[i][j]=1;
					max=k;
				}
				else L[i][j]=0;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int input[] = {'b','a','b','a','d'};
		System.out.println(LongestPalindromeSubstring(input));	
		
	}

}
