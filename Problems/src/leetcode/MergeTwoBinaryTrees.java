package leetcode;

public class MergeTwoBinaryTrees {
	/**public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		TreeNode root=new TreeNode();
		if(t1==null & t2==null)return null;
		merge(t1, t2, root);
		return root;
    }*/
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null) return t2;
	    if (t2 == null) return t1;
	    t1.val += t2.val;
	    t1.left = mergeTrees(t1.left, t2.left);
	    t1.right = mergeTrees(t1.right, t2.right);
	    return t1;
    }
	
	
	
	void merge(TreeNode t1, TreeNode t2, TreeNode root){
		if(t1==null & t2==null) {
			root=null;
		}else if(t1==null) {
			root.val=t2.val;
		}else if(t2==null) {
			root.val=t1.val;
		}else {
			root.val=t1.val+t2.val;
			TreeNode right = new TreeNode();
			TreeNode left = new TreeNode();
			
			if(!(t1.left==null & t1.left==null)) {
				root.left=left;
				merge(t1.left, t2.left, left);
			}
			if(!(t1.right==null & t2.right==null)) {
				root.right=right;
				merge(t1.right, t2.right, right);
			}
			
		}
	}
	
	
	public static void main(String[] args) {
	    TreeNode t1=new TreeNode();
		t1.val=1;
		TreeNode l1l1=new TreeNode();l1l1.val=3;
		TreeNode l1r1=new TreeNode();l1r1.val=2;
		
		TreeNode l2l1=new TreeNode();l2l1.val=5;
		
		t1.left=l1l1;t1.right=l1r1;
		l1l1.left=l2l1;
		
		TreeNode t2=new TreeNode();
		t2.val=2;
		TreeNode t2l1l1=new TreeNode();t2l1l1.val=1;
		TreeNode t2l1r1=new TreeNode();t2l1r1.val=3;
		
		TreeNode t2l2r1=new TreeNode();t2l2r1.val=4;
		TreeNode t2l2r2=new TreeNode();t2l2r2.val=7;
		
		t2.left=t2l1l1;t2.right=t2l1r1;
		t2l1l1.right=t2l2r1;
		t2l1r1.right=t2l2r2;
		
		
		TreeNode root=new MergeTwoBinaryTrees().mergeTrees(t1, t2);
		
		System.out.println(root.val);
		System.out.println(root.left.val);
		System.out.println(root.right.val);
		System.out.println(root.left.left.val);
		System.out.println(root.left.right.val);
		System.out.println(root.right.right.val);
		
		/**
		TreeNode t1=new TreeNode();
		t1.val=1;
		TreeNode l1l1=new TreeNode();l1l1.val=2;
		t1.left=l1l1;
		
		TreeNode t2=new TreeNode();	
		t2.val=1;
		
		TreeNode root= new MergeTwoBinaryTrees().mergeTrees(t1, t2);
		System.out.println(root.val);
		System.out.println(root.left.val);
		*/
	}
}

