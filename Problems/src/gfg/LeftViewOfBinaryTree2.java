package gfg;
import java.util.*;

public class LeftViewOfBinaryTree2 {
	
	ArrayList<Integer> leftView(Node root)
    {
        Map<Integer, Integer> map = new HashMap<>();
        visitLeft(root, map, 0);
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(Integer k: map.keySet()) {
        	res.add(map.get(k));
        }
        Collections.sort(res);
        return res;
    }
    
    void visitLeft(Node node, Map<Integer, Integer> map, int level){
        if(node != null){
            if(map.get(level) == null) {
            	map.put(level, node.data);
            }
            visitLeft(node.left, map, level+1);
            visitLeft(node.right, map, level+1);
        }
    }

	public static void main(String[] args) {
		

	}

}
