package dsAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueenBacktrackingDemo {

	boolean setNQueen(int mat[][],int row){
		if(row>=mat.length){
			return true;
		}
		for(int i=0;i<mat.length;i++){
			if(isSafe(mat, row, i)){
				mat[row][i]=1;
				if(setNQueen(mat, row+1)){
					return true;
				}
			}
			mat[row][i]=0;
		}
		return false;
	}
	
	boolean isSafe(int mat[][],int row,int col){
		for(int i=0;i<mat.length;i++){
			if(mat[row][i]==1){
				return false;
			}
		}
		
		for(int i=0;i<mat.length;i++){
			if(mat[i][col]==1){
				return false;
			}
		}
		
		List<Queen> list=new ArrayList<>();
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat.length;j++){
				if(mat[i][j]==1){
					list.add(new Queen(i,j,i-j));
				}
			}
		}
		
		int dif=row-col;
		for(Queen q:list)
			if(q.getDif()==dif)
				return false;
		
		return true;
	}
	
	
	public static void main(String[] args) {
		int [][]mat=new int[5][5];
		new NQueenBacktrackingDemo().setNQueen(mat, 0);
		for(int ar[]:mat){
			System.out.println(Arrays.toString(ar));
		}
	}

}

class Queen{
	private int row;
	private int col;
	private int dif;
	
	
	
	public Queen(int row, int col,int dif) {
		this.row = row;
		this.col = col;
		this.dif = dif;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int getDif() {
		return dif;
	}
	public void setDif() {
		this.dif = row-col;
	}
}

