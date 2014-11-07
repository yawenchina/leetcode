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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int i = 0;
        for(int value : inorder){
            map.put(value, i);
            i++;
        }
        return buildSubTree(postorder, inorder.length-1, map, 0, inorder.length-1);
        
    }
    public TreeNode buildSubTree(int[] postorder, int cur, HashMap<Integer, Integer> inorder, int start, int end){
        
            if(start > end) return null;
            int val = postorder[cur];  
   TreeNode root = new TreeNode(val);  
   int mid = inorder.get(val);  
   // read postorder values backwards  
   root.left = buildSubTree(postorder,  cur-(end-mid)-1, inorder,start, mid-1);  
   root.right = buildSubTree(postorder,  cur-1, inorder,mid+1, end);  

   return root;  
    }
}