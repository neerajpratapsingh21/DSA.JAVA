package singlyLinkedList;

import java.util.ArrayList;

/**
 * OddEvenLL
 */
public class OddEvenLL{
     static class Node{
        int data;
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
    public static Node UsingExtraSpace(Node head){
        if(head==null || head.next==null || head.next.next==null) return head;
        ArrayList<Integer> list=new ArrayList<>();

        Node temp=head;
        while(temp !=null && temp.next!=null){
        list.add(temp.data);
        temp=temp.next.next;    
        }
        if(temp!=null) list.add(temp.data);
        temp=head.next;
         while(temp !=null && temp.next!=null){
        list.add(temp.data);
        temp=temp.next.next;    
        }
         if(temp!=null) list.add(temp.data);
         temp =head;
         int i=0;
         while(temp!=null){
            temp.data=list.get(i);
            temp=temp.next;
            i++;
         }
         return head;
    }
    public static Node optimalSolution(Node head){
           if(head==null || head.next==null || head.next.next==null) return head;
        Node odd=head;
        Node even=head.next;
        Node newHead=even;

        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;

            even.next=odd.next;
            even=even.next;
        }
        odd.next=newHead;
        return head;
    }
    public  static void printList(Node head){
    if(head==null) {
        System.out.println("Empty ! ");
        return;
    }
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
     }
     System.out.println("null");
   }
  public static void main(String[] args) {
        Node head = new Node(17);
        head.next = new Node(15);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(4);
        printList(head);
        printList(UsingExtraSpace(head));
}
    
}