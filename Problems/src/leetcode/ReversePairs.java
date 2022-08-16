package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversePairs {

	

 private static int divide(int[] arr, int start, int end) {
        
        int res =0;
        if(start>=end) {
        	return 0;
        }	

            int mid=(start+end)/2;
            res+= divide(arr, start, mid);
            res+= divide(arr, mid+1, end);
            res+= mergeSort(arr, start,  mid, end);
       
        return res;
    }



    private static int mergeSort(int[] arr, int start, int mid, int end) {
        int mergeRes=0;
        
        int j=mid+1;
		for(int i=start; i<=mid; i++) {
			while(j<=end && arr[i]>(2*(long)arr[j])) {
				j++;
			}
			mergeRes += (j-(mid+1));
		}
        
        
		 ArrayList<Integer> temp = new ArrayList<>(); 
	        int left = start, right = mid+1; 
	        while(left <= mid && right<=end) {
	            if(arr[left]<=arr[right]) {
	                temp.add(arr[left++]); 
	            }
	            else {
	                temp.add(arr[right++]); 
	            }
	        }
	        
	        while(left<=mid) {
	            temp.add(arr[left++]); 
	        }
	        while(right<=end) {
	            temp.add(arr[right++]); 
	        }
	        
	        for(int i = start; i<=end;i++) {
	            arr[i] = temp.get(i - start); 
	        }
	      
        return mergeRes;
    }

	
	
    public int reversePairs(int[] nums) {
		return divide(nums, 0, nums.length-1);
    }
	public static void main(String[] args) {
		int [] nums = {1,3,2,3,1};
		 int res= new ReversePairs().reversePairs(nums);
		 System.out.println(Arrays.toString(nums));
		 System.out.println(":>>"+res);
	}

}
