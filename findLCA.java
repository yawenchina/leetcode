public static TreeNode findLCA(TreeNode root, TreeNode a, TreeNode b){
		if(root == null){r
			return null;
		}
		if(root == a || root == b){
			return root;
		}
		TreeNode A = findLCA(root.left, a, b);
		TreeNode B = findLCA(root.right, a,b);
		if(A ==null) return B;
		if(B == null) return A;
		if(A != B) return root;





}