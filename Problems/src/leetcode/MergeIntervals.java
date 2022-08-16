package leetcode;

import java.util.*;

public class MergeIntervals {
	
	public int[][] merge(int[][] intervals) {
		
		Arrays.sort(intervals, (e1, e2) -> 
		     e1[0]>e2[0]? 1: 
		    	 (e1[0]==e2[0])? 
		    			 (e1[1]>e2[1]) ? 1: -1
		    					 :-1);
        
		for(int i=0; i<intervals.length; i++) {
			System.out.println(Arrays.toString(intervals[i]));
		}
		
		List<int[]> res =  new ArrayList<>();
		
		int tmpArr[];
		for(int i=0; i<intervals.length; i++) {
			
			if(res.isEmpty()) {
				 tmpArr = new int[2];
				 tmpArr[0]=intervals[i][0];
				 tmpArr[1]=intervals[i][1];
				 res.add(tmpArr);
			}else {
				int start=res.get(res.size()-1)[0];
				int end=res.get(res.size()-1)[1];
				if(end> intervals[i][0]) {
					tmpArr = new int[2];
					tmpArr[0]=start;
					tmpArr[1]=intervals[i][1];
					res.remove(res.size()-1);
					res.add(tmpArr);
				}else {
					tmpArr = new int[2];
					tmpArr[0]=intervals[i][0];
					tmpArr[1]=intervals[i][1];
					res.add(tmpArr);
				}
				
			}	
		}
		
		
		int [][] fres = new int[res.size()][2];
		
		for(int i=0; i<res.size(); i++) {
			fres[i][0]=res.get(i)[0];
			fres[i][1]=res.get(i)[1];
		}
		
		return fres;
    }

	public static void main(String[] args) {
		//int [][]intervals = {{1,3},{2,6},{8,10},{15,18}};
		
		int [][]intervals= {{1,4},{1,5}};
		int [][] res = new MergeIntervals().merge(intervals);
		
		for(int i=0; i<res.length; i++) {
			System.out.println(Arrays.toString(res[i]));
		}

	}

}
