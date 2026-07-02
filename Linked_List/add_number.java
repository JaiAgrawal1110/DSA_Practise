/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        
        
        Node curr1=head1;
        Node prev1=null;
        
        while(curr1!=null){
            Node next1=curr1.next;
            curr1.next=prev1;
            prev1=curr1;
            curr1=next1;
        }
        Node curr2=head2;
        Node prev2=null;
        while(curr2!=null){
            Node next2=curr2.next;
            curr2.next=prev2;
            prev2=curr2;
            curr2=next2;
        }
        curr1=prev1;
        curr2=prev2;
        Node dummy=new Node(0);
        Node ans=dummy;
        
        int carry=0;
        while(curr1!=null || curr2!=null || carry!=0){
            int x = (curr1 != null) ? curr1.data : 0;
            int y = (curr2 != null) ? curr2.data : 0;
            int total=x+y+carry;
            int sum=total%10;
            carry=total/10;
            
            ans.next=new Node(sum);
            ans=ans.next;
            if(curr1 != null) curr1 = curr1.next;
             if(curr2 != null) curr2 = curr2.next;
            
            
        }
        Node curr3=dummy.next;
        Node prev3=null;
        while(curr3!=null){
            Node next3=curr3.next;
            curr3.next=prev3;
            prev3=curr3;
            curr3=next3;
        }
        while(prev3 != null && prev3.data == 0 && prev3.next != null){
        prev3 = prev3.next;}
        return prev3;
        
        
        
    }
}