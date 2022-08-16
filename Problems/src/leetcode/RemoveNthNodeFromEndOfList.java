package leetcode;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode start = new ListNode(0);

    	
    	ListNode fast = start;
    	ListNode slow = start;
    	slow.next =head;
    	
    	for(int i=1; i<=n+1; i++) {
    		fast = fast.next;
    	}
    	
    	
    	while(fast.next != null) {
    		fast = fast.next;
    		slow = slow.next;
    	}
    	
    	slow.next = slow.next.next;
    	
    	return start.next;
    }
   
	public static void main(String[] args) {
		ListNode head = new ListNode();
		head.val=1;
		ListNode res = new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 1);

		System.out.println(res);
		while(res!=null) {
			System.out.println(res.val);
			res=res.next;
		}

	}

}
