package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * link: https://leetcode.com/problems/can-i-win/
 * 
 */



public class CanIWin {

	public boolean canIWin(int max, int N) {
		if(N<=0) return true;
		if((max+1)*max/2<N) return false;
		char[] used= new char[max+1];
		Arrays.fill(used,'1');
		Map<String, Boolean> cache = new HashMap<>();
		return dfs(used, cache,N);
	}
	
	
	boolean dfs(char[] used,Map<String, Boolean> cache, int n){
		if(n<=0) return false;
		String key = new String(used);
		if(cache.containsKey(key)) return cache.get(key);
		boolean ans= false;
		for(int i=1;i<used.length; i++){
			if(used[i]=='1'){
				used[i]='0';
				System.out.println(">"+Arrays.toString(used));
				if(!dfs(used, cache, n-i)) ans=true;
				used[i]='1';
				if(ans) break;
			}   
		}
		cache.put(new String(used),ans);
		return ans;
	}

	public static void main(String[] args) {
		CanIWin canIWin =new CanIWin();
		int maxChoosableInteger = 10;
		int desiredTotal = 11;
		System.out.println(canIWin.canIWin(maxChoosableInteger, desiredTotal));
	}

}
