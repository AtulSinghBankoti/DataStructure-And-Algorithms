package leetcode;

import java.util.*;



public class Numbers_With_Same_Consecutive_Diff {

	 public int[] numsSameConsecDiff(int N, int K) {
	        Set<Integer> cur = new HashSet();
	        for (int i = 1; i <= 9; ++i)
	            cur.add(i);

	        
	        System.out.println(cur);
	        
	        for (int steps = 1; steps <= N-1; ++steps) {
	            Set<Integer> cur2 = new HashSet();
	            for (int x: cur) {
	                int d = x % 10;
	                if (d-K >= 0)
	                    cur2.add(10*x + (d-K));
	                if (d+K <= 9)
	                    cur2.add(10*x + (d+K));
	            }
	            System.out.println(cur2);
	            
	            cur = cur2;
	        }

	        if (N == 1)
	            cur.add(0);

	        int[] ans = new int[cur.size()];
	        int t = 0;
	        for (int x: cur)
	            ans[t++] = x;
	        return ans;
	    }
	
	/**
	public int[] numsSameConsecDiff(int N, int K) {
        
		int start=1;
		int end=1;
		
		if(N==1) {
			return new int[] {0,1,2,3,4,45,6,7,8,9};
		}else if(N==2) {
			start=10;
			end =99;
		}else {
			for(int i=1; i<N ;i++) {
				start*=10;
			}
		}
		end = start*10-1;
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=start; i<=end; i++) {
			String t =""+i;
			boolean flag =true;
			int a,b;
			
			if(t.length()==2) {
				a= Integer.parseInt(""+t.charAt(0));
				b= Integer.parseInt(""+t.charAt(1));
				if( Math.abs(a-b)==K) {
					list.add(i);
				}
			}else {

				if(K==0) {
					String res="";
					for(int l=1; l<=9; l++) {
						res="";
						for(int m=1; m<=N; m++) {
							res+=l;
						}
						list.add(Integer.parseInt(res));
					}
					break;
				}else {
					flag=true;
					for(int j=0, k=t.length()-1; j<k; j++,k--) {
						a= Integer.parseInt(""+t.charAt(j));
						b= Integer.parseInt(""+t.charAt(j+1));
						if( Math.abs(a-b)!=K) {
							flag=false;
							break;
						}

						a= Integer.parseInt(""+t.charAt(k));
						b= Integer.parseInt(""+t.charAt(k-1));
						if( Math.abs(a-b)!=K) {
							flag=false;
							break;
						}
					}

					if(flag) {
						list.add(i);
					}	
				}
			}
		}
		
		int res []=new int [list.size()];
		
		for(int i=0; i<list.size(); i++) {
			res[i] = list.get(i);
		}
		
		return res;
    }*/
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new Numbers_With_Same_Consecutive_Diff().numsSameConsecDiff(3, 7)));
		//System.out.println(Arrays.toString(new Numbers_With_Same_Consecutive_Diff().numsSameConsecDiff(2, 1)));
		//System.out.println(Arrays.toString(new Numbers_With_Same_Consecutive_Diff().numsSameConsecDiff(4, 0)));
		//System.out.println(Arrays.toString(new Numbers_With_Same_Consecutive_Diff().numsSameConsecDiff(6, 0)));
	}

}
