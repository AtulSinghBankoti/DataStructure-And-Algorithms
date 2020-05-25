package leetcode;

import java.util.Arrays;

public class ArrayMaxConsecutiveSum {

	int arrayMaxConsecutiveSum2(int[] inputArray) {

	    if(inputArray.length==0)return 0;
	    int sum[] = new int[inputArray.length];
	    sum[0]=inputArray[0];
	    int res=inputArray[0];
	    for(int i=1; i<inputArray.length; i++){
	        int s=sum[i-1]+inputArray[i];
	        if (s > inputArray[i]){
	            sum[i]=s;
	        }else {
	        	sum[i]=inputArray[i];
	        }
	        if(sum[i]>res){
                res=sum[i];
            }

	    }

	    return res;
	}

	
	public static void main(String[] args) {
		System.out.println(new ArrayMaxConsecutiveSum().arrayMaxConsecutiveSum2(new int[]{1, -2, 3, -4, 5, -3, 2, 2, 2}));
		System.out.println(new ArrayMaxConsecutiveSum().arrayMaxConsecutiveSum2(new int[]{11, -2, 1, -4, 5, -3, 2, 2, 2}));
	}

}
