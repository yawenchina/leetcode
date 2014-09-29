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
   
    public int sumNumbers(TreeNode root) {
        
          return dfs(root,0);
    }
    public int dfs(TreeNode root,int value){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return value*10+root.val;
        }
        return dfs(root.left,value*10+root.val)+dfs(root.right,value*10+root.val);
    }
}