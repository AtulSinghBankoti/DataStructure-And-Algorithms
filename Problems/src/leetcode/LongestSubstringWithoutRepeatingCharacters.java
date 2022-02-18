package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		
		int res =0;
		for(int i=0; i <s.length(); i++) {
			
			int temp=0;
			Map<String, Boolean> map =new HashMap<String, Boolean>();
			int j = i;
			while(j<s.length()) {
				if(map.get(""+s.charAt(j)) == null) {
					map.put(s.charAt(j)+"", true);
					temp++;
					j++;
				}else {
					break;
				}
			}
			
			if(temp > res) {
				res=temp;
			}
			
		}
		
		return res;
	}

	public static void main(String[] args) {
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"));
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb"));
	}

}
