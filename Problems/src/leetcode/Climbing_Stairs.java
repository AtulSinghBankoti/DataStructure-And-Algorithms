package leetcode;

public class Climbing_Stairs {
	
	
	public int climbStairs(int n) {
		if(n==1) {
			return 1;
		}
		
		int temp [] = new int[n+1];
		temp[1]=1;
		temp[2]=2;
		for(int i=3; i<=n; i++) {
			temp[i]=temp[i-2]+temp[i-1];
		}
		
		return temp[n];
    }
	
	
	public static void main(String[] args) {
		System.out.println(new Climbing_Stairs().climbStairs(5));
	}
}
