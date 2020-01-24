package hackerRank;

import java.util.Arrays;

/*
 * link: https://www.hackerrank.com/challenges/hackerland-radio-transmitters/problem
 */

public class HackerlandRadioTransmitters {

	// Complete the hackerlandRadioTransmitters function below.
    static int hackerlandRadioTransmitters(int[] x, int k) {
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
    	int p=x[0];
    	int res=0;
    	int index=0;
    	while(index < x.length) {
    		res++;
    		int m=x[index]+(k*2);
    		while(++index < x.length && x[index]<=m) {
    			p=x[index];
    		}
    	}
		
    	return res;	
    }
	
	
	public static void main(String[] args) {
		
		//System.out.println(hackerlandRadioTransmitters(new int[]{1,2,3,4,5}, 1));
		//System.out.println(hackerlandRadioTransmitters(new int[]{7,2,4,6,5,9,12,11}, 2));
		System.out.println(hackerlandRadioTransmitters(new int[]{9,5,4,2,6,15,12}, 2));
		
	}

}
