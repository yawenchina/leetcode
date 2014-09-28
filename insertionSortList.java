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
    public ListNode insertionSortList(ListNode head) {
         ListNode dummy = new ListNode(0);
         while(head != null){
             ListNode list = dummy;
             int data = head.val;
             while(list.next != null && list.next.val < data){
                 list = list.next;
             }
             ListNode temp = list.next;
             list.next = new ListNode(data);
             list = list.next;
             list.next = temp;
             head = head.next;
            }
            return dummy.next;
    }
    
}