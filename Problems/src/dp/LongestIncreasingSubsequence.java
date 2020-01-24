package dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	static int[] LISTable ;
	
	public static int findLongestIncreasingSubsequence(int [] A){
		 int i, j, max=0;
		 
		 for(i=0; i<A.length;i++)
			 LISTable[i]=1;
		 
		 for(i=0; i<A.length; i++) {
			 for(j=0; j<i; j++) {
				 if(A[i]>A[j] && LISTable[i]<LISTable[j]+1)
					 LISTable[i]=LISTable[j]+1;
			 }
		 }
		 
		 for(i=0; i<A.length; i++)
			 if(max<LISTable[i])
				 max=LISTable[i];
		 
		 System.out.println(Arrays.toString(LISTable));
		return max;
	 }
	
	public static void main(String[] args) {
		int []A={5,6,2,3,4,1,9,9,8,9,5};
		LISTable = new int[A.length];
		System.out.println(findLongestIncreasingSubsequence(A));
	}

}
