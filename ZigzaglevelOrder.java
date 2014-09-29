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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
       ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (root == null) {
            return result;
        }
        boolean reverse = false;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            temp.clear();
            for(int i = 0; i < size ;i++){
                TreeNode m = q.poll();
                temp.add(m.val);
                if(m.left != null){
                    q.add(m.left);
                }
                if(m.right != null){
                    q.add(m.right);
                }
            }
             ArrayList<Integer> m = new ArrayList<Integer>();
            if(reverse){
               
                for(int i = temp.size()-1 ; i >= 0; i--){
                    m.add(temp.get(i));
                }
                
            }else{
                
                m = new ArrayList<Integer>(temp);
            }
                reverse = !reverse;
            result.add(new ArrayList<Integer>(m));
        }
        return result;
    }
}