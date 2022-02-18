package leetcode;

/**
 * link: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * @author ADMIN
 *
 */

public class ConvertSortedArrayToBinarySearchTree {
	
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
		

	}

}
