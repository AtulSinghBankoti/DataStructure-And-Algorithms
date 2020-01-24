package dsAlgo;

import java.util.LinkedHashSet;
import java.util.Set;

public class TSPRecrsive {
	
	int solve(int mat[][],int source,Set<Integer> set){
	   if(set.isEmpty()){
			return (mat[source][0]==0) ? Integer.MAX_VALUE:mat[source][0];
		}else {
			return  min(mat,source,set); 
		}
	}
	
	private int min(int[][]mat,int source,Set<Integer> set) {
		int minimum=Integer.MAX_VALUE;
		for(int i:set) {
			Set<Integer> c=new LinkedHashSet<>();
			copy(set,c,i);
			int m=mat[source][i]+solve(mat, i, c);
			if(m<minimum && m>=0) {
				minimum=m;
			}
		}
		return minimum;
	}

	void copy(Set<Integer> source,Set<Integer> dest,int e) {
		for(int i:source) {
			if(i!=e)
				dest.add(i);
		}
	}
	 
	public static void main(String[] args) {
		int mat[][]= {
		         {0,7,1,0,6},
		         {7,0,2,4,0},
		         {1,2,0,3,0},
		         {0,4,3,0,9},
		         {6,0,0,9,0}
		        };
		//int mat[][]= {{0,4,1,3},{4,0,2,1},{1,2,0,5},{3,1,5,0}};
		//int mat[][]= {{0,2,9,10},{1,0,6,4},{15,7,0,8},{6,3,12,0}};
	 /*int mat[][]={ { 0, 10, 15, 20 }, 
             { 10, 0, 35, 25 }, 
             { 15, 35, 0, 30 }, 
             { 20, 25, 30, 0 } }; */
		int startNode=0;
		Set<Integer> set=new LinkedHashSet<>();
		set.add(1);set.add(2);set.add(3);
		System.out.println(new TSPRecrsive().solve(mat, startNode, set));
	}
}
