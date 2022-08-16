package gfg.heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArrays {
	
	public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) {
			
		ArrayList<Integer> res = new ArrayList<Integer>();
		int[] tarr = new int[K];
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0; i<K; i++) {
			pq.add(arr[i][0]);
			ArrayList<Integer> t = new ArrayList<Integer>();
			tarr[i] = 0;
		}
			
		while(!pq.isEmpty()) {
			int min = pq.poll();
			res.add(min);
			boolean flag=true;
			for(int i=0;i <K; i++) {
				if(tarr[i]<arr[i].length) {
					flag=false;
					if(arr[i][tarr[i]] == min) {
						tarr[i]=tarr[i]+1;
						if(tarr[i]<arr[i].length) {
							pq.add((arr[i][tarr[i]]));	
						}
						break;
					}
					
				}
				
			}
			
			if(flag) {
				break;
			}
			
		}
	     
        return res;     
    }

	public static void main(String[] args) {
		 //int K = 3;
		//int	arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		//System.out.println(MergeKSortedArrays.mergeKArrays(arr, K));
		
		int K = 4;
		int	arr[][]={{1,2,3,4},{2,2,3,4},
				         {5,5,6,6},{7,8,9,9}};
		System.out.println(MergeKSortedArrays.mergeKArrays(arr, K));
	}

}
