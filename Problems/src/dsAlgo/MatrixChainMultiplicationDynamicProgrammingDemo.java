package dsAlgo;

import java.util.Arrays;

public class MatrixChainMultiplicationDynamicProgrammingDemo {

	
	
	int memoized_matrix_chain(int[][] mat,int []p){
		for(int i=1;i<mat.length;i++)
			for(int j=1;j<mat.length;j++)
				mat[i][j]=Integer.MAX_VALUE;
		return lookup_chain(mat, p, 1, mat.length-1);	
	}
	
	static int s2[][]=new int[5][5];
    int	lookup_chain(int [][] mat,int []p,int i,int j){
    	if(mat[i][j]<Integer.MAX_VALUE)
    		return mat[i][j];
    	else if(i==j)
    		mat[i][j]=0;
    	else
    		for(int k=i;k<j;k++){
    			int c=lookup_chain(mat, p, i, k)
    					+lookup_chain(mat, p, k+1, j)
    					+p[i-1]*p[k]*p[j];
    			if(c<mat[i][j]){
    				mat[i][j]=c;
    				s2[i][j]=k;
    			}	
    		}
    	return mat[i][j];
    }
	
	static int s[][]=new int[5][5];
    int tabulation_matrix_chain(int[][] mat,int []p){
    	for(int i=1;i<mat.length;i++)
			for(int j=1;j<mat.length;j++)
				mat[i][j]=Integer.MAX_VALUE;
    	
    	
    	for(int l=2;l<mat.length;l++)
    		for(int i=1;i<mat.length-l+1;i++){
    			int j=i+l-1;
    			mat[i][j]=Integer.MAX_VALUE;
    			int c=0;
    			for(int k=i;k<=j-1;k++){
    				c=mat[i][k]+mat[k+1][j]+p[i-1]*p[k]*p[j];
    				if(c<mat[i][j]){
    					mat[i][j]=c;
    					s[i][j]=k;
    				}
    			}
    		}	
		return mat[1][mat.length-1];
    }
    
    
	public static void main(String[] args) {
		int p[]={1,2,1,4,1};	
		int mat[][]=new int[5][5];
		System.out.println(new MatrixChainMultiplicationDynamicProgrammingDemo().memoized_matrix_chain(mat, p));
		for(int i=1;i<mat.length;i++)
			for(int j=1;j<mat[i].length;j++)
				if(mat[i][j]==Integer.MAX_VALUE)
					mat[i][j]=0;
		for(int arr[]:mat)
			System.out.println(Arrays.toString(arr));
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		
		mat=new int[5][5];
		System.out.println(new MatrixChainMultiplicationDynamicProgrammingDemo().tabulation_matrix_chain(mat, p));
		for(int i=1;i<mat.length;i++)
			for(int j=1;j<mat[i].length;j++)
				if(mat[i][j]==Integer.MAX_VALUE)
					mat[i][j]=0;
		for(int arr[]:mat)
			System.out.println(Arrays.toString(arr));
		System.out.println("tabula:::::::::::::::::::::::::::::::::::::::::::");
		for(int arr[]:s)
			System.out.println(Arrays.toString(arr));
		System.out.println("memoization:::::::::::::::::::::::::::::::::::::::::::");
		for(int arr[]:s2)
			System.out.println(Arrays.toString(arr));
	}

}
