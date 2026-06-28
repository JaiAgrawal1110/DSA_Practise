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
        ListNode fast=headA;
        ListNode slow=headB;
        int len1=0;
        int len2=0;

        while(fast!=null){
            fast=fast.next;
            len1++;
        }
        while(slow!=null){
            slow=slow.next;
            len2++;
        }
        fast=headA;
        slow=headB;

        if(len1>=len2){
            for(int i=0;i<len1-len2;i++){
                fast=fast.next;
            }
        }
        if(len1<len2){
            for(int i=0;i<len2-len1;i++){
                slow=slow.next;
            }

        }
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;

        }

    return slow;


        
    }
}
