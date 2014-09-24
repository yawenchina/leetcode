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
        if (head == null || head.next == null) {
            return;
        }
        ListNode mid = findMiddle(head);
        ListNode rev = reverse(mid.next);
        mid.next = null;
        merge(head,rev);
    }
    public ListNode findMiddle(ListNode head){
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode mid){
        ListNode rev = null;
        while(mid != null){
            ListNode temp = mid.next;
            mid.next = rev;
            rev = mid;
            mid = temp;
        }
        return rev;
    }
    public void merge(ListNode l1, ListNode l2){
        int index = 0;
        ListNode dummy = new ListNode(0);
        while(l1 != null && l2 != null){
            if(index%2 == 0){
                dummy.next = l1;
                l1 = l1.next;
            }else{
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
            index++;
        }
        if(l1 != null){
            dummy.next = l1;
        }
        if(l2 != null){
            dummy.next = l2;
        }
    }
}