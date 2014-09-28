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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(-1);
        ListNode big = new ListNode(-1);
        ListNode smove = small;
        ListNode bmove = big;
        while(head != null){
            int data = head.val;
            if(data < x){
                smove.next = new ListNode(data);
                smove = smove.next;
            }else{
                bmove.next = new ListNode(data);
                bmove = bmove.next;
            }
            head = head.next;
        }
    smove.next = big.next;
    return small.next;
    }
}