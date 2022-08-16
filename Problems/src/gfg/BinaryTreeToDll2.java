package gfg;

public class BinaryTreeToDll2 {

	Node head;
	
	Node bToDLL(Node root){
		
		if(root==null) return null;
		
		bToDLL(root.right);
		
		root.right = head;
		
		if(head!=null) head.left = root;
		
		head=root;
		
		bToDLL(root.left);
		
		return head;
	}
	
	Node bToDLL2(Node root){
		
		if(root==null) return null;
		
		bToDLL(root.left);
		
		root.left = head;
		
		if(head!=null) head.right = root;
		
		head=root;
		
		bToDLL(root.right);
		
		return head;
	}
	
	public static void main(String[] args) {

	}

}
