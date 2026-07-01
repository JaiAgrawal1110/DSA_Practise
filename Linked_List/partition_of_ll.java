package Linked_List;

/* Structure of linked list Node
class Node {
  public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = null;
    }
};
*/
class Solution {
    public Node partition(Node head, int x) {
        // code here
        Node bigDummy=new Node(0);
        Node smallDummy=new Node(0);
        Node eqDummy=new Node(0);
        Node big=bigDummy;
        Node small=smallDummy;
        Node equal=eqDummy;
        
        while(head!=null){
            Node next=head.next;
            head.next=null;
            if(head.data<x){
                small.next=head;
                small=small.next;
                
            }else if(head.data==x){
                equal.next=head;
                equal=equal.next;
            }
            else{
                big.next=head;
                big=big.next;
            }
            head=next;
        }
        small.next=eqDummy.next;
        equal.next=bigDummy.next;
        big.next=null;
        
        if(smallDummy.next != null){
            small.next = (eqDummy.next != null) ? eqDummy.next : bigDummy.next;
            return smallDummy.next;
        }
        if(eqDummy.next != null){
            equal.next = bigDummy.next;
            return eqDummy.next;
        }
        return bigDummy.next;
        
    }
}