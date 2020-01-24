package practice;

/*
 * 
 * link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * 
 */

public class MaximumDepthOfBinaryTree {

	 public int maxDepth(TreeNode root) {
	        if(root==null){
	            return 0;
	        }else{
	            return 1+Integer.max(maxDepth(root.left), maxDepth(root.right));
	        }
	    }
	
	public static void main(String[] args) {
	

	}

}
