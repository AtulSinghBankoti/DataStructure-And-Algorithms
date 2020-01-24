package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WordCompression {

	
	public static String compressWord(String word, int k) {
		
		/*
		 * HashMap<String, Integer> m =new HashMap<>();
		 * 
		 * for(int i=0; i<word.length(); i++) { String key= ""+word.charAt(i);
		 * if(m.containsKey(key)){ m.put(key,m.get(key)+1); }else { m.put(key, 1); } }
		 * 
		 * List<String> li= new ArrayList<>();
		 * 
		 * String w=word; for(Map.Entry<String, Integer> entry:m.entrySet()) {
		 * if(entry.getValue()==k) {
		 * 
		 * } }
		 */
		
		String w=word;
		while(true) {
			String temp = w;
			for(int i=0;i<w.length();i++) {
				int c=0;
				for(int j=i; j<j+k;j++) {
					if(j<w.length() && w.charAt(i)==w.charAt(j)) {
						c++;
					}else {
						break;
					}
				}
				
				if(c==k) {
					w=w.substring(0, i)+w.substring(i+k, w.length());
				}	
			}
			
			if(temp.equals(w)) {
				break;
			}	
		}
		
		
		
		
		
		return w;
	}
	
	public static void main(String[] args) {
		
		WordCompression compression =new WordCompression();
		//System.out.println(compression.compressWord("abbcccb", 3));
		//System.out.println(compression.compressWord("abbccd", 2));
		System.out.println(compression.compressWord("abbcccb", 3));
	}

}
