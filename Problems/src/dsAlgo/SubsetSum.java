package dsAlgo;

public class SubsetSum {

	public boolean isSubsetSumPossible(int arr[], int sum, int i) {		
		
		//base case
		if(sum==0) {
			return true;
		}else if(i==0 && sum!=0) {
			return false;
		}else {
			
			if(arr[i-1] > sum) {
				return isSubsetSumPossible(arr, sum, i-1);
			}else {
				return isSubsetSumPossible(arr, sum, i-1) || isSubsetSumPossible(arr, sum-arr[i-1], i-1);
			}
			
		}
		
	}
	
	
	//Tabulation Solution
	public boolean isSubsetSumPossibleTabulation(int arr[], int sum, int i) {
		
		boolean[][] table = new boolean[arr.length+1][sum+1];
		
		table[0][0] = true;
		for(int j=1; j <= sum; j++) {
			table[0][j] = false;
		}
		
		for(int j=1; j <= arr.length; j++) {
			table[j][0] = true;
		}
		
		for(int j=1; j<=arr.length; j++) {
			
			for(int k=1; k<=sum; k++) {
				
				if(arr[j-1] > k) {
					table[j][k] = table[j-1][k]; 
				}else {
					table[j][k] = table[j-1][k] || table[j-1][k-arr[j-1]]; 
				}
			}
		}
		
		
		return table[arr.length][sum];
	}
	
	
	public static void main(String[] args) {
		
		boolean output = new SubsetSum().isSubsetSumPossible
				(new int[]{3, 34, 4, 12, 5, 2}, 9, 6);
		System.out.println("isSubsetSumPossible>"+output);
		
		
		output = new SubsetSum().isSubsetSumPossibleTabulation
				(new int[]{3, 34, 4, 12, 5, 2}, 9, 6);
		System.out.println("isSubsetSumPossible Tabulation>"+output);
		
	}

}
