package Linked_List;

/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        Node fast=head;
        Node slow=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            
            if(slow==fast){
                Node temp=head;
                while(temp!=slow){
                temp=temp.next;
                slow=slow.next;
                }
                return slow.data;
            }
        }
        return -1;
        
    }
}