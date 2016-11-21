package niuke_java;

public class Test17_HasSubTree {
	public boolean HasSubTree(TreeNode root1, TreeNode root2) {
		if(root1 == null || root2 == null)
			return false;
		return isSubTree(root1, root2) || HasSubTree(root1.left, root2) || HasSubTree(root1.right, root2);
	}
	
	public boolean isSubTree(TreeNode root1, TreeNode root2) {
		if(root2 == null) 
			return true;
		if(root1 == null)
			return false;
		if(root1.val == root2.val) {
			return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
		} else 
			return false;
	}

}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}