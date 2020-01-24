package practice;

import java.util.Random;

public class LinkedListRandomNode {

	ListNode list;
	int size=0;
	
	public LinkedListRandomNode(ListNode head) {
		list=head;
		
		while(list.next != null) {
			size++;
		}
	}

	public int getRandom() {
		Random r= new Random();
		int i= r.nextInt(size)+1;
		while(i>0) {
			list=list.next;
		}
		
		return list.val;
	}

	public static void main(String[] args) {
	

	}

}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}