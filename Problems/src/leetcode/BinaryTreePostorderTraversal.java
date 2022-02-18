package leetcode;

import java.util.*;

public class BinaryTreePostorderTraversal {

	
	 List<Integer> res = new ArrayList<>();
	  public List<Integer> postorderTraversal(TreeNode root) {
	     
	      LinkedList<TreeNode> stack1 = new LinkedList<TreeNode>();
	      LinkedList<TreeNode> stack2 = new LinkedList<TreeNode>();
	      
	      if(root != null) {
	    	stack1.push(root);
	    	while(!stack1.isEmpty()) {
	    		
	    		root = stack1.pop();
	    		stack2.push(root);
	    		
	    		if(root.left != null) stack1.push(root.left);
	    		if(root.right != null) stack1.push(root.right);
	    	}
	    	
	    	while(!stack2.isEmpty()) {
	    		res.add(stack2.pop().val);
	    	}
	    	
	      }
		  
	      
		  return res;
	    }
	  
	  
	  public List<Integer> singleStack(TreeNode root) {
		  
		  
		  TreeNode curr = root;
		  LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		  
		  while(curr != null || !stack.isEmpty()) {
			  
			  while(curr!= null) {
				  stack.push(curr);
				  curr= curr.left;
			  }
			  
			  curr= stack.pop();
			  if(curr.right != null) {
				 stack.push(curr); 
				 curr=curr.right; 
			  }else {
				  res.add(curr.val);
				  curr=null;
			  }
					   
		  }
		  
		  
		  return res;
	  }
	
	public static void main(String[] args) {
		System.out.println(new BinaryTreePostorderTraversal().singleStack(
				new TreeNode(2, new TreeNode(1), new TreeNode(3))));
	}

}
