package practice;

import java.util.HashMap;

/*
 * link: https://leetcode.com/problems/robot-return-to-origin/
 * 
 */

public class RobotReturnToOrigin {

	public boolean judgeCircle(String moves) {
		int r=0;
		int c=0;
		for(int i=0; i<moves.length(); i++) {
			if(moves.charAt(i) == 'R') {
				c++;
			}else if(moves.charAt(i) == 'L') {
				c--;
			}else if(moves.charAt(i) == 'U') {
				r--;
			}else if(moves.charAt(i) == 'D') {
				r++;
			}
			
		}
		
		return (r==0 && c==0);
	}

	public static void main(String[] args) {
		String input = "RLUURDDDLU";
		String input2 = "RRDD";
		
		RobotReturnToOrigin origin = new RobotReturnToOrigin();
		System.out.println(origin.judgeCircle(input2));
	}

}
