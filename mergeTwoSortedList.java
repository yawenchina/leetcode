/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode one = dummy;
        while(l1 != null && l2 != null){
            int data = (l1.val < l2.val) ?  l1.val : l2.val;
            if(l1.val < l2.val){
                l1 = l1.next;
            }else{
                l2 = l2.next;
            }
            one.next = new ListNode(data);
            one = one.next;
            one.next = null;
            
        }
        if(l1 != null){
            one.next = l1;
        }
        if(l2 != null){
            one.next = l2;
        }
        return dummy.next;
    }
}