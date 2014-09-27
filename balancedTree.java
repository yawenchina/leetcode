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
    public boolean isBalanced(TreeNode root) {
      if(root == null){
          return true;
      }
      
      return getHeight(root) != -1;
    }
    public int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int m = getHeight(root.right);
      int n = getHeight(root.left);
      if(Math.abs(m-n) > 1 || m == -1 ||n == -1){
          return -1;
      }
        return Math.max(m,n)+1;
    }
}