package leetcode;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.NodeList;

/**
 * Problem Link: https://leetcode.com/problems/add-two-numbers/
 * 
 */

public class AddTwoNumbers {

	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		String s1="";
		String s2="";

		while(l1 != null ) {
			s1+=l1.val;
			l1=l1.next;
		}

		while(l2 != null ) {
			s2+=l2.val;
			l2=l2.next;
		}

		s1= new StringBuilder(s1).reverse().toString();
		s2= new StringBuilder(s2).reverse().toString();

		ListNode root = null; 
		ListNode p = null; 
		if(s1.length()> s2.length()) {
			int j=s2.length()-1;
			int rem = 0;
			for(int i=s1.length()-1; i>=0; i--) {
				ListNode node = new ListNode(i);
				int v=0;
				if(j>=0) {
					v= rem+Integer.parseInt(""+s1.charAt(i))+ Integer.parseInt(""+s2.charAt(j));
					rem=v/10;
					j--;
				}else {
					v = rem+ Integer.parseInt(""+s1.charAt(i));
					rem=v/10;
				}
				node.val=v%10;
				
				if(root == null) {
					root = node;
					p= node;
				}else {
					p.next=node;
					p=p.next;
				}
			}
			
			if(rem != 0) {
				ListNode node = new ListNode();
				node.val=rem;
				if(root == null) {
					root = node;
					p= node;
				}else {
					p.next=node;
					p=p.next;
				}
			}

		}else {
			int j=s1.length()-1;
			int rem = 0;
			for(int i=s2.length()-1; i>=0; i--) {
				ListNode node = new ListNode();
				int v=0;
				if(j>=0) {
					v= rem+ (Integer.parseInt(""+s1.charAt(j)) + Integer.parseInt(""+s2.charAt(i)));
					rem=v/10;
					j--;
				}else {
					v = rem+Integer.parseInt(""+s2.charAt(i));
					rem=v/10;
				}
				node.val=v%10;
				if(root == null) {
					root = node;
					p= node;
				}else {
					p.next=node;
					p=p.next;
				}
				
			}
			
			if(rem != 0) {
				ListNode node = new ListNode();
				node.val=rem;
				if(root == null) {
					root = node;
					p= node;
				}else {
					p.next=node;
					p=p.next;
				}
			}
		}

		


		return root;
	}


	public static void main(String[] args) {
		/*ListNode res=new AddTwoNumbers().addTwoNumbers(new ListNode(2,new ListNode(4, new ListNode(3, null))), 
				new ListNode(5, new ListNode(6, new ListNode(4, null))));*/
		/*ListNode res=new AddTwoNumbers().addTwoNumbers(new ListNode(9, null),new ListNode(1, new ListNode(9, new ListNode(9, 
				new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, 
						new ListNode(9, new ListNode(9, new ListNode(9, null)))))))))));*/
				//[1,9,9,9,9,9,9,9,9,9]
		
		/*ListNode res=new AddTwoNumbers().addTwoNumbers(new ListNode(9,new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null))))))), 
				new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null)))));*/
		/*ListNode res=new AddTwoNumbers().addTwoNumbers(new ListNode(2,new ListNode(4, new ListNode(9, null))), 
				new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9, null)))));*/
		
		ListNode res=new AddTwoNumbers().addTwoNumbers(new ListNode(9,new ListNode(9, new ListNode(1, null))), 
				new ListNode(1, null));
		while(res != null) {
			if(res.val==0) {
				System.out.print("0");
			}else {
				System.out.print(res.val);
			}
			System.out.print(" ");
			res=res.next;
		}

	}

}
