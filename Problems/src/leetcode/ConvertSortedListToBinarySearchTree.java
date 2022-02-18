package leetcode;

import java.util.Arrays;

public class ConvertSortedListToBinarySearchTree {
	
	
	 public TreeNode sortedListToBST(ListNode head) {
		 int  l = 0;
		 ListNode t =head;
		 while(t!=null) {
			 t = t.next;
			 l++;
		 }
		 
		 if(l>0) {
			 int[] tmpArr = new int[l];
			 for(int i = 0; i<l; i++) {
				 tmpArr[i] = head.val;
				 head = head.next;
			 }
			 return sortedArrayToBST(tmpArr);
		 }else {
			 return null;
		 }
		 
	    }

	
	public TreeNode sortedArrayToBST(int[] nums) {
		return balance(0, nums.length-1, nums);
	}
	
	private TreeNode balance(int start, int end, int[] nums) {
		
		if(start <= end) {
			int mid = start+end/2;
			TreeNode root = new TreeNode(nums[mid]);
			root.left = balance(start,mid-1, nums);
			root.right = balance(mid+1, end, nums);
			return root;
		}else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		TreeNode res= new ConvertSortedListToBinarySearchTree().sortedListToBST(null);
		if(res!=null) {
		while(res != null) {
			System.out.println(res.val);
		}}else {
			System.out.println("null...");
		}
	}
	

}
