package dsAlgo;

public class SingleLinkedListDemo {

	Node head=new Node(0,null);
	
	
	
	public void insertNode(Node node){
		Node tmpNode=head.getNextNode();
		if(tmpNode==null){
			head.setNextNode(node);
		}else{
			while(tmpNode.getNextNode()!=null){
				tmpNode=tmpNode.getNextNode();
			}
			tmpNode.setNextNode(node);
		}
		node.setNextNode(null);
	}
	
	public void deleteNode(int n){
		Node node=head;
		Node prevNode=null;
		while(n--!=0){
			prevNode=node;
			node=node.getNextNode();
		}
		if(node.getNextNode()==null){
			prevNode.setNextNode(null);
		}else{
			prevNode.setNextNode(node.getNextNode());
		}
	}
	
	public void forwardTraversal(Node node){
		if(node!=null){
			System.out.print(" "+node.getData());
			forwardTraversal(node.getNextNode());
		}
	}
	

	public void reverseTraversal(Node node){
		if(node!=null){
			reverseTraversal(node.getNextNode());
			System.out.print(" "+node.getData());
		}
	}
	
	
	public void reverseList(Node prevNode, Node currentNode){
		if(currentNode!=null){
			 reverseList(currentNode, currentNode.getNextNode());
			 currentNode.setNextNode(prevNode);
			 
		}else{
			head.setNextNode(prevNode);
		}
	}

	public static void main(String[] args) {
		SingleLinkedListDemo listDemo=new SingleLinkedListDemo();   
		Node node1=new Node(1, null);
		Node node2=new Node(2, null);
		Node node3=new Node(3, null);
		Node node4=new Node(4, null);
		Node node5=new Node(5, null);
		listDemo.insertNode(node1);
		listDemo.insertNode(node2);
		listDemo.insertNode(node3);
		listDemo.insertNode(node4);
		listDemo.insertNode(node5);
		listDemo.deleteNode(3);
		listDemo.forwardTraversal(listDemo.head.getNextNode());
		System.out.println();
		listDemo.reverseTraversal(listDemo.head.getNextNode());
		listDemo.reverseList(null, listDemo.head.getNextNode());
		System.out.println();
		listDemo.forwardTraversal(listDemo.head.getNextNode());
	}

}

class Node{
	private int data;
 	private Node nextNode;
 	public Node(int data, Node nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}
