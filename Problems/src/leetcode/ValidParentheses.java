package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ADMIN
 *
 *link: https://leetcode.com/problems/valid-parentheses/
 */

public class ValidParentheses {

	 public boolean isValid(String s) {
	     
		 List<String> characters = new ArrayList<>();
		 characters.add(")");characters.add("}");characters.add("]");
		 LinkedList<String> stack = new LinkedList<String>();
		 for(int i=0; i<s.length(); i++) {
			if(characters.contains(s.charAt(i)+"")) {
				if(stack.isEmpty()) {
					return false;
				}else if(stack.pop().equals(getChars(s.charAt(i)))) {
					continue;	
				}else {
					return false;
				}
					
			}else {
				stack.push(s.charAt(i)+"");
			}
		 }
		 if(stack.isEmpty()) {
			 return true;
		 }else{
			 return false;
		 }
	 }
	 
	 public String getChars(char ch){
		 switch (ch) {
		 	case '}':
		 		return "{";
		 	case ')':
		 		return "(";
		 	case ']':
		 		return "[";
		 	default:
		 		return "ERR";
		}
	 }
	
	public static void main(String[] args) {
		System.out.println("()[]{}: "+new ValidParentheses().isValid("()[]{}"));
		System.out.println("()[]{}: "+new ValidParentheses().isValid("(]"));
	}

}
