package leetcode;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

/**
 * problem link: https://leetcode.com/problems/roman-to-integer/
 * @author ADMIN
 *
 */

public class RomanToInteger {
	
	 static Map<String, Integer> map =new HashMap<String, Integer>();
	 
	 static{
		 map.put("I", 1);
		 map.put("V", 5);
		 map.put("X", 10);
		 map.put("L", 50);
		 map.put("C", 100);
		 map.put("D", 500);
		 map.put("M", 1000);
	 }
	 
	 public int romanToInt(String s) {
	     
		 int res = 0;
		 for(int i=0; i<s.length(); i++) {
			 if(i+1 < s.length()) {
				 int c1 = map.get(""+s.charAt(i));
				 int c2 = map.get(""+s.charAt(i+1));
				 if(c1 < c2) {
					 res+=c2-c1;
					 i++;
				 }else {
					 res+=c1;
				 }
			 }else {
				 res+=map.get(""+s.charAt(i));
			 }
			 
		 }
		 
		 return res;
	    }
	
	public static void main(String[] args) {
	 System.out.println("58 :"+new RomanToInteger().romanToInt("LVIII"));
	 System.out.println("1994 :"+new RomanToInteger().romanToInt("MCMXCIV"));
	 System.out.println("3 :"+new RomanToInteger().romanToInt("III"));

	}

}
