package practice;

import java.util.ArrayList;
import java.util.List;

public class AllStringCombination {

	List<String> list = new ArrayList<>();
	
	private void generateAllCombo(String s, int n) {
		
		if(n == s.length()) {
			list.add(s);
		}
		
		for(int i = n; i<s.length(); i++) {
			String t = swap(s,n,i);
			generateAllCombo(t, n+1);
			
		}
	}

	private  String swap(String s, int n, int i) {
		
		char [] arr = s.toCharArray();
		char t = arr[n];
		arr[n] = arr[i];
		arr[i] = t;
		
		return new String(arr);
	}
	
	
	public static void main(String[] args) {
		AllStringCombination ob = new AllStringCombination();
		ob.generateAllCombo("abc", 0);
		System.out.println(ob.list);
		

	}

}
