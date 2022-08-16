package gfg.heap;

import java.util.LinkedList;
import java.util.Queue;

public class IsBinaryTreeHeap {

	boolean isHeap(Node2 tree) {
		
		if(isCompleteTree(tree)) {
			return checkMaxHeap(tree);
		}
		
		return false;
		
    }
	
	
	boolean checkMaxHeap(Node2 tree) {
		if(tree == null) {
			return false;
		}
		Queue<Node2> queue= new LinkedList<>();
		queue.add(tree);
		

		boolean queueNotEmpty = !isQueueEmpty(queue);
		boolean maxHeap = true;
		
		while(queueNotEmpty) {
			Node2 node= queue.poll();
			
			if(node!=null) {
				if(node.right != null) { 
					if(node.right.data > node.data) {
						maxHeap=false;
						break;
					}else {
						queue.add(node.right);
					}
				}
				
				if(node.left != null) { 
					if(node.left.data > node.data) {
						maxHeap=false;
						break;
					}else {
						queue.add(node.left);
					}
				}
			}
			queueNotEmpty=!isQueueEmpty(queue);
		}
			
		return maxHeap;	
	}
	
	
	
	
	boolean isCompleteTree(Node2 tree) {
		
		if(tree == null) {
			return false;
		}
		Queue<Node2> queue= new LinkedList<>();
		queue.add(tree);
		
		boolean queueNotEmpty = !isQueueEmpty(queue);
		boolean foundLastParent = false;
		
		while(queueNotEmpty) {
			
			Node2 node = queue.poll();
			if(foundLastParent && (node.left!= null || node.right !=null)) {
				return false;
			}else {
				
				if(checkLeftChild(node)) {
					foundLastParent=true;
				}else {
					queue.add(node.left);
				}
				
				if(checkRightChild(node)) {
					foundLastParent=true;
				}else {
					if(foundLastParent) {
						return false;
					}
					queue.add(node.right);
				}
				
			}
			
			queueNotEmpty = !isQueueEmpty(queue);
		}
		return true;
	}
	
	boolean isQueueEmpty(Queue<Node2> queue) {
		return queue.isEmpty();
	}

	boolean checkRightChild(Node2 node){
	 return node.right == null;	
	}
	
	
    boolean checkLeftChild(Node2 node){
    	return node.left == null;
	}
	
	public static void main(String[] args) {
		Node2 root = new Node2(10);
		
		Node2 ch11 = new Node2(20);
		Node2 ch12 = new Node2(30);
		
		Node2 ch21 = new Node2(40);
		Node2 ch22 = new Node2(60);
		
		root.left=ch11; root.right = ch12;
		
		ch11.left=ch21;
		ch11.right=ch22;
		
		System.out.println(new IsBinaryTreeHeap().isHeap(root));
		
	}

}


class Node2{
    int data;
    Node2 left,right;
    Node2(int d){
        data=d;
        left=right=null;
    }
}