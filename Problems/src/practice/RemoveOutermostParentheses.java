package practice;
/*
 * link: https://leetcode.com/problems/remove-outermost-parentheses/
 * 
 */

public class RemoveOutermostParentheses {

	public String removeOuterParentheses(String S) {
		
		String output="";
		for(int i=0;i<S.length()-1;i++) {
			if(S.charAt(i)=='(' && S.charAt(i+1)==')') {
				output+="()";
			}	
		}
		return output;
	}

	public static void main(String[] args) {
		String input="(()())(())";
		String input2="(()())(())(()(()))";
		String expected="()()()()(())";
		RemoveOutermostParentheses outermostParentheses=new RemoveOutermostParentheses();
		String res= outermostParentheses.removeOuterParentheses(input2);
		System.out.println("input:"+input2);
		System.out.println("output:"+res);
		System.out.println("expected:"+expected);
		
	}

}
