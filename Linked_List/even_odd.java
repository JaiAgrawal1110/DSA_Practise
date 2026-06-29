package Linked_List;

/* Structure of a link list node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    Node divide(Node head) {
        // code here
        Node odd=new Node(0);
        Node even=new Node(0);
        Node od=odd;
        Node eve=even;

        while(head!=null){
            Node next=head.next;
            head.next=null;
            if(head.data%2!=0){
                od.next=head;
                od=od.next;
            }else{
                eve.next=head;
                eve=eve.next;
            }
            head=next;

        }od.next=null;
        eve.next=odd.next;
        return even.next;
        
    }
}
    
