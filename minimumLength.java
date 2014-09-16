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
    public int minDepth(TreeNode root) {
        int depth = 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if (root == null ){
            return depth;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode temp =q.poll();
            if(temp == null){
                depth++;
                q.offer(null);
            }else{
                if(temp.left == null && temp.right == null){
                    return depth+1;
                }
                if(temp.left != null){
                    q.offer(temp.left);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }
            }
            
        }
        return depth;
        
        
        
    }
    
}