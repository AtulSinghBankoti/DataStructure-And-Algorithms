package practice;
/**
 * 
 * 
 * link https://leetcode.com/problems/longest-valid-parentheses/submissions/
 * 
 * time: O(n)
 * space O(n)
 */


import java.util.LinkedList;
import java.util.Stack;

public class LongestValidParentheses {

	
	public int longestValidParentheses(String s) {
        
		LinkedList<Integer> stack = new LinkedList<>();
		stack.push(-1);
		
		int max = 0;
		
		for(int i=0; i<s.length(); i++) {
			
			int top = stack.peek();
			
			if( top!=-1 && s.charAt(top) == '(' 
					
			  && s.charAt(i) == ')') {
				stack.pop();
				int newTop = stack.peek();
				max = Math.max(i - newTop, max);
			}else {
				stack.push(i);
			}
		}
		
        return max;
    }
	
	public static void main(String[] args) {
		LongestValidParentheses  validParentheses = new LongestValidParentheses();
		
		int res = validParentheses.longestValidParentheses(")()())");
		
		System.out.println(res);

	}

}
