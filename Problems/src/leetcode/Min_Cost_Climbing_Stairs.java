package leetcode;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {
	
	public int minCostClimbingStairs(int[] cost) {
		
		int len =cost.length;
		if(len==0 ) {
			return 0;
		}else if(len==1 || len==2) {
			return cost[1];
		}else if(len==3) {
			return Integer.min(cost[0]+cost[2], cost[1]);
		}
		
		int f1=cost[0];
		int f2=cost[1];
		for(int i=2; i<len; i++) {
			int c =cost[i]+ Integer.min(f2, f1);
			f1=f2;
			f2=c;
			if(i==len-2) {
				return Integer.min(f2, f1+cost[i+1]);
			}
		}
		
        return Integer.min(f1, f2);
    }
	
	public static void main(String[] args) {
		int input[] =new int[] {0,0,1,0};
		System.out.println(Arrays.toString(input) +": "+new Min_Cost_Climbing_Stairs().minCostClimbingStairs(input));		
		input =new int[] {10, 15, 20};
		System.out.println(Arrays.toString(input) +": "+new Min_Cost_Climbing_Stairs().minCostClimbingStairs(input));
		input =new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		System.out.println(Arrays.toString(input) +": "+new Min_Cost_Climbing_Stairs().minCostClimbingStairs(input));
		input =new int[] {0,0,1,1};
		System.out.println(Arrays.toString(input) +": "+new Min_Cost_Climbing_Stairs().minCostClimbingStairs(input));
		input =new int[] {0,0,0,1};
		System.out.println(Arrays.toString(input) +": "+new Min_Cost_Climbing_Stairs().minCostClimbingStairs(input));
	}
}
