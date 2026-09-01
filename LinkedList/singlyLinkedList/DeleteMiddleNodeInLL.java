package singlyLinkedList;

public class DeleteMiddleNodeInLL {
    
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
     public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node deleteMiddleNode(Node head){
    if(head==null || head.next == null) return null;
    Node slow=head;
    Node fast=head;
    Node prev=null;
    while(fast != null && fast.next != null){
  prev =slow;
  slow=slow.next;
  fast=fast.next.next;
    }
    prev.next=slow.next;
     return head;
    }
    public static void main(String[] args) {
         Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Before Deletion ");
        printLL(head);
        deleteMiddleNode(head);
        System.out.println("After Deletion ");
        printLL(head);
    }
    
}
