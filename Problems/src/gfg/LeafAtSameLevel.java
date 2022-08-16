package gfg;

import java.util.HashSet;
import java.util.Set;

public class LeafAtSameLevel {

	boolean check(Node root){
		HashSet<Integer> set = new HashSet<>();
		checkAllLeaf(root, 0, set);
		return set.size()>1;
    }
	
	
	private void checkAllLeaf(Node root, int i,  HashSet<Integer> set) {
		
		if(root != null) {
			if(root.left == null && root.right == null) {
				set.add(i);
				if(set.size()>1) {
					return;
				}
			}else {
				checkAllLeaf(root.left, i+1, set); 
				checkAllLeaf(root.right, i+1, set);
			}
		}
	
	}


	public static void main(String[] args) {
		
		

	}

}
