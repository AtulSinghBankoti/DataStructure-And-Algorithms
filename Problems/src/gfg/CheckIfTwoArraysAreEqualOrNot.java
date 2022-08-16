package gfg;

import java.util.HashMap;

public class CheckIfTwoArraysAreEqualOrNot {

	public static boolean check(long A[],long B[],int N)
    {
		boolean res =false;
		
		HashMap<Long, Long> map1 = new HashMap<Long, Long>();
		HashMap<Long, Long> map2 = new HashMap<Long, Long>();
		for(long i:A) {
			if(map1.get(i)!= null) {
				map1.put(i, map1.get(i)+1);
			}else {
				map1.put(i, 1L);
			}
		}
		
		for(long i:B) {
			if(map2.get(i)!= null) {
				map2.put(i, map2.get(i)+1);
			}else {
				map2.put(i, 1L);
			}
		}
		
		for(long k : map1.keySet()) {
			if(map2.get(k) == null) {
				res= false;
				break;
			}else {
				if(map1.get(k) != map2.get(k)) {
				res= false;
				break;
				}else {
					res=true;
				}
			}
		}
		
		for(long k : map2.keySet()) {
			if(map2.get(k) == null) {
				res= false;
				break;
			}else {
				if(map1.get(k) != map2.get(k)) {
					res= false;
					break;
				}else {
					res=true;
				}
			}
		}
		
		return res;
        
    }
	
	public static void main(String[] args) {
	 long	A[] = new long[]{1,2,5};
	 long	B[] =new long[] {2,4,15};
	 
	// long A[] =new  long[] {1,2,5,4,0};
	 //long B[] =new long[] {2,4,5,0,1};
	  System.out.println(check(A, B,A.length));
	 
	}

}
