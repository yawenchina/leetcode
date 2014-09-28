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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode result = head;
        ListNode one = head;
        ListNode move = one.next;
        while(move != null){
            if(one.val != move.val){
                one.next = move;
                one = one.next;
                
            }
            move = move.next;
        }
        one.next = null;
        return result;
    }
}