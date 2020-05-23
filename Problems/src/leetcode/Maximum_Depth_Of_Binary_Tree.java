package leetcode;

public class Maximum_Depth_Of_Binary_Tree {
	public int maxDepth(TreeNode root) {
        if(root==null) {
        	return 0;
        }else {
        	return 1+Integer.max(maxDepth(root.left),maxDepth(root.right));
        }
    }
	
	
	public static void main(String[] args) {
		TreeNode root=new TreeNode();
		root.val=3;
		TreeNode l1=new TreeNode();l1.val=9;
		TreeNode r1=new TreeNode();r1.val=20;
		
		TreeNode r1l2=new TreeNode();r1l2.val=15;
		TreeNode r1r2=new TreeNode();r1r2.val=7;
		
		root.left=l1;root.right=r1;
		l1.left=null;l1.right=null;
		r1.left=r1l2;r1.right=r1r2;
		
		System.out.println(new Maximum_Depth_Of_Binary_Tree().maxDepth(root));
		
	}
}
