package leetcode;

import java.util.LinkedList;

public class SymmetricTree {
	/**
	public boolean isSymmetric(TreeNode root) {
		if(root==null){
	           return true;
	       }
	    return checkSymmetric(root.left, root.right);
    }
	
	boolean checkSymmetric(TreeNode l, TreeNode r){
		if(l==null && r==null) {
			return true;
		}else if((l==null || r==null) || l.val != r.val) {
			return false;
		}else {
			return checkSymmetric(l.left, r.right) && checkSymmetric(l.right, r.left);
		}
	}*/

	
	public boolean isSymmetric(TreeNode root) {
		if(root==null) {
			return true;
		}
		LinkedList<TreeNode> l =new LinkedList<>();
		LinkedList<TreeNode> r =new LinkedList<>();
		l.add(root.left);
		r.add(root.right);
		
		while(!l.isEmpty() && !r.isEmpty()) {
		
			TreeNode lNode= l.poll();
			TreeNode rNode= r.poll();
			
			if(lNode==null && rNode==null) continue;
			
			if((lNode==null || rNode==null) || lNode.val!=rNode.val) {
					return false;
			}
			
			l.add(lNode.left);l.add(lNode.right);
			r.add(rNode.right);r.add(rNode.left);
		}
		
		return true;
    }
	
	public static void main(String[] args) {
		//[1,2,2,3,4,4,3]
		TreeNode root=new TreeNode();
		root.val=1;
		TreeNode l1=new TreeNode();l1.val=2;
		TreeNode r1=new TreeNode();r1.val=2;
		
		TreeNode l1l2=new TreeNode();l1l2.val=3;
		TreeNode l1r2=new TreeNode();l1r2.val=4;
		
		TreeNode r1l2=new TreeNode();r1l2.val=4;
		TreeNode r1r2=new TreeNode();r1r2.val=3;
		
		root.left=l1;
		root.right=r1;
		
		l1.left=l1l2;
		l1.right=l1r2;
		
		r1.left=r1l2;
		r1.right=r1r2;
		
		System.out.println(new SymmetricTree().isSymmetric(root));
				
		//[1,2,2,3,4,4,3]
				TreeNode root2=new TreeNode();
				root.val=1;
				l1=new TreeNode();l1.val=2;
				r1=new TreeNode();r1.val=2;
				
				l1r2=new TreeNode();l1r2.val=3;
				
				r1r2=new TreeNode();r1r2.val=3;
		
				root2.left=l1; root2.right=r1;
				l1.left=null;l1.right=l1r2;
				r1.left=null;r1.right=r1r2;
				System.out.println(new SymmetricTree().isSymmetric(root2));	
				
	}
}



class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
	@Override
	public String toString() {
		return "TreeNode [val=" + val + "]";
	}
 }