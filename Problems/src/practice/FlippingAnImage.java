package practice;

import java.util.Arrays;

/*
 * link: https://leetcode.com/problems/flipping-an-image/
 * 
 */


public class FlippingAnImage {

	public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0; i<A.length; i++){
            for(int j=0,k=A.length-1; j<A.length/2; j++, k--){
                int t=A[i][j];
            	A[i][j]=A[i][k];
            	A[i][k]=t;
            	
            	/*if(j==k) {
            		A[i][j]= (A[i][j]==1)?0:1;
            	}else {
            		A[i][j]= (A[i][j]==1)?0:1;
            		A[i][k]= (A[i][k]==1)?0:1;
            	} */ 	            	
            }
            
            for(int j=0;j<A.length;j++) {
            	A[i][j]= (A[i][j]==1)?0:1;
            }
        }
        return A;
    }
	
	public static void main(String[] args) {
		
		int [][]input= {{1,1,0},{1,0,1},{0,0,0}};
		
		//output:> [[1,0,0],[0,1,0],[1,1,1]]
		FlippingAnImage flippingAnImage =new FlippingAnImage();
		int[][] res= flippingAnImage.flipAndInvertImage(input);
		
		for(int [] r:res) {
			System.out.print(Arrays.toString(r));
			System.out.println();
		}

	}

}
