/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = findMiddle(head);

        ListNode right = sortList(mid.next);
        //the left part and the right part must be sorted!!!
        mid.next = null;
        ListNode left = sortList(head);

        return merge(left, right);
    }
    public ListNode merge(ListNode head, ListNode second){
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        while(head != null && second != null){
            if(head.val < second.val){
                dummy.next = head;
                head = head.next;
            }else{
                dummy.next = second;
                second =second.next;
            }
            dummy = dummy.next;
            dummy.next = null;
            //this sentence is not neccessary!!
        }
        if(head != null){
            dummy.next = head;
        }
        if(second != null){
            dummy.next = second;
        }
        return result.next;
    }
    public ListNode findMiddle(ListNode head){
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow =slow.next;
        }
        return slow;
    }
}