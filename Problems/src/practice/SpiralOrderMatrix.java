package practice;

import java.util.Arrays;

public class SpiralOrderMatrix {

	 public int[][] generateMatrix(int n) {
		 boolean flag= true;
		 
		 int [][] res =new int[n][n];
		 
		 int row=0;
		 int col=0;
		 
		 
		
		 int counter=0;
		 
		 while(flag) {
			
			 int r=row;
			 int c=col;
			 for(int i=c; i<n; i++) {
				 if(res[r][i]==0) {
					 res[r][c++]=++counter;
				 }
			 }
			 
			/*
			 * System.out.println("right>>"); for(int i=0; i<res.length; i++) {
			 * System.out.println(Arrays.toString(res[i]));
			 * 
			 * }
			 */
			 
			 c--;r++;
			 for(int i=r; i<n; i++) {
				 if(res[i][c]==0) {
					 res[r++][c]=++counter;
				 }
			 }
			 
			 
			 
			/*
			 * System.out.println("down>>"); for(int i=0; i<res.length; i++) {
			 * System.out.println(Arrays.toString(res[i]));
			 * 
			 * }
			 */
			 System.out.println("c:>"+c);
			 System.out.println("r:>"+r);
			 c--; r--;
			 for(int i=c; i>=0;i--) {
				 if(r<res.length && res[r][i]==0) {
					 res[r][c--]=++counter;
				 }
			 }
			
			 
			/*
			 * System.out.println("left>>"); for(int i=0; i<res.length; i++) {
			 * System.out.println(Arrays.toString(res[i]));
			 * 
			 * }
			 */
			 
			 
			 c++;
			 r--;
			 System.out.println("c:>"+c);
			 System.out.println("r:>"+r);
			 for(int i=r; i>=0;i--) {
				 if(r<res.length && res[i][c]==0) {
					 res[r--][c]=++counter;
					 break;
				 }
			 }
			 
			 
			/*
			 * System.out.println("up>>"); for(int i=0; i<res.length; i++) {
			 * System.out.println(Arrays.toString(res[i]));
			 * 
			 * }
			 */
			 
			 
			 ++row;++col;
			 if(row<res.length && col<res.length &&  res[++row][++col]!=0) {
				 flag=false;
			 }
			 
			 
			 
			 
		 }
		 
		/*
		 * int [][] res =new int[n][n];
		 * 
		 * int counter=1;
		 * 
		 * int r=0; int c=0; while(flag) {
		 * 
		 * 
		 * for(int i=r; i<res.length ;i++ ) { if(res[i][c]==0) { res[i][c++]=counter++;
		 * }else { r++; c--; break; } }
		 * 
		 * 
		 * for(int i=r; i<res.length; i++) { if(res[i++][c]==0) { res[i][c]=counter++;
		 * }else { r--; c--; break; } }
		 * 
		 * 
		 * for(int i=r; i<res.length; i++) { if(res[i++][c]==0) { res[i++][c]=counter++;
		 * }else { i--; c--; break; } }
		 * 
		 * for(int i=r; i>res.length; i++) { if(res[i++][c]==0) { res[i++][c]=counter++;
		 * }else { i--; c--; break; } }
		 * 
		 * }
		 */
		 
		 
		 return res;
	   }
	
	
	
	public static void main(String[] args) {
		SpiralOrderMatrix matrix= new SpiralOrderMatrix();
		int[][] res = matrix.generateMatrix(1);
		
		for(int i=0; i<res.length; i++) {
			System.out.println(Arrays.toString(res[i]));
			
		}
		

	}

}
