/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node deleteNode(Node head, int key) {
        // code here
        Node temp=head;
        if(head==null)return head;
         if (head.data == key) {
            
            if (head.next == head) return null;

            Node last = head;
            while (last.next != head) {
                last = last.next;
            }

            last.next = head.next;
            head = head.next;

            return head;
        }
        while(temp.next!=head){
            if(temp.next.data==key){
                temp.next=temp.next.next;
                return head;
            }
            temp=temp.next;
            
        }return head;
    }
}