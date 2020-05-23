package leetcode;

public class SimpleJavaDFS {

	
    public int pathSum(TreeNode root, int sum) {
    	if(root==null) {
    		return 0;
    	}
    	return pathSumFrom(root, sum)+pathSum(root.left, sum) +pathSum(root.right, sum);
    }
    
    int pathSumFrom(TreeNode node, int sum){
    	
    	int r=0;
    	if(node==null)return 0;
    	
    	if(node.val==sum)r++;
    return r+pathSumFrom(node.left, sum-node.val) + pathSumFrom(node.right, sum-node.val);
    }
    
	
	
	public static void main(String[] args) {
		TreeNode root=new TreeNode();
		root.val=10;
		TreeNode l1l1=new TreeNode();l1l1.val=5;
		TreeNode l1r1=new TreeNode();l1r1.val=-3;
		
		TreeNode l2l1=new TreeNode();l2l1.val=3;
		TreeNode l2r1=new TreeNode();l2r1.val=2;
		TreeNode l2r2=new TreeNode();l2r2.val=11;
	
		TreeNode l3l1=new TreeNode();l3l1.val=3;
		TreeNode l3r1=new TreeNode();l3r1.val=-2;
		TreeNode l3r2=new TreeNode();l3r2.val=1;
		
		root.left=l1l1;root.right=l1r1;
		
		l1l1.left=l2l1;l1l1.right=l2r1;
		
		l1r1.right=l2r2;
		
		l2l1.left=l3l1;l2l1.right=l3r1;
		
		l2r1.right=l3r2;
		
		System.out.println(new SimpleJavaDFS().pathSum(root, 8));
		
		
	}

}
