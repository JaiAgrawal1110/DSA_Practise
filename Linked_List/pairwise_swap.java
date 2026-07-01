package Linked_List;

/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        // code here
        Node dummy=new Node(0);
        dummy.next=head;
        Node prev=dummy;
        Node first=prev;
        Node second=first;
        
        while(prev.next!=null && prev.next.next!=null){
            first=prev.next;
            second=first.next;
            first.next=second.next;
            second.next=first;
            prev.next=second;
            prev=first;
        }
        return dummy.next;
    }
}