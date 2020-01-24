package dp;

public class LongestPalindromeSubsequence {

	public static int longestPalindromeSubsequence(int[] A) {
		int max=1, n=A.length, i, k;
		
		int [][]L = new int[n][n];
		
		for (i=1; i<n-1; i++) {
			L[i][i]=1;
			if(A[i]==A[i+1]) {
				L[i][i+1]=1;
				max=2;
			}else {
				L[i][i+1]=0;
			}
		}
		
		for(k=3;k<n;k++) {
			for(i=1;i<n-k+1;i++) {
				int j=i+k-1;
				if(A[i]==A[j]) {
					L[i][j]=L[i+1][j-1]+2;
					max=k;
				}else {
					L[i][j]=Integer.max(L[i+1][j],L[i][j-1]);
				}
			}
		}
		
		
		return max;
	}
	
	
	public static void main(String[] args) {
		System.out.println(longestPalindromeSubsequence(new int [] {'A','G','C','T','C','B','M','A','A','C','T','G','G','A','M'}));
	}

}
