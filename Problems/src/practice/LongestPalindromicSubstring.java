package practice;

import java.util.*;

public class LongestPalindromicSubstring {

	
	 String output = "";
	    
	    public String longestPalindrome(String s) {
	        
	        if(s.length()==1){
	            return s;
	        }else if(s.length()==2){
	            if(s.charAt(0)==s.charAt(1)){
	               return s;
	            }else{
	                return ""+s.charAt(0);
	            }
	        }
	      for(int i=1; i<s.length(); i++) {
				for(int j=i-1,k=i+1;(j>=0 && k<s.length());j--, k++) {
					String temp = s.substring(j, k+1);
					compareAndUpdatePalindrome(temp);
				}
				
				for(int j=i-1,k=i;(j>=0 && k<s.length());j--,k++) {
					String temp = s.substring(j, k+1);
					compareAndUpdatePalindrome(temp);
				}
			}
			return (output.equals("") && s.length()>0)?(""+s.charAt(0)):output;
	        
	    }
	    
	    private void compareAndUpdatePalindrome(String temp) {
			if(new StringBuilder(temp).reverse().toString().equals(temp) && temp.length() > output.length()) {
				output=temp;
			}
		}

	public static void main(String[] args) {
		LongestPalindromicSubstring ob =new LongestPalindromicSubstring();
		String result = ob.longestPalindrome("bb");
		System.out.println("input:>"+"bb");
		System.out.println("result:>"+result); 
		
		result = ob.longestPalindrome("babad");
		System.out.println("input:>"+"babad");
		System.out.println("result:>"+result); 

	}

}
