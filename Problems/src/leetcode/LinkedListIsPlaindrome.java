package leetcode;

public class LinkedListIsPlaindrome {

	public boolean isPalindrome(ListNode head) {
        if(head!= null){
        	ListNode slow = head;
        	ListNode fast = head;
        	
        	while(fast!= null) {
        		slow = slow.next;
        		fast = fast.next.next;
        	}
        	
        	slow=reverseList(slow);
        	ListNode start = head;
        	
        	boolean flag= true;
        	while(start!=null && slow!=null) {
        		
        		if(start.val == slow.val) {
        			start=start.next;
        			slow=slow.next;
        			continue;
        		}else {
        			flag=false;
        			break;
        		}
        		
        	}
        	
        	return flag;
         
        }
    

        return false;
        
    }
	
	private ListNode reverseList(ListNode slow) {
		
		ListNode root = null;
		while(slow != null) {
			
			ListNode node = new ListNode();
			node.val=slow.val;
			node.next=root;
			root=node;
			slow=slow.next;
		}
			
		return root;
	}

	public static void main(String[] args) {
		LinkedListIsPlaindrome plaindrome = new LinkedListIsPlaindrome();
		ListNode node1 = new ListNode();
		node1.val=1;
		
		ListNode node2 = new ListNode();
		node2.val=2;

		/*
		ListNode node3 = new ListNode();
		node3.val=2;
		
		ListNode node4 = new ListNode();
		node4.val=1;
		*/
		
		node1.next = node2;
		/*
		node2.next = node3;
		node3.next = node4;
		*/
		/*
		ListNode res= new LinkedListIsPlaindrome().reverseList(node1);
		while(res!=null) {
			System.out.print(""+res.val);
			res=res.next;
		}*/
		System.out.println( new LinkedListIsPlaindrome().isPalindrome(node1));
		
		
	}

}
