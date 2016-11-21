package niuke_java;

public class Test18_Mirror {
	public void Mirror(TreeNode root) {
		if(root == null) return;
		TreeNode tmp = null;
		tmp = root.right;
		root.right = root.left;
		root.left = tmp;
		if(root.left != null) {
			Mirror(root.left);
		}
		if(root.right != null) {
			Mirror(root.right);
		}
	}

}
