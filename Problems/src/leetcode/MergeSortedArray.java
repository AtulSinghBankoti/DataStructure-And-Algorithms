package leetcode;

import java.util.Arrays;

public class MergeSortedArray {
	
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
	       
	        int gap = (int)(Math.ceil((double)m+n/2));	
		       
		       int p=m;
		       for(int i=0; i<nums2.length; i++) {
		    	   nums1[p++]= nums2[i];
		       }
		       boolean flag=false;
		       while(gap>0) {
		    	   int pointer1 = 0;
			       int pointer2 = gap;
		    	   while(pointer2<nums1.length) {
		    		   if(nums1[pointer1] > nums1[pointer2]) {
		    			   swap(nums1, pointer1, pointer2);
	                       flag=true;
		    			   pointer1++;
		    			   pointer2++;
		    		   }else {
		    			   pointer2++;
		    			   pointer1++;
		    		   }
		    	   }
		    	   if(gap==1) {
		    		   gap=0;
		    	   }else {
		    		   gap=(int)Math.ceil((double)gap/2);	
		    	   }	   
		       }
		       
	       
	    }
	 
	 
	 void swap(int []num,int p1, int p2) {
		 int tmpStore = num[p1];
		 num[p1] = num[p2];
		 num[p2] = tmpStore;
	 }

	public static void main(String[] args) {
		//int[] nums1 = {1,2,3,0,0,0};
		///int m = 3;
		//int [] nums2 = {2,5,6};
		//int n = 3;
		
		//int [] nums1 = {1};
		//int m = 1; 
		//int [] nums2 = {};
		//int n = 0;
		
		//int[] nums1 = {0};
		//int m = 0;
		//int[] nums2 = {1};
		//int n = 1;
		
		/*
		int [] nums1= {0,1,1,2,2,0,0,0};
		int m=5;
		int [] nums2 = {0,3,3};
		int n=3;
		new MergeSortedArray().merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));*/
		/*
		int m=100; 
		int n=50;
		 int gap1 = (int)(Math.ceil((double)m+n/2));
		 int gap2 = (int)(Math.ceil(m+n/2));	
		for(int i=0; i< 10; i++) {
			 System.out.println("gap1 with double"+gap1);
			 System.out.println("gap1 without double"+gap2);
			 gap1 = (int)(Math.ceil((double)gap1/2));
			 gap2 = (int)(Math.ceil(gap2/2));
		}*/
		
		System.out.println(125/2);
		System.out.println((double)125/2);
	}

}
