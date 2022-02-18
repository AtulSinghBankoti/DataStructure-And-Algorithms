package gfg;

import java.util.ArrayList;
import java.util.HashSet;

public class LeftViewOfBinaryTree {

	
	ArrayList<Integer> leftView(Node root){
		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		getLeftView(root, 0, set, res);
		return res;
	}
	
	private void getLeftView(Node root, int currLevel, HashSet<Integer> set, ArrayList<Integer> res) {
		
		if(root != null) {
			if(!set.contains(currLevel)) {
				res.add(root.data);
				set.add(currLevel);
			}
			
			getLeftView(root.left, currLevel+1, set, res);
			getLeftView(root.right, currLevel+1, set, res);
			
		}
		
	}

	public static void main(String[] args) {
		
	}

}
