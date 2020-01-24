package practice;

/**
 * 
 * Time Complexity:
 * 	Build Max Heap: O(n)
 * 	 
 * 
 */


import java.util.Arrays;

public class HeapOperationDemo {

	
	void maxhipify(int[] arr, int i, int length) {
		
		int left = i*2;
		int right = (i*2)+1;
		
		int max = i;
		
		if(left < length  && arr[left] > arr[max]) {
			max = left;
		}
		
		if(right < length && arr[right] > arr[max]) {
			max = right;
		}
		
		if(max != i) {
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
			maxhipify(arr, max, length);
		}
	}
	
	void buildMaxHeap(int[] arr) {
		for(int i=arr.length/2; i>=0; i--) {
			maxhipify(arr, i, arr.length);
		}
	}
	
	void heapSort(int[] arr) {
		buildMaxHeap(arr);
		for(int i=arr.length-1; i>=0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			maxhipify(arr, 0, i);
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		
		HeapOperationDemo operationDemo = new HeapOperationDemo();
		
		System.out.println("Input Array:");
		System.out.println(Arrays.toString(arr));
		System.out.println("building max heap...");
		operationDemo.buildMaxHeap(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("applying heap sort...");
		operationDemo.heapSort(arr);
		System.out.println(Arrays.toString(arr));		
	}

}
