package dsAlgo;

import java.util.Arrays;



public class HepSortDemo {

	static int arr[]={1,2,3,4,5,6,7};
	
	static public void maxHeapify(int []arr,int i,int length){
		int lp=i*2+1;
		int rp=i*2+2;
	
		int largest=i;
		if(lp<length && arr[i]<arr[lp]){
			largest=lp;
		} 
		
		if(rp<length && arr[largest]<arr[rp]){
			largest=rp;
		}
		if(largest!=i){
			int tmp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=tmp;
			maxHeapify(arr, largest,length);
		}
	}

	
	
	static public void buildMaxHeap(){
		for(int i=arr.length/2;i>=0;i--){
		  maxHeapify(arr, i,arr.length);
		}
	}
	
	static public void heapSort(){
		buildMaxHeap();
		for(int i=arr.length-1;i>=0;i--){
			int tmp=arr[0];
			arr[0]=arr[i];
			arr[i]=tmp;
			maxHeapify(arr, 0, i);
		}
	}

	public static void main(String[] args) {
		heapSort();
		for(int i:arr){
			System.out.print(" "+i);
		}
		System.out.println();
	}

}
