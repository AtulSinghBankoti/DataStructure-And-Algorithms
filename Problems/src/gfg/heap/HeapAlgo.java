package gfg.heap;

import java.util.Arrays;

public class HeapAlgo {

	 //Function to build a Heap from array.
    void buildHeap(int arr[], int n){
       for(int i=(arr.length/2)-1; i>=0; i--) {
    	   heapify(arr, arr.length, i);
       }
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i){
        int p=i;
        int left = 2*i+1;
        int right = 2*i+2;
        
        if(left < n && arr[left]>arr[p]) {
        	p=left;
        }
        
        if(right < n && arr[right]>arr[p]) {
        	p=right;
        }
        
        if(p!=i) {
        	swap(arr,p,i);
        	heapify(arr, n, p);
        }
    }
    
    void swap(int [] arr, int p1, int p2){
    	int temp = arr[p1];
    	arr[p1] =  arr[p2];
    	arr[p2] = temp;
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
    	buildHeap(arr, n);
    	for(int i=n-1; i>0; i--) {
    		swap(arr, 0, i);
    		heapify(arr, i, 0);
    	}
    }
    
    public static void main(String[] args) {
		int input [] = {1,2,3,4,5 }; // ,6,9,44,66,7};
		HeapAlgo ob =new HeapAlgo();
		//ob.buildHeap(input, input.length);
		ob.heapSort(input, input.length);
		System.out.println(Arrays.toString(input));
	}
	
}
