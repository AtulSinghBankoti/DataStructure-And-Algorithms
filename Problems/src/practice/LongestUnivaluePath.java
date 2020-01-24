package practice;

public class LongestUnivaluePath {
	
	int ans;
	
	int getPath(TreeNode node){
		
		if(node == null) {
			return 0;
		}
		
		int left = getPath(node.left);
		int right = getPath(node.right);
		
		int arrowLeft = 0, arrowRight = 0;
		
		if(node.left != null && node.left.val == node.val) {
			arrowLeft += left+1;
		}
		
		if(node.right != null && node.right.val == node.val) {
			arrowRight += right+1;
		}
		
		ans = Math.max(ans, arrowLeft + arrowRight);
		
		return Math.max(arrowLeft, arrowRight);
	}
	
	public int longestUnivaluePath(TreeNode root) {
		getPath(root);
		return ans;
    }
	
	
	
	
	
	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode(1);
		treeNode.left = new TreeNode(1);
		LongestUnivaluePath path =new LongestUnivaluePath();
		System.out.println(path.longestUnivaluePath(treeNode));
		
		
		

	} 

}
