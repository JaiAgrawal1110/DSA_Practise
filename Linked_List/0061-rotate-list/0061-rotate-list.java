/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

    if(head == null || head.next == null || k == 0)return head;
    ListNode fast=head;
    ListNode slow=head;
    int n =0;
    while(slow!=null){
        slow=slow.next;
        n++;
    }
    slow=head;
    k=k%n;
    if(k == 0) return head;
       for(int i=0;i<k;i++){
        fast=fast.next;
       }
       while(fast.next!=null){
        slow=slow.next;
        fast=fast.next;
       }
       ListNode newNode=slow.next;
       slow.next=null;
       fast.next=head;
       return newNode;
        
    }
}