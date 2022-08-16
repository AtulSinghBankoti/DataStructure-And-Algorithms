package leetcode;

import java.util.Arrays;

public class CountInversions {
	
	private static int divide(long[] arr, int start, int end, long[] tmpArr) {
		
		int res =0;
		if(start<end) {

			int mid=(start+end)/2;
			res+= divide(arr, start, mid, tmpArr);
			res+= divide(arr, mid+1, end, tmpArr);
			res+= mergeSort(arr, start,  mid, end, tmpArr);
		}
		return res;
	}



	private static int mergeSort(long[] arr, int start, int mid, int end, long[] tmpArr) {
		int mergeRes=0;
		
		int r1=start;
		int r2=mid;
		int r3=start;
		while(r1<mid && r2<=end) {
			
			if(arr[r1]<=arr[r2]) {
				tmpArr[r3++]=arr[r1++];
			}else{
				tmpArr[r3++]=arr[r2++];
			    //mergeRes= mergeRes+((mid+1)-r1);
				mergeRes= mergeRes+1;
			}
		}
		
		while(r1<mid) {
			tmpArr[r3++]= arr[r1++];
		}
		
		while(r2<=end) {
			tmpArr[r3++]= arr[r2++];
		}
		
		
		
		for(int i=start; i<=end; i++) {
			arr[i]=tmpArr[i];
		}
		
		return mergeRes;
	}



	public static long getInversions(long arr[], int n) {
	
		long []tmpArr = new  long[arr.length];
		return divide(arr, 0, arr.length-1, tmpArr)+1;
		
	}
	
	public static void main(String[] args) {
		int n=5;
		long [] arr= {2, 5, 1, 3, 4};
		System.out.println(new CountInversions().getInversions(arr,n));
		System.out.println(Arrays.toString(arr));
	}

}
