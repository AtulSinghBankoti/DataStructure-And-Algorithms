package gfg.heap;

import java.util.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthElementInMatrix2 {

	public static int kthSmallest(int[][]mat,int n,int k)
	{
		 List<Integer> list = new ArrayList<>();
		 for(int i=0; i<n; i++) {
			 for(int j=0; j<j; j++) {
				list.add(mat[i][j]); 
			 }
		 }
		 
		Collections.sort(list);
		
		return list.get(k-1);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
