package practice;

public class ListSort {

	Node sortList(Node start) {
		
		
		
		
		return null;
	}
	
	public static void main(String[] args) {
		
		Node node1 = new Node(0);
		Node node2 = new Node(23);
		Node node3 = new Node(26);
		Node node4 = new Node(27);
		Node node5 = new Node(-90);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		

	}

}


class Node{
	Node(){}
	
	Node(int val){
		this.val=val;
	}
	public int val;
	public Node next;
}
