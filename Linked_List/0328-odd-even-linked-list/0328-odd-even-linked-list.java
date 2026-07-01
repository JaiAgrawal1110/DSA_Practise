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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd=new ListNode();
        ListNode even=new ListNode();
        ListNode od=odd;
        ListNode eve=even;
        int pos=1;

        while(head!=null){
            if(pos%2!=0){
                od.next=head;
                od=od.next;
            }else{
                eve.next=head;
                eve=eve.next;
            }
            pos++;
            head=head.next;

        }
        od.next=even.next;
        eve.next=null;
        return odd.next;
    }
}