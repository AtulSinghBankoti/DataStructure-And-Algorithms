package gfg.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumCostOfRopes {

	 long minCost(long arr[], int n) {
	     
		 PriorityQueue<Long> minHeap = new PriorityQueue<Long>();
		  long res = 0;
		 
		 for(int i=0; i < arr.length; i++) {
			 minHeap.add(arr[i]);
		 }
		 
		 System.out.println(Arrays.toString(minHeap.toArray()));
		 while(minHeap.size()>1) {
			 System.out.println(":::::::::::::::::");
			 long e1 = minHeap.poll();
			 System.out.println("e1>"+e1);
			 long e2 = minHeap.poll();
			 System.out.println("e2>"+e2);
			 long sum = e1+e2;
			 res+=sum;
			 minHeap.add(sum);
			 System.out.println("sum:::"+sum);
			 System.out.println("res:::"+res);
			 System.out.println(Arrays.toString(minHeap.toArray()));
		 }
		 
	   
		 return res;
	 }
	
	public static void main(String[] args) {
		  // int  n = 5;
		  // long [] arr = {4, 2, 7, 6, 9};
		//  System.out.println(new MinimumCostOfRopes().minCost(arr, n));		
		   
		   int n = 4;
		   long [] arr = {4, 3, 2, 6};
		   System.out.println(new MinimumCostOfRopes().minCost(arr, n));
	}

}
