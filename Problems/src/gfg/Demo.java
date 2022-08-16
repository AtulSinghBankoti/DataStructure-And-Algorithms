package gfg;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public class Demo {
	
	
	 //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
        Map<Integer, Vector<Integer>> map = new TreeMap<>();
        
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        
        Vector<Integer> newList = new Vector<>();
        newList.add(root.data);
        map.put(0, newList);
        verticalOrder(root.left, -1 , map);
        verticalOrder(root.right, 1 , map);
        for(Entry<Integer, Vector<Integer>> entry: map.entrySet())
        {
            System.out.println(entry.getValue());
        }
        return res;
    }
    
    static void verticalOrder(Node root,int level, Map<Integer, Vector<Integer>> map){
    	// Base case
        if(root == null)
            return;
         
        //get the vector list at 'hd'
        Vector<Integer> get =  map.get(level);
         
        // Store current node in map 'm'
        if(get == null)
        {
            get = new Vector<>();
            get.add(root.data);
        }
        else
            get.add(root.data);
         
        map.put(level, get);
         
        // Store nodes in left subtree
        verticalOrder(root.left, level-1, map);
         
        // Store nodes in right subtree
        verticalOrder(root.right, level+1, map);

        
    }	

	public static void main(String[] args) {
		Map<Integer, ArrayList<Integer>> map = new LinkedHashMap<>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(1);
		map.put(0, res);
		
		if(map.containsKey(0)) {
			System.out.println(map.get(0));
		}

	}

}
