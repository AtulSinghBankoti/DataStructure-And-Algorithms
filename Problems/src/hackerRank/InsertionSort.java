package hackerRank;

import java.util.Arrays;

public class InsertionSort {

	static void insertionSort2(int n, int[] arr) {
        for(int i=1; i<arr.length; i++){
            
            int p=arr[i];
            int j=i-1;
            
             while(j>=0 && arr[j]>p){       
                arr[j+1]=arr[j];
                j--;
             }
             
             arr[j+1]=p;
        }

    }
	
	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		insertionSort2(arr.length, arr);
		System.out.println("::::::::::::::::::::");
		System.out.println(Arrays.toString(arr));

	}

}
