package gfg;

import java.util.*;

public class ZigzagTreeTraversal {

	
	ArrayList<Integer> zigZagTraversal(Node root){
		ArrayList<Integer> res = new ArrayList<Integer>();  
	     if(root == null) return res;
		
	     Queue<Node> q = new LinkedList<Node>();
	     q.add(root);
	     boolean lef2Right = true;
	     while(!q.isEmpty()) {
	    	 int size = q.size();
	    	 int tempArr[] = new int[size];
	    	 
	    	 for(int i=0; i<size; i++) {
	    		 Node n = q.poll();
	    		 int index = (lef2Right) ? i : size-i-1;
	    		 tempArr[index] = n.data;
	    		 if(n.left!=null) q.add(n.left);
	    		 if(n.right!=null) q.add(n.right);
	    	 }
	    	 
	    	 lef2Right =!lef2Right;
	    	 
	    	 for(int e:tempArr) {
	    		 res.add(e);
	    	 }
	     }
	     
		return res;
	 }
	
	public static void main(String[] args) {
		System.out.println(new ZigzagTreeTraversal().zigZagTraversal(new Node(3, new Node(2, null, null),new Node(1, null, null))));

	}

}
