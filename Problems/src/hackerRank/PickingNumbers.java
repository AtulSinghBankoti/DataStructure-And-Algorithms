package hackerRank;

/**
 *  https://www.hackerrank.com/challenges/picking-numbers/problem?isFullScreen=true
 *
 */

import java.util.*;

public class PickingNumbers {

	
	public static int pickingNumbers(List<Integer> a) {
		
		int res = 0;
		
		for(int i=0; i< (a.size()-1); i++) {
			
			int c1=1;
			int c2=1;
			for(int j=i; j<a.size()-1; j++) {
				int v1=a.get(i);
				int v2=a.get(j+1);
				
				if( v1-v2 == -1 || v1-v2==0 ) {
					c1++;
				}
				
				if( v1-v2 == +1 || v1-v2==0 ) {
					c2++;
				}
				
			}
			
			int m=Integer.max(c1, c2);
			
			if(m >= res) {
				res = m;
			}
		}
		
		return res;
	 }
	
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[]{4,6,5,3,3,1});
		System.out.println("input:"+list+ "  output:" +PickingNumbers.pickingNumbers(list));
		
		list = Arrays.asList(new Integer[]{1, 2, 2, 3, 1, 2});
		System.out.println("input:"+list+ "  output:" +PickingNumbers.pickingNumbers(list));
		
	}

}
