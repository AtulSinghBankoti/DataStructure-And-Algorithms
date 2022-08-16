package gfg.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthElementInMatrix {
	
	public static int kthSmallest(int[][]mat,int n,int k)
	{
		 PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	
		 	
	        int c=0;
	        int arr[] = new int[n];
	        for(int i=0; i<n; i++) {
	        	if(i<k) {
	        		pq.add(mat[i][0]);
	        		c++;
	        		arr[i]=1;
	        	}
	        }
	        

	        while(c<k) {
	        	for(int i=0; i<n; i++) {
	        	    if(arr[i]<n){
	        	    	boolean bigFlag = true;
	        		   for(int j=0; j<n; j++) {
	        			   if(arr[j]<n && mat[i][arr[i]] > mat[j][arr[j]]) {
	        				   bigFlag = false;
	        				   break;
	        			   }
	        		   }
	        		   if(bigFlag) {
	        			   pq.add(mat[i][arr[i]]);
	        			   arr[i] = arr[i]+1;
	        			   c++;
	        		   }
	        	    }
	        	    if(!(c<k)) {
	        	    	break;
	        	    }
	        	}
	        }
	        
	        return pq.poll();
    }

	public static void main(String[] args) {
		int N = 5;
		int	mat[][] =  { {9, 12, 20 ,25, 35}, {15, 17, 23, 28, 45}, {21, 31, 38, 40, 51}, {28, 41, 47, 52, 62}, {38, 43, 48, 56, 65}};
		int K = 23;
		System.out.println(KthElementInMatrix.kthSmallest(mat, N, K));
	}

}
