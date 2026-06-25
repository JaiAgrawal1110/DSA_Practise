package Linked_List;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
public class practice {

    public static void main(String[] args) {

    Node n1=new Node(10);
    Node n2=new Node(20);
    Node n3=new Node(30);
    Node n4=new Node(40);
    Node n5=new Node(50);

    n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    n4.next=n5;
    System.out.println(n1.next.next.next.val);
    System.out.println(n3.next.val);
    
}
}

