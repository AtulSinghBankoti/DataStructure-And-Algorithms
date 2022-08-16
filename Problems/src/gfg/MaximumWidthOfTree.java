package gfg;
import java.util.*;

public class MaximumWidthOfTree {

	
	int getMaxWidth(Node root) {
		Map<Integer, Integer> map = new HashMap<>();
		traverse(root, 0, map);
		int res = 0;
		for(int e: map.keySet()) {
			if(map.get(e)> res){
				res=map.get(e);
			}
		}
		
		return res;
	}
	
	private void traverse(Node root, int level, Map<Integer, Integer> map) {
		if(root != null) {
			
			traverse(root.left, level+1, map);
			
			if(map.containsKey(level)) {
				map.put(level, map.get(level)+1);
			}else {
				map.put(level, 1);
			}
			
			traverse(root.right, level+1, map);
			
		}
	}

	public static void main(String[] args) {

	}

}
