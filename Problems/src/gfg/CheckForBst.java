package gfg;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.NotationDeclaration;
import javax.xml.stream.events.StartElement;

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
	
	/*
	 boolean isBST2(Node root){
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
	 }*/

	    //Function to check whether a Binary Tree is BST or not.
	    boolean isBST(Node root){
	        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	    }
	    
	    
	   boolean checkBST(Node root, int min, int max){
	       
		   if(root == null) {
			   return true;
		   }
		   
		   if(root.data < min ||  root.data > max) {
			   return false;
		   }
		   
		   return checkBST(root.left , min, root.data-1) &&
				   checkBST(root.right , root.data+1 , max);
		   
	    }
	 
	 
	public static void main(String[] args) {
		//System.out.println(new CheckForBst().isBST(new Node(2, new Node(1), new Node(3))));
		System.out.println(new CheckForBst().isBST(new Node(3, new Node(1, null, new Node(2)), 
				new Node(5, new Node(4), new Node(8, new Node(7, new Node(6), null), null)))));
		//System.out.println(new CheckForBst().isBST(new Node(2, new Node(1), new Node(3))));
	}

}
