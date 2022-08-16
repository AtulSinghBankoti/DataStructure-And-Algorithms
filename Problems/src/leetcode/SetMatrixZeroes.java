package leetcode;

import java.util.Arrays;

public class SetMatrixZeroes {
	
	public void setZeroes(int[][] matrix) {
		
		int[][] tempMat = new int[matrix.length][matrix[0].length]; 
		
	    for(int  posR=0; posR<matrix.length; posR++) {
	    	
	    	for(int posC=0; posC<matrix[posR].length; posC++) {
	    		if(matrix[posR][posC] == 0 && tempMat[posR][posC]==0) {
	    			
	    			fillRowColumnWithZeo(matrix,tempMat, posR, posC);
	    			tempMat[posR][posC]=1;
	    		}
	    	}
	    }
		
	  }

	private void fillRowColumnWithZeo(int[][] matrix, int [][]tempMat, int posRow, int posCol) {
		
		//fill right
		for(int i=posCol+1; i<matrix[posRow].length; i++) {
			if(matrix[posRow][i] != 0) {
				matrix[posRow][i] = 0;
				tempMat[posRow][i]=1;
			}
		}
		
		//fill left
		for(int i=posCol-1; i>=0; i--) {
			if(matrix[posRow][i] != 0) {
				matrix[posRow][i] = 0;
				tempMat[posRow][i]=1;
			}
		}
		
		//fill top
		for(int i=posRow-1; i>=0; i--) {
			if(matrix[i][posCol] != 0) {
				matrix[i][posCol] = 0;
				tempMat[i][posCol]=1;
			}
		}
		
		
		//fill bottom
		for(int i=posRow+1; i<matrix.length; i++) {
			if(matrix[i][posCol] != 0) {
				matrix[i][posCol] = 0;
				tempMat[i][posCol]=1;
			}
		}
		
	}

	public static void main(String[] args) {
		
		//int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
		//new SetMatrixZeroes().setZeroes(matrix);
		
		int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		new SetMatrixZeroes().setZeroes(matrix);
		for(int i=0; i<matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		
	}

}
