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
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(0);
        ListNode big=new ListNode(0);
        ListNode curr=small;
        ListNode prev=big;

        while(head!=null){
            if(head.val<x){
                curr.next=head;
                curr= curr.next;            
            }else{
                prev.next=head;
                prev=prev.next;
            }
            head=head.next;
        }
        prev.next=null;
        curr.next=big.next;
        return small.next;
    }
}