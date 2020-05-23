package leetcode;

public class Invert_Binary_Tree {
	public TreeNode invertTree(TreeNode root) {
		invert(root);
		return root;
    }
	
	void invert(TreeNode t) {
		if(t!=null) {
			invert(t.left);
			invert(t.right);
			TreeNode l=t.left;
			t.left=t.right;
			t.right=l;
		}
	}

	
	
	
	public static void main(String[] args) {
		TreeNode root=new TreeNode();
		root.val=4;
		TreeNode l1=new TreeNode();l1.val=2;
		TreeNode r1=new TreeNode();r1.val=7;
		
		TreeNode l1l2=new TreeNode();l1l2.val=1;
		TreeNode l1r2=new TreeNode();l1r2.val=3;
		
		TreeNode r1l2=new TreeNode();r1l2.val=6;
		TreeNode r1r2=new TreeNode();r1r2.val=9;
		
		root.left=l1;root.right=r1;
		l1.left=l1l2;l1.right=l1r2;
		r1.left=r1l2;r1.right=r1r2;
		
		TreeNode r = new Invert_Binary_Tree().invertTree(root);
		boolean flag =false; 
		if(root.val==4) {
			if(root.left.val==7 && root.right.val==2) {
				if(root.left.left.val==9 && root.left.right.val==6 &&
						root.right.left.val==3 && root.right.right.val==1) {
					flag=true;
				}
			}
		}
		
		System.out.println("IsInverted: "+flag);
		
	}
	
}
