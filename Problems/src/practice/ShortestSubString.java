package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ShortestSubString {

	
	
	public static int getShortestSubString(String s){
		
		Set<String> set =new HashSet<>();
		
		for(int i=0; i<s.length(); i++) {
			set.add(""+s.charAt(i));
		}
		
		
		String result = s;
		for(int i=0; i<s.length(); i++) {
			
			Set<String> temp= new HashSet<>();
			String t="";
			for(int j=i; j<s.length();j++) {
				
				if(!temp.contains(""+s.charAt(j))) {
					temp.add(""+s.charAt(j));
					t+=""+s.charAt(j);
				}
				
				if(temp.size()==set.size()) {
					if(t.length() < result.length()) {
						result = t;
					}
				}
				
			}
			
			
		}
		
		
		
		return result.length();
	}
	
	
	public static void main(String[] args) {
		ShortestSubString subString = new ShortestSubString();
		
		System.out.println(subString.getShortestSubString("dabbcabcd"));
		

	}

}
