package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		//inorder(root, list);
		//iterative(root, list);
		iterativePreOrder(root, list);
		return list;
    }
	
	 public List<Integer> preorderTraversal(TreeNode root) {
		 List<Integer> list = new ArrayList<>();  
		 iterativePreOrder(root, list);
		return list;
	    }

	private void iterativePreOrder(TreeNode root, List<Integer> list) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			list.add(node.val);
			if(node.right != null)
				stack.add(node.right);
			if(node.left != null)
				stack.add(node.left);
		}
		
	}

	private void inorder(TreeNode root, List<Integer> list) {
		if(root!=null) {
			inorder(root.left, list);
			list.add(root.val);
			inorder(root.right, list);
		}
	}

	private void iterative(TreeNode root, List<Integer> list) {
		TreeNode curr = root;
		Stack<TreeNode> stack = new Stack<>();
		while(curr != null || !stack.isEmpty()) {
			
			while(curr!= null) {
				stack.push(curr);
				curr=curr.left;
			}
			curr= stack.pop();
			list.add(curr.val);
			curr=curr.right;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(new BinaryTreeInorderTraversal().inorderTraversal(
				new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))));

	}

}
