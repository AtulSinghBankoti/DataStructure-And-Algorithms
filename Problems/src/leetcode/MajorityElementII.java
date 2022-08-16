package leetcode;

import java.util.*;

public class MajorityElementII {

	 public List<Integer> majorityElement(int[] nums) {
		   List<Integer> res=new ArrayList<>();  
		      int n1=0;
		      int n2=0;
		      int n1Val=-1;
		      int n2Val=-1;
		       
		        for(int i=0; i<nums.length; i++){
		            
		            if(nums[i] == n1Val){
		                n1++;
		            }else if(nums[i] == n2Val){
		                n2++;
		            }else if(n1==0){
		                n1Val=nums[i];
		                n1=1;
		            }else if(n2==0){
		                n2Val=nums[i];
		                n2=1;
		            }else{
		                n1--;
		                n2--;
		            }
		        }
		        
		        n1=0;
			    n2=0;
		        
			    for(int i=0; i<nums.length; i++) {
			    	if(nums[i]==n1Val) {
			    		n1++;
			    	}
			    	
			    	if(nums[i]==n2Val) {
			    		n2++;
			    	}
			    }
		        
		        if(n1> (nums.length/3)){
		            res.add(n1Val);
		        }
	        
	            if(n2> (nums.length/3)){
		          
	                 
	                         res.add(n2Val);  
	                    
	                }
	             
	                
		        if(res.size()>1){
	                res.remove(0);
	            }
		           
		        
		        return res;
			 
		 
		 
	 }
	
	public static void main(String[] args) {
		 //List<Integer>  res= new MajorityElementII().majorityElement(new int[]{3,2,3});
		 List<Integer>  res= new MajorityElementII().majorityElement(new int[]{2,2,1,3});
		System.out.println(res);		 
	}

}
