package leetcode;

public class IntersectionOfTwoLinkedLists {
	
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        
		  if(headA == null || headB ==null){
	            
	            return null;
	        }
	        
	        ListNode tempHeadA=headA;
	        ListNode tempHeadB=headB;
	        
	        while(tempHeadA != tempHeadB){
	            
	            tempHeadA = tempHeadA==null ? headB : tempHeadA.next;
	            tempHeadB = tempHeadB==null ? headA : tempHeadB.next;
	                
	        }
	        
	        return tempHeadA;
	    }

	public static void main(String[] args) {
		
		ListNode headA =  new ListNode(); 
		headA.val = 4;
		
		ListNode headA2 =  new ListNode(); headA2.val=1;
		ListNode headAB8 =  new ListNode(); headAB8.val=8;
		ListNode headAB4 =  new ListNode(); headAB4.val=4;
		ListNode headAB5 =  new ListNode(); headAB5.val=5;
		
		headA.next=headA2;
		headA2.next=headAB8;
		headAB8.next=headAB4;
		headAB4.next=headAB5;
		
		ListNode headB = new ListNode();
		headB.val =5;
		ListNode headB2 = new ListNode();headB2.val=6;
		ListNode headB3 = new ListNode();headB3.val=1;
		headB.next=headB2;
		headB2.next=headB3;
		headB3.next=headAB8;
		ListNode res =new IntersectionOfTwoLinkedLists().getIntersectionNode(headA, headB);
		
		System.out.println("Intersection at"+  res==null? res.val:"Null");
	}

}
