package singlyLinkedList;

import java.util.HashMap;

public class IntersectionOfTwoLLs {
      static class Node{
        int  data ;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    public static Node getIntersectionNode(Node head1,Node head2){
        HashMap<Node,Integer> map=new HashMap<>();
        Node temp1=head1;
        while(temp1!=null){
            map.put(temp1, 1);
            temp1=temp1.next;
        }
        Node temp2=head2;
        while(temp2!=null){
            if(map.containsKey(temp2)) return temp2;
            temp2=temp2.next;
        }
        return null;
    }
    public static void main(String[] args) {
    Node head1=new Node(3);
    head1.next=new Node(2);
    head1.next.next=new Node(2);
    head1.next.next.next=new Node(5);
    head1.next.next.next.next=new Node(6);
    head1.next.next.next.next.next=new Node(16);

    Node head2=new Node(4);
    head2.next=new Node(5);
    head2.next.next=head1.next.next;
   System.out.println(getIntersectionNode(head1, head2));
    }
}
