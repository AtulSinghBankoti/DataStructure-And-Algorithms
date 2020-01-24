package practice;

import java.util.Arrays;
import java.util.Collections;

public class BinaryTreeMaximumPathSum {

	TreeNode root;
	
	public int findMax(TreeNode root, int sum){
		
		if(root==null) {
			return 0;
		}else {
			
			int  leftPathSum = findMax(root.left, sum);
			int  rightPathSum = findMax(root.right, sum);
			int rootVal= root.val; 
			
			/*
			 * sum= Collections.max(Arrays.asList(rootVal, leftPathSum+rootVal,
			 * rightPathSum+rootVal, leftPathSum+rootVal+rightPathSum, sum));
			 */
			
			int max_single = Math.max(Math.max(leftPathSum, rightPathSum) + root.val, 
                    root.val);
			
			 int max_top = Math.max(max_single, leftPathSum + rightPathSum + root.val); 
			
			 
			 sum = Math.max(sum, max_top);
			return max_single;
		}
		
	}
	
	
	  public int maxPathSum(TreeNode root) {
		return findMax(root, Integer.MIN_VALUE) ;
	    }
	
	
	public static void main(String[] args) {
		

	}
	
	
	  int findMaxUtil(TreeNode node, Res res) 
	    { 
	  
	        // Base Case 
	        if (node == null) 
	            return 0; 
	  
	        // l and r store maximum path sum going through left and 
	        // right child of root respectively 
	        int l = findMaxUtil(node.left, res); 
	        int r = findMaxUtil(node.right, res); 
	  
	        // Max path for parent call of root. This path must 
	        // include at-most one child of root 
	        int max_single = Math.max(Math.max(l, r) + node.val, 
	                                  node.val); 
	  
	  
	        // Max Top represents the sum when the Node under 
	        // consideration is the root of the maxsum path and no 
	        // ancestors of root are there in max sum path 
	        int max_top = Math.max(max_single, l + r + node.val); 
	  
	        // Store the Maximum Result. 
	        res.val = Math.max(res.val, max_top); 
	  
	        return max_single; 
	    } 
	  
	    int findMaxSum() { 
	        return findMaxSum(root); 
	    } 
	  
	    // Returns maximum path sum in tree with given root 
	    int findMaxSum(TreeNode node) { 
	  
	        // Initialize result 
	        // int res2 = Integer.MIN_VALUE; 
	        Res res = new Res(); 
	        res.val = Integer.MIN_VALUE; 
	  
	        // Compute and return result 
	        findMaxUtil(node, res); 
	        return res.val; 
	    } 
	  
	 
	 class Res { 
		    public int val; 
		} 
		  

}
