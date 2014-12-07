/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null){
            return;
        }
        TreeLinkNode p = root;
        while(p != null){
            TreeLinkNode m = p;
            while(m != null){
                if(m.left != null){
                    if(m.right != null){
                        m.left.next = m.right;
                    }else{
                        m.left.next = getNext(m.next);
                    }
                }
                if(m.right != null){
                    m.right.next = getNext(m.next);
                }
                m = m.next;
            }
            p = getNext(p);
            //this is for update the layer!!!
        }
    }
    public TreeLinkNode getNext(TreeLinkNode parent){
        if(parent == null){
            return null;
        }
        if(parent.left != null){
            return parent.left;
        }
        if(parent.right != null){
            return parent.right;
        }
        return getNext(parent.next);
    }
}