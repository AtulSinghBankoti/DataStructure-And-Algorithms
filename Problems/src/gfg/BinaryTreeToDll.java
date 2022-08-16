package gfg;

import java.util.LinkedList;

public class BinaryTreeToDll {
	
	
	
	Node bToDLL(Node root){
		
		if(root == null) return null;
		LinkedList<Node> list = new LinkedList<>();
		constructDList(root, list);
		
		Node front=null;
		Node rear=null;
		
		for(Node e: list) {
			if(front == null) {
				front = e;
				rear = e;
			}else {
				rear.right=e;
				e.left=rear;
				rear=rear.right;
			}
		}
		
		return front;
    }
	

	private void constructDList(Node root, LinkedList<Node> list) {
		if(root!=null) {
			constructDList(root.left, list);
			list.add(new Node(root.data));
			constructDList(root.right, list);
		}
	}

	public static void main(String[] args) {
		Node res=new BinaryTreeToDll().bToDLL(new Node(1, new Node(3), new Node(2)));
		System.out.println(res);
	}

}
