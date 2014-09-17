package practice1;

public class findAncestor {
	public static void main(String args[]){
		TreeNode  root = new TreeNode(10);
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(7);
		TreeNode t3  = new TreeNode(5);
		TreeNode t4 = new TreeNode(6);
		TreeNode t5 = new TreeNode(8);
		TreeNode t6 = new TreeNode(9);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t1.right = t4;
		t2.left = t5;
		t2.right = t6;
		if(find(root,t5,t6) ==  null){
			System.out.print("we can not find the ancestor");
		}
		System.out.print(find(root ,t5,t6).val);
	}
	public static TreeNode find(TreeNode root, TreeNode a,TreeNode b){
		if(root == null){
			return null;
		}
		if(root == a || root == b){
			return root;
		}
		TreeNode left = find(root.left,a,b);
		TreeNode right = find(root.right,a,b);
		if(left != null && right != null){
			return root;
		}else{
			return (left != null)? left : right;
		}
	}
}

