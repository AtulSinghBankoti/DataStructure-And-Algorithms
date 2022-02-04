package leetcode;

/**
 * @author ADMIN
 * link: https://leetcode.com/problems/merge-two-sorted-lists/
 */

class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }


public class MergeTwoSortedLists {
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	    
		ListNode res = new ListNode();
		ListNode resTemp = res;
		
		if(list1 == null && list2 == null) {
			return null;
		}
		
		while(list1 != null && list2 != null) {
			if(list1.val < list2.val) {
				resTemp.val=list1.val;
				list1=list1.next;
			}else {
				resTemp.val=list2.val;
				list2=list2.next;
			}
			if(list1 !=null || list2 != null) {
				resTemp.next=new ListNode();
				resTemp=resTemp.next;
			}
		}
		
		while(list1!=null) {
			resTemp.val=list1.val;
			list1=list1.next;
			
			if(list1 != null) {
				resTemp.next=new ListNode();
				resTemp=resTemp.next;
			}
			
			
		}
		
		
		while(list2!=null) {
			resTemp.val=list2.val;
			list2=list2.next;
			
			if(list2 != null) {
				resTemp.next=new ListNode();
				resTemp=resTemp.next;
			}
		}
	
	
	   return res;
		}

	public static void main(String[] args) {
		//Input: list1 = [1,2,4], list2 = [1,3,4]
				
		ListNode  list1 =new ListNode(1, new ListNode(2, new ListNode(4, null)));
		
		ListNode  list2 =new ListNode(1, new ListNode(3, new ListNode(4, null)));
		
		ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);
		
		while(result!=null) {
			System.out.print(" "+result.val);
			result=result.next;
		}
		
	}

}
