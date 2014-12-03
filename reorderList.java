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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return ;
        }
        ListNode mid = findMiddle(head);
        ListNode right = reverse(mid.next);
        mid.next = null;
        merge(head,right);
    }
    public static ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static ListNode reverse(ListNode head){
        ListNode end = null;
        while(head != null){
            ListNode next = head.next;
            head.next = end;
            end = head;
            head =next;
        }
        return end;
    }
    public static ListNode merge(ListNode first,ListNode last){
        ListNode result = new ListNode(-1);
        int index = 0;
        ListNode move = result;
        while(first != null && last != null){
            if(index%2 == 0){
            move.next = first;
            first = first.next;
            }else{
            move.next = last;
            last = last.next;
            }
            index++;
            move = move.next;
        }
        if(first != null){
            move.next = first;
        }
        if(last != null){
            move.next = last;
        }
        return result.next;
    }
}