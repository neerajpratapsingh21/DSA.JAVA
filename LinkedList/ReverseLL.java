package singlyLinkedList;
import java.util.Stack;
public class ReverseLL {
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
   
    public static Node reverseLLUsingStack(Node head){
        if(head==null || head.next==null) return head;
      Node temp=head;
      Stack<Integer> st=new Stack<>();
      while(temp != null){
        st.push(temp.data);
        temp=temp.next;
      }
      temp=head;
      while(temp != null){
temp.data = st.pop();
        temp=temp.next;
      }
      return head;
    }
    public static Node reverseLLByChangingPointers(Node head){
        if(head==null || head.next==null) return head;
         Node temp=head;
         Node prev=null;
         Node front;

         while(temp !=null){
          front=temp.next;
          temp.next=prev;
          prev=temp;
          temp=front;         
         }
         return prev;
    }
    public static Node reverseLLUsingRecursion(Node head){
        if(head==null || head.next==null) return head;
        Node newHead=reverseLLUsingRecursion(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
public static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
    }
    System.out.println("null");
}
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
       
printList(reverseLLUsingRecursion(head));
    }