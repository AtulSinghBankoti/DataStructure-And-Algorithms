package leetcode;

public class SearchA2dMatrix {

	public boolean searchMatrix(int[][] matrix, int target) {
	
		int low=0;
		int high=(matrix.length*matrix[0].length)-1;
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			int row=mid/matrix[0].length;
			int col=mid%matrix[0].length;		
			if(matrix[row][col]==target) {
				return true;
			}else if(target>matrix[row][col]) {
				low=mid+1;
			}else {
				high=mid-1;
			}
			
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
		//int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		//int target = 3
		
		int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 13;
		System.out.println(new SearchA2dMatrix().searchMatrix(matrix, target));
	}

}
