package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ADMIN
 * link: https://leetcode.com/problems/binary-tree-level-order-traversal/
 */


public class BinaryTreeLevelOrderTraversal {

	 public List<List<Integer>> levelOrder(TreeNode root) {
		 List<List<Integer>> res = new ArrayList<List<Integer>>();
		 if(root == null) {
			 return res;
		 }else {
			 List<Integer> list = new ArrayList<Integer>();
			 list.add(root.val);
			 res.add(list);
			 if(null != root.left || null != root.right) {
				 res.add(new ArrayList<Integer>());
				 getAllLevel(1, res, root.left);
				 getAllLevel(1, res, root.right);
			 }
		 }
		 
		 List<List<Integer>> resfinal = new ArrayList<List<Integer>>();
		 
		 for(List<Integer> li : res) {
			 if(!li.isEmpty())
				 resfinal.add(li);	 
		 }
		 
		 return resfinal;
	    }
	 
	 
	 void getAllLevel(int level, List<List<Integer>> res, TreeNode root ){
		 if(null != root) {
			res.get(level).add(root.val);
			if(null != root.left || null != root.right) {
				res.add(new ArrayList<Integer>());
				getAllLevel(level + 1 , res, root.left);
				getAllLevel(level + 1, res, root.right);
			}
		 }
	 }

	public static void main(String[] args) {
		//root = [3,9,20,null,null,15,7]
		TreeNode node = new TreeNode();
		node.val=3;
		TreeNode node2 = new TreeNode();
		node2.val=9;
		TreeNode node3 = new TreeNode();
		node3.val=20;
		node.left=node2; node.right=node3;
		
		TreeNode node4 = new TreeNode();
		node4.val=15;
		TreeNode node5 = new TreeNode();
		node5.val=7;
		
		node3.left=node4; node3.right=node5;
		
		System.out.println(new BinaryTreeLevelOrderTraversal().levelOrder(node));
	}

}
