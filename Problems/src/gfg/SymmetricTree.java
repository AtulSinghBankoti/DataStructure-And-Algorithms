package gfg;

public class SymmetricTree {
	
	public static boolean isSymmetric(Node root){
		if(root==null) return true;
		return compareLeftRightTree(root.left, root.right);
    }

	static boolean compareLeftRightTree(Node left, Node right){
		
		if(left == null && right == null) {
			return true;
		}
		
		if((left == null && right != null) || (right == null && left != null)) {
			return false;
		}
		
		return (left.data == right.data) && compareLeftRightTree(left.left, right.right) 
				&& compareLeftRightTree(left.right, right.left);
	}
	
	
	public static void main(String[] args) {
		
	}

}
