/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        if( head==null || head.next==null|| k==0)return head;
        // code here
        Node fast=head;
        Node slow=head;
        int n=0;
         while(slow!=null){
             slow=slow.next;
             n++;
             
         }
         slow=head;
        k=k%n;
        if (k==0)return head;
        for(int i=0;i<n-k;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        Node newNode=slow.next;
        fast.next=head;
        slow.next=null;
        return newNode;
    }
}






