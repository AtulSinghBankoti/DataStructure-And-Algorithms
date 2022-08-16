package gfg.heap;

import java.util.*;

public class MergeKSortedLinkedLists {
	
	 Node mergeKList(Node[]arr,int K){
		 
 PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		 
		 for(int i=0; i<arr.length; i++) {
			 Node t= arr[i];
			 while(t!=null) {
				pq.add(t.data);
				t=t.next;
			 }
		 }
		 
		 //System.out.println(pq.toString());
		 
		 Node res = null;
		 Node res2= null;
		 while(!pq.isEmpty()) {
			 int n = pq.poll();
			 if(res == null) {
				 res = new Node(n);
				 res2=res;
			 }else {
				 res.next = new Node(n);
				 res=res.next;
			 }
			 
		 }
		 
		return res2;  
	 }

	public static void main(String[] args) {
		
		//K = 4
		// = {{1,2,3},{4 5},{5 6},{7,8}}
		
		Node [] arr = new Node[4];
		Node n1 = new Node(1);
		n1.next=new Node(2);
		n1.next.next = new Node(3);
		arr[0] = n1;
		
		Node n2 = new Node(4);
		n2.next=new Node(5);
		arr[1] = n2;
		
		Node n3 = new Node(5);
		n3.next=new Node(6);
		arr[2] = n3;
		
		Node n4 = new Node(7);
		n4.next=new Node(8);
		arr[3] = n4;
				
		Node res = new MergeKSortedLinkedLists().mergeKList(arr, 4);
		System.out.println(res);
	}

}

class Node implements Comparable<Node>
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }

	@Override
	public int compareTo(Node o) {
		return this.data>o.data ? 1:-1;
	}
}