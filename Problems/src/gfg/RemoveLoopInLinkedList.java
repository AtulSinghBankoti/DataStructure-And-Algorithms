package gfg;

import java.util.HashSet;

class Nodee{
	
    int data;
    Nodee next;
}
public class RemoveLoopInLinkedList {

	
	/*
	public static void removeLoop(Nodee head){
        
        HashSet<Nodee> set = new HashSet<>();
       
        while(head != null){
            if(head.next != null && set.contains(head.next)) {
            	head.next=null;
            	break;
            }else {
            	set.add(head);
            	head=head.next;
            }
        } 
    }*/
	
	public static void removeLoop(Nodee head){
        
        Nodee p1;
        Nodee p2;
        
        boolean loop = false;
        Nodee loopPointer = null;
        
        Nodee tmp = head;
        
        while(tmp != null) {
        	if(head.next != null && head.next.next != null) {
        		p1=head.next;
        		p2=head.next.next;
        		if(p1 == p2) {
        			loop = true;
        			loopPointer = head;
        			break;
        		}
        	}else {
        		head = head.next;
        	}
        }
        
        if(loop) {
        	int lpc= 0;
        	
        	Nodee tmplp = loopPointer;
        	
        	while(tmplp!= loopPointer) {
        		lpc++;
        		tmplp = tmplp.next;
        	}
        	
        	Nodee tmplp2 = head;
        	int c=0;
        	while(c<lpc) {
        		tmplp2 = tmplp2.next;
        	}
        	
        	Nodee headT = head;
        	while(headT != tmplp2) {
        		headT = headT.next;
        		tmplp2 = tmplp2.next;
        	}
        	
        	Nodee ht= head;
        	while(ht!=null) {
        		if(ht.next==headT) {
        			ht.next=null;
        		}
        		
        	}
        	
        }
       
       
    }
	
	
	
	
	public static void main(String[] args) {
		
		

	}

}
