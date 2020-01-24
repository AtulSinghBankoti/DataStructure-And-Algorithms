package practice;

/*
 * link: https://leetcode.com/problems/same-tree/
 * Complexity: O(n)
 * 
 */

public class SameTree {

	
	public boolean isSameTree(TreeNodee p, TreeNodee q) {
        
        if((p==null && q!=null) || (p!=null && q==null)) {
			return false;
		}else {
            if(p==q){
                return true;
            }else if(p.val !=q.val) {
				return false;
			}

			return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
		}
    }
	
	public static void main(String[] args) {
	

	}

}

class TreeNodee {
	int val; 
	TreeNodee left; 
	TreeNodee right; 
	
	TreeNodee(int x) { 
		val = x; 
	} 
}



 