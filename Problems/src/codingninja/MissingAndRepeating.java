package codingninja;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingAndRepeating {

	public static int[] missingAndRepeating(ArrayList<Integer> arr, int n)     {
		/*
		int fast=0;
		int slow=0;
		do {
			fast=arr.get(arr.get(fast));// nums[nums[fast]];
			slow=arr.get(slow);// nums[slow];
			
		}while(slow!=fast);
		
		fast=0;
		while(slow!= fast) {
			slow=arr.get(slow);// nums[slow];
			fast=arr.get(fast);// nums[fast];
		}

		int [] res= new int[2];
	    res[1]=slow;
	    
	    int sum = (n*(n+1))/2;
	    int sumArr=0;
	    
	    int sum2= arr.stream().mapToInt(e->e).sum();
	    
	    res[0]= sum-sum2;
	    
	    return res;*/
		
		int[] nums = new int[arr.size()];
		for(int i=0; i<arr.size(); i++) {
			nums[i]=arr.get(i);
		}
        int fast=1;
        int slow=1;
        do {
            fast=nums[nums[fast-1]]-1;
            slow=nums[slow]-1;
            
        }while(slow!=fast);
        
        fast=0;
        while(slow!= fast) {
            slow=nums[slow]-1;
            fast=nums[fast]-1;
        }

        int [] res= new int[2];
        res[1]=slow;
        
        int sum = (n*(n+1))/2;
        
        int sum2= arr.stream().mapToInt(e->e).sum();
        
        
        res[0]= (sum>sum2) ? sum-sum2: sum2-sum;
        
        return res;
    }
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int n=10;
		arr.add(4);arr.add(5);arr.add(2);
		arr.add(9);
		arr.add(8);
		arr.add(1);
		arr.add(1);
		arr.add(7);
		arr.add(10);
		arr.add(3);
		//4 5 2 9 8 1 1 7 10 3
		System.out.println(Arrays.toString(new MissingAndRepeating().missingAndRepeating(arr, n)));
	}

}
