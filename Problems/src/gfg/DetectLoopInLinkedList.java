package gfg;

import java.util.HashMap;
import java.util.Map;

class Node2{
	int data;
	Node2 next;
	
	Node2(int x){
		data = x;
		next = null;
	}
	
}

public class DetectLoopInLinkedList {
	

	public static boolean detectLoop(Node2 head){
		 if(head != null){
	           Node2 slow = head;
	           Node2 fast = head;    
	            while(slow != null){
	                if(fast==null){
	                    return false;
	                }
	                fast=fast.next;
	                if(slow==fast){
	                    return true;
	                }
	                if(fast==null){
	                    return false;
	                }
	                fast=fast.next;
	                if(slow==fast){
	                    return true;
	                }
	                slow=slow.next;
	            }
	            return false;

	        }
	        
	        return true;
    }
	
	public static boolean detectLoop2(Node2 head){

		Map<Node2,Boolean> map = new HashMap<Node2, Boolean>();

		while(head!=null) {
			if(map.get(head)!=null) {
				return false;
			}else {
				map.put(head, true);
				head=head.next;
			}

		}

		return true;
	}
	
	public static void main(String[] args) {
		
	}
	
}
