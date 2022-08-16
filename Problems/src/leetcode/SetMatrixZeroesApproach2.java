package leetcode;

import java.util.Arrays;


public class SetMatrixZeroesApproach2 {

	static int initZero=-999;
	static int assignZero=-888;
     public void setZeroes(int[][] matrix) {
    	 
    	 for(int i=0; i<matrix.length; i++) {
 			for(int j=0; j<matrix[i].length; j++) {
 				if(matrix[i][j] ==0) {
 					matrix[i][j] = initZero;
 				}
 			}
 		}
 		
 	    for(int  posR=0; posR<matrix.length; posR++) {
 	    	
 	    	System.out.println("Row:"+posR);
 	    	for(int posC=0; posC<matrix[posR].length; posC++) {
 	    		if( matrix[posR][posC]== initZero) {
 	    			
 	    			fillRowColumnWithZeo(matrix, posR, posC);
 	    			System.out.println(">>>>>>>>>>>>>>>>>");
 	    			for(int i=0; i<matrix.length; i++) {
 	    				System.out.println(Arrays.toString(matrix[i]));
 	    			}
 	    		}
 	    	}
 	    }
 	    
 	    
 	    //System.out.println(">>>>>>>>>>>>>>>>>");
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if(matrix[i][j] ==initZero || matrix[i][j] ==assignZero) {
					matrix[i][j] = 0;
				}
			}
		}
 		
 	  }
		
		
	  private void fillRowColumnWithZeo(int[][] matrix, int posRow, int posCol) {
		  
			    
			
			  //fill right
			  for(int i=posCol+1; i<matrix[posRow].length; i++) {
				  
                    if(matrix[posRow][i] != initZero ) {
						matrix[posRow][i] = assignZero;
				  	}
			 }
			  
			  
			//fill left
				for(int i=posCol-1; i>=0; i--) {
					  if( matrix[posRow][i] != initZero ) {
							matrix[posRow][i] = assignZero;
					  }
				} 
				
				
			

			

				//fill top
				for(int i=posRow-1; i>=0; i--) {
					 if( matrix[i][posCol] != initZero) {
							matrix[i][posCol] = assignZero;
					  	}
				}
				
				
				
				//fill bottom
				for(int i=posRow+1; i<matrix.length; i++) {
					 if( matrix[i][posCol] != initZero) {
							matrix[i][posCol] = assignZero;
					  	}
				}

				matrix[posRow][posCol] =assignZero;	
		 
	 }


	
	public static void main(String[] args) {
		//int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
				//new SetMatrixZeroes().setZeroes(matrix);
				
		//int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		
		//nt [][] matrix= {{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}};
		
		int [][] matrix = {{8,3,6,9,7,8,0,6},{0,3,7,0,0,4,3,8},{5,3,6,7,1,6,2,6},{8,7,2,5,0,6,4,0},{0,2,9,9,3,9,7,3}};
				
		for(int i=0; i<matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		new SetMatrixZeroesApproach2().setZeroes(matrix);
		System.out.println("::::::::::::::::::::::::::::");
		for(int i=0; i<matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

	}

}
