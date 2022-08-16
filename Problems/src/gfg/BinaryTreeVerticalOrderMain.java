package gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class BinaryTreeVerticalOrder {
	
	
	//Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        verticalOrder(root, 0, map);
        for(Integer k: map.keySet()){
            //System.out.println(map.get(k));
            for(int e: map.get(k)){
                res.add(e);
            }
        }
        return res;
    }
    
    static void verticalOrder(Node root, int level, Map<Integer, ArrayList<Integer>> map){
        if(root!=null){
            if(map.get(level) != null){
                ArrayList<Integer> oldList = map.get(level);
                oldList.add(root.data);                     
            }else{
                ArrayList<Integer> newList = new ArrayList<Integer>();
                newList.add(root.data);
                map.put(level, newList);
            }
            if(root.left != null) verticalOrder(root.left, level-1, map);
            if(root.right != null) verticalOrder(root.right, level+1, map);
        }
        
    }	
}



public class BinaryTreeVerticalOrderMain {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	    	BinaryTreeVerticalOrder obj = new BinaryTreeVerticalOrder();
                ArrayList <Integer> res = obj.verticalOrder(root);
                for (Integer num : res) System.out.print(num + " "); 
                System.out.println();
    	        
	        }
	}
}
