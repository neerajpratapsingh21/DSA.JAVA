package singlyLinkedList;
// Constraints:

// The number of nodes in the list is sz.
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
public class RemoveNthNodeFromEndOfLL {
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
    public static Node removeNthNode(Node head,int n){  
        int size=0;
        Node temp=head;
        while(temp != null){
            size++;
            temp=temp.next;
        }
      if(n==size){
        return head.next;
      }
      temp=head;
 for(int i=1;i<size-n;i++){
    temp=temp.next;
 }
 temp.next = temp.next.next;
 return head;
    }
    public static Node optimalSoltion(Node head,int n){
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        Node slow=head;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
      
    }
}
