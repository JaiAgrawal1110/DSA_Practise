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
    public ListNode detectCycle(ListNode head) {

        ListNode fast=head;
        ListNode slow=head;
        if(head==null)return null;
        if(head.next==null)return null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
                ListNode ptr=head;
            if(fast==slow ){
            while(ptr!=slow){
                ptr=ptr.next;
                slow=slow.next;
            }return ptr;
            }
        }
        return null;
            
        
    }
}