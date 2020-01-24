package dsAlgo;

import java.util.Arrays;

public class SudokuBacktrackingDemo {

	public static final int  UNASSIGNED=0;
	int findEmptyCell(int mat[][]){
		for(int i=0;i<mat.length;i++)
		 for(int j=0;j<mat.length;j++)
			 if(mat[i][j]==0)
				 return Integer.parseInt(""+i+""+j);
		return -1;	 
	}
	
	boolean isSafe(int mat[][],int i,int j,int n){
		for(int k=0;k<mat.length;k++)
			if(k!=i && mat[k][j]==n)
				return false;
		
		for(int k=0;k<mat.length;k++)
			if(k!=j && mat[i][k]==n)
				return false;
		return true;
	}
	
	boolean solveSudoku(int mat[][]){
		int p=findEmptyCell(mat);
		if(p==-1){
			return true;
		}else{
			int j=p%10;
			int t=p/10;
			int i=t%10;
			for(int n=1;n<=9;n++){
				if(isSafe(mat,i,j,n)){
					mat[i][j]=n;
					if(solveSudoku(mat))
						 return true;
					mat[i][j]=0;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int [][]arr={{0,0,0,0,0,0,5,0,0},
				  	 {3,0,2,0,7,0,9,1,0},
				     {6,0,0,9,0,0,0,0,0},
				     {0,0,0,0,0,0,0,2,6},
				     {0,2,0,3,0,0,1,5,9},
				     {7,9,0,6,0,5,0,8,0},
				     {1,0,9,7,0,0,0,0,0},
				     {4,5,0,0,0,0,2,3,0},
				     {0,3,8,4,5,0,6,0,0},
					};
		new SudokuBacktrackingDemo().solveSudoku(arr);
		for(int ar[]:arr){
			System.out.println(Arrays.toString(ar));
		}
	}

}
