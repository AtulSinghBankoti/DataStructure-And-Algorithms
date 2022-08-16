package gfg;
import java.util.*;


public class BstToMaxHeap {
	
	static int c=0;
	 public static void convertToMaxHeapUtil(Node root)
	 {
		 List<Integer> list = new ArrayList<>();
		 inorder(root, list);
		 postorder(root, list);
	       
	  }
	 
	 

	private static void postorder(Node root, List<Integer> list) {
		if(root == null) {
			return;
		}
		
		postorder(root.left, list);
		postorder(root.right, list);
		root.data = list.get(c++);
	}


	private static void inorder(Node root, List<Integer> list) {
		if(root ==null) {
			return;
		}
		
		inorder(root.left, list);
		list.add(root.data);
		inorder(root.right, list);
	}



	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.add(3);
		pq.add(4);
		pq.add(56);
		Object arr[] =pq.toArray();
		int[] res= new int[arr.length];
		int i=0;
		for(Object e : arr) {
			res[i++]=(Integer)e;
		}
		
		//PriorityQueue<Node> pq = new PriorityQueue<Node>((n1, n2)-> n1.data>n2.data ? 1:0 );
	}

}
