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
              ListNode pre = dummy ;
             
             while(pre.next != null && pre.next.val < head.val){
                 pre = pre.next;
             }
             ListNode temp = head.next;
             head.next = pre.next;
             pre.next = head;
             head = pre;
         }
         return dummy.next;
        
          

    }
}