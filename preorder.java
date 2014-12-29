/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
   
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        ArrayList<Integer> array = new ArrayList<Integer>();
        if(root == null){
            return array;
        }
        s.push(root);
        while(!s.isEmpty()){
            TreeNode temp = s.pop();
            if(temp.right != null){
                s.push(temp.right);
            }
            if(temp.left != null){
                s.push(temp.left);
            }
            array.add(temp.val);
        }
        return array;
    }
}