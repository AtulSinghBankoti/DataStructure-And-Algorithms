package gfg.heap;

import java.util.Arrays;

public class KLargestElement {
	
   int[] kLargest(int[] arr, int n, int k) {
	
	   int [] res = new int[k];
	   for(int i=0; i<k; i++) {
		   res[i] = arr[i];
	   }
	   
	   for(int j=k/2-1; j>=0; j--) {
		   minhipyfy(res, k, j);   
	   }
	   
	   System.out.println("Res hipyfy:>"+Arrays.toString(res));
	   for(int p=k; p<arr.length; p++) {
		   if(arr[p] > res[0]) {
			   res[0]=arr[p];
			   minhipyfy(res, k, 0);
			   System.out.println("Res"+arr[p]+":>"+Arrays.toString(res));
			   
		   }
	   }
	   
	  
	  Arrays.sort(res);
	   
	   int[] rest = new int[k];
	   
	   int j=res.length-1;
	   for(int i=0; i<res.length; i++ ) {
		   rest[i] = res[j--];
	   }
	   
	   
       return rest; 
    }
	

	private void minhipyfy(int[] res, int k, int j) {
		
		int min= j;
		int left = 2*j + 1;
		int right = 2*j + 2;
		
		if(left < k && res[left] < res[min]) {
			min = left;
		}
		
		if(right < k && res[right] < res[min]) {
			min = right;
		}
		
		if(j != min) {
			swap(res, j, min);
			minhipyfy(res, k, min);
		}
	}
	
	void swap(int [] arr, int p1, int p2){
    	int temp = arr[p1];
    	arr[p1] =  arr[p2];
    	arr[p2] = temp;
    }




	public static void main(String[] args) {
		//int[] input = {1,2,3,4,5};
		//System.out.println(Arrays.toString(new KLargestElement().kLargest(input, 5, 3)));

		//int[] input= {12, 5, 787, 1, 23};
		//System.out.println(Arrays.toString(new KLargestElement().kLargest(input, 5, 2)));
		
		int[] input = {1, 23, 12, 9, 30, 2, 50};
		System.out.println(Arrays.toString(new KLargestElement().kLargest(input, 7, 3)));
		
	}

}
