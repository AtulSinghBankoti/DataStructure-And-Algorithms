package gfg;

public class MirrorTree {

	void mirror(Node node) {
        if(node != null) {
        	
        	mirror(node.left);
        	if(node.left == null && node.right == null) return;
        	
        	if(node.left != null && node.right != null) {
        		Node tmp = node.left;
        		node.left = node.right;
        		node.right = tmp;
        	}else {
        		if(node.left == null && node.right!= null) {
        			node.left = node.right;
        			node.right = null;
        		}else if(node.left != null && node.right == null) {
        			node.right = node.left;
        			node.left = null;
        		}
        	}
        	mirror(node.left);
        	
        }
    }
	
	
	public static void main(String[] args) {
		Node res = new Node(10, new Node(20, new Node(40), new Node(60)), new Node(30));
		new MirrorTree().mirror(res);
		System.out.println(res);
	}

}
