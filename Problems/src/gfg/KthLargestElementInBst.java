package gfg;

import java.util.TreeSet;

public class KthLargestElementInBst {

	
	 public int kthLargest(Node root,int K){ 
		 TreeSet<Integer> set = new TreeSet<Integer>((e1, e2)-> (e1>e2)?-1:1);
		 if(root == null) return 0;
		 inorder(root, set, K);
		 int c=1;
		 for(int i: set) {
			 if(c++==K) {
				 return i;
			 }
		 }
		 return 0;
	 }
	 
	 void inorder(Node root, TreeSet<Integer> set, int K){
		 if(root != null) {
			 inorder(root.right, set, K);
			 set.add(root.data);
			 if(set.size()==K) return; 
			 inorder(root.left, set, K);
		 }  
	 }
	
	public static void main(String[] args) {
		Node node = new Node(78, new Node(69, new Node(4, null, null), new Node(72, null, null)), new Node(80, new Node(79, null, null), null));
		System.out.println(new KthLargestElementInBst().kthLargest(node, 5));
	}

}
