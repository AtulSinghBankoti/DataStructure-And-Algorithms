package gfg;


//{ Driver Code Starts
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node6{
 int data;
 Node6 left;
 Node6 right;
 Node6(int data){
     this.data = data;
     left=null;
     right=null;
 }
}

public class AllNodesNoSibling {
 
 static Node6 buildTree(String str){
     
     if(str.length()==0 || str.charAt(0)=='N'){
         return null;
     }
     
     String ip[] = str.split(" ");
     // Create the root of the tree
     Node6 root = new Node6(Integer.parseInt(ip[0]));
     // Push the root to the queue
     
     Queue<Node6> queue = new LinkedList<>(); 
     
     queue.add(root);
     // Starting from the second element
     
     int i = 1;
     while(queue.size()>0 && i < ip.length) {
         
         // Get and remove the front of the queue
    	 Node6 currNode = queue.peek();
         queue.remove();
             
         // Get the current node's value from the string
         String currVal = ip[i];
             
         // If the left child is not null
         if(!currVal.equals("N")) {
                 
             // Create the left child for the current node
             currNode.left = new Node6(Integer.parseInt(currVal));
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
             currNode.right = new Node6(Integer.parseInt(currVal));
                 
             // Push it to the queue
             queue.add(currNode.right);
         }
         i++;
     }
     
     return root;
 }
 static void printInorder(Node6 root)
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
         Node6 root = buildTree(s);
         Tree g = new Tree();
         ArrayList<Integer> ans = g.noSibling(root);

         for (Integer val: ans) 
             System.out.print(val+" "); 
         System.out.println();
     }
 }
}// } Driver Code Ends


//User function Template for Java

/*  A Binary Tree nodea
class Node
{
 int data;
 Node left, right;

 Node(int item)
 {
     data = item;
     left = right = null;
 }
}
*/
class Tree
{
 ArrayList<Integer> noSibling(Node6 node)
 {
     
     Map<Integer, ArrayList<Integer>> map = new LinkedHashMap<>();
     ArrayList<Integer> res = new ArrayList<>();
     
     inorder(node.left, -1, map);
     inorder(node.right, +1, map);
     for(java.util.Map.Entry<Integer, ArrayList<Integer>> entry:map.entrySet()){
         ArrayList<Integer> tmpList = entry.getValue();
         if(tmpList.size()==1){
             res.addAll(tmpList);
             
         }
     }
     
     if(res.size()==0){
         res.add(-1);
     }
     
     return res;
 }
 
  void inorder(Node6 node, int level, Map<Integer, ArrayList<Integer>> map){
     
     if(node==null)return;
     
     ArrayList<Integer> tempList = map.get(level); 
     if(tempList == null){
         tempList = new ArrayList<>();
         tempList.add(node.data);
     }else{
         tempList.add(node.data);
     }
     map.put(level, tempList);
     inorder(node.left, level-1,map);
     inorder(node.right, level+1,map);
 }
 
 
}