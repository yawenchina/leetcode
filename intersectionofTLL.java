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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = 0;
        int b = 0;
        if(headA == null || headB == null){
            return null;
        }
        ListNode A = headA;
        ListNode B = headB;
        while(headA != null){
            headA = headA.next;
            a++;
        }
        while(headB != null){
            headB = headB.next;
            b++;
        }
        int value = a-b;
        if(value < 0){
            while(value < 0){
                B = B.next;
                value++;
            }
        }else if(value > 0){
             while(value > 0){
                A = A.next;
                value--;
            }
        }
        
        while(A != null &&A != B){
           
            A = A.next;
            B = B.next;
        }
        if(A != null){
            return A;
        }else{
            return null;
        }
    }
}