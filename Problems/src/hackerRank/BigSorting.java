package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
 * link: https://www.hackerrank.com/challenges/big-sorting/problem
 * 
 */
public class BigSorting {

	
	  static String[] bigSorting(String[] unsorted) {
		
		 Arrays.sort(unsorted, (a,b)-> {
			 if(a.length()<b.length()) {
				 return -1;
			 }else if(a.length()>b.length()) {
				 return 1;
			 }else {
				 return a.compareTo(b);
			 }
		 });
		 
		  
		  return unsorted;
	    }
	
	public static void main(String[] args) throws IOException {
		/*BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		
		String [] arr =new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=br.readLine();
		}
		 System.out.println(Arrays.toString(bigSorting(arr)));
		*/
		 /*Map<String, Integer> hm= new HashMap<>();
		 hm.put(null,1);
		 System.out.println(hm.get(null));
		 
		 Map<String, Integer> hm2= new TreeMap<>();
		 hm2.put(null,1);
		 System.out.println(hm.get(null));
		 */
		 Map<String, Integer> ht=new Hashtable<>(); 
		 ht.put("df", null);
		 
		
		 
		 
	}

}
