package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class DiameterOfBinaryTree {

	 public int diameterOfBinaryTree(TreeNode root) {
		if(root==null)return 0;
		 int left= findMax(root.left);
		 int right= findMax(root.right);
		 
		 int ld= diameterOfBinaryTree(root.left);
		 int rd= diameterOfBinaryTree(root.right);
		 
		 return Collections.max(Arrays.asList((left+right),ld,rd));
	    }
	 
	 int findMax(TreeNode root) {
		 if(root==null)return 0;
		 return  1+Integer.max(findMax(root.left), findMax(root.right));
	 }
	
	public static void main(String[] args) {
		TreeNode root=new TreeNode();
		root.val=1;
		TreeNode l1l1=new TreeNode();l1l1.val=2;
		TreeNode l1r1=new TreeNode();l1r1.val=3;
		
		TreeNode l2l1=new TreeNode();l2l1.val=4;
		TreeNode l2r1=new TreeNode();l2r1.val=5;
	
		root.left=l1l1;root.right=l1r1;
		
		l1l1.left=l2l1;l1l1.right=l2r1;	
		System.out.println(new DiameterOfBinaryTree().diameterOfBinaryTree(root));

	}

}
