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
    public TreeNode sortedArrayToBST(int[] num) {
        return doConvert(num, 0 , num.length-1);
    }
    public TreeNode doConvert(int[] num, int start, int end){
        int mid = start+(end-start)/2;
        if(end < start){
            return null;
        }
        TreeNode result = new TreeNode(num[mid]);
        result.left = doConvert(num, start,mid-1);
        result.right =doConvert(num, mid+1, end);
        return result;
    }
}