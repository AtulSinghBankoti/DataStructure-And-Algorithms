package gfg;

import java.util.*;

public class BoundaryTraversalOfBinaryTree {
	
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList <Integer> res = new ArrayList<>();
	    if(node==null)
	        return res;
	    leftB(node, res);
	    leafB(node.left, res);
	    leafB(node.right, res);
	    rightB(node.right, res);
	    return res;
	}
	
	void leftB(Node node,ArrayList <Integer> res){
	    if(node==null)
	        return;   
	    if(node.left== null && node.right==null)
	        return;
	    res.add(node.data);   
	    if(node.left != null){
	      leftB(node.left, res);
	    }else{
	      leftB(node.right, res);
	    }
	}
	
	void leafB(Node node,ArrayList <Integer> res){
	    if(node == null)
	        return;
	        
	   if(node.left == null && node.right==null){
	            res.add(node.data);
	            return;
	   }
	   leafB(node.left, res);
	   leafB(node.right, res);
	}
	
	void rightB(Node node,ArrayList <Integer> res){
	    if(node == null)
	        return;
	    if(node.right ==null && node.left==null)
	        return;
	        
	   if(node.right != null){
	         rightB(node.right, res);
	   }else{
	         rightB(node.left, res);
	   }
	   res.add(node.data);   
	}

	
	
	public static void main(String[] args) {
		System.out.println(new BoundaryTraversalOfBinaryTree().boundary(
				new Node(1, new Node(2, new Node(4, null, null), new Node(5, new Node(8, null, null), new Node(9, null, null))), new Node(3, new Node(6, null, null), new Node(7, null, null)))));
	}

}
