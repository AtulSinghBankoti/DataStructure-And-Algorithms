package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/*
 * link: https://leetcode.com/problems/symmetric-tree/
 * 
 */

public class SymmetricTree {





	public boolean isSymmetric(TreeNode root) {
		
		Queue<TreeNode> q= new LinkedList<>(); 
		q.add(root);
		q.add(root);
		
		while(!q.isEmpty()) {
			TreeNode t1= q.poll();
			TreeNode t2= q.poll();
			if(t1==null && t2==null) continue;
			if(t1==null || t2==null) return false;
		
			if(t1.val != t2.val) return false; 
		
			q.add(t1.left);
			q.add(t2.right);
			q.add(t1.right);
			q.add(t2.left);
		}
		
			
		return true;
	}
	
public boolean isSymmetric2(TreeNode root) {
		
		return isMirror(root, root);
	}
	
	private boolean isMirror(TreeNode t1, TreeNode t2) {
	
		if(t1 == null && t2 == null) return true;
		if(t1 == null || t2 == null) return false;
		
		return (t1.val == t2.val)
				&& isMirror(t1.right, t2.left)
				&& isMirror(t1.left, t2.right);
}

	public static void main(String[] args) {

		TreeNode tree= new TreeNode(1);
		TreeNode n1= new TreeNode(2);
		TreeNode n2= new TreeNode(2);
		TreeNode n3= new TreeNode(3);
		TreeNode n4= new TreeNode(4);
		TreeNode n5= new TreeNode(4);
		TreeNode n6= new TreeNode(3);

		tree.left=n1;
		tree.right=n2;
		n1.left=n3;
		n1.right=n4;
		n2.right=n6;
		n2.left=n5;

		SymmetricTree symmetricTree =new SymmetricTree();
		System.out.println(symmetricTree.isSymmetric(tree));
	}

}
