package gfg;

class Node{
	int data;
	Node left;
	Node right;
		
	public Node(int data) {
		super();
		this.data = data;
	}

	public Node(int data, Node left, Node right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
}

public class CheckForBst {
	
	 boolean isBST(Node root){
		 if(root == null)
			 return true;
		return isBSTUtil(root,root.data-1, Integer.MAX_VALUE);
	 }
	 
	 boolean isBSTUtil(Node root, int min, int max) {
		 if(root != null) {
			 
	        if(root.left!=null && root.right!=null){ 
	          if(root.left.data<root.data && root.right.data>root.data && root.right.data < max){
	            return isBSTUtil(root.left,Integer.MIN_VALUE, root.data) && isBSTUtil(root.right,root.data, Integer.MAX_VALUE);
	          }else{
	              return false;
	          }
	        }else if(root.left!=null){
	            if(root.left.data<root.data){
	                return isBSTUtil(root.left,Integer.MIN_VALUE, root.data);
	            }else{
	                return false;
	            }
	        }else if(root.right != null){
	            if(root.right.data>root.data && root.right.data<max){
	                return isBSTUtil(root.right, root.data, Integer.MAX_VALUE);
	            }else{
	                return false;
	            }
	        }else{
	            return true;
	        }
		 }
		 
		 return true;
	 }

	public static void main(String[] args) {
		System.out.println(new CheckForBst().isBST(new Node(2, new Node(1), new Node(3))));

	}

}
