package dp;

public class MaxContiguousSubsequence {

	public static int MaxContiguousSum(int[] A) {
		int maxSum=0;
		
		for(int i=0; i<A.length; i++) {
			int currentSum=0;	
			for(int j=i; j<A.length; j++) {
				currentSum += A[j];
				
				if(currentSum >maxSum) 
					maxSum=currentSum;
			}
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		System.out.println(MaxContiguousSum(new int[] {-2,11,-4,13,-5,2}));
	}

}
