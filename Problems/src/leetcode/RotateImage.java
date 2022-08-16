package leetcode;

import java.util.Arrays;

public class RotateImage {
	
	 public void rotate(int[][] matrix) {
	   
		 for(int i=0; i<matrix.length; i++) {
			 for(int j=i; j<matrix.length; j++) {
				 swap(matrix, j,i,i,j);
				 
			 }
		 }
		 
		 for(int i=0; i<matrix.length; i++) {
			 for(int start=0, end=matrix.length-1; start<end; start++,end--) {
				 swap(matrix, i,start,i,end);
			 }
		 }
	        
	        
	   }
	 
	 void swap(int[][] matrix, int r1, int c1, int r2, int c2) {
		 
		 int tmpStore = matrix[r1][c1];
		 matrix[r1][c1] = matrix[r2][c2];
		 matrix[r2][c2] = tmpStore;
	 }

	public static void main(String[] args) {
		int [][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		for(int i=0; i<matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		new RotateImage().rotate(matrix);
		System.out.println("::::::::::::::::::::::");
		for(int i=0; i<matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
	}

}
