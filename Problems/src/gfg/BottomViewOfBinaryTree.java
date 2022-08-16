package gfg;

import java.util.*;

class CNode{
	int height;
	int data;
	public CNode(int height, int data) {
		super();
		this.height = height;
		this.data = data;
	}
	
}

public class BottomViewOfBinaryTree {

	TreeMap<Integer, CNode> map = new TreeMap<>();
	
	public ArrayList<Integer> bottomView(Node root){
	
		if(root == null) return null;
		
		//traverse tree
		travese(root, 0, 0);
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(java.util.Map.Entry<Integer, CNode> entry: map.entrySet()) {
				res.add(entry.getValue().data);
		}
		
	    return res;    
	}
	
	private void travese(Node root, int level, int ht) {
		
		if(root!=null) {
				
			//traverse left subtree
			travese(root.left, level-1, ht+1);
			
			//insert current node in map
			if(map.containsKey(level) ) {
				if(map.get(level).height<=ht)
					map.put(level, new CNode(ht, root.data));
			}else {
				map.put(level, new CNode(ht, root.data));
			}
			
				
			//traverse right subtree
			travese(root.right, level+1, ht+1);
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(new BottomViewOfBinaryTree()
				.bottomView(new Node(20, new Node(8, new Node(5), 
						new Node(3, new Node(10), new Node(14))), 
						new Node(22, null, new Node(25)))));
	}

}
