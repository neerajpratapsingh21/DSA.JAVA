package singlyLinkedList;

/**
 * FindMiddle
 */
public class FindMiddle {
       public static class Node {
        int data; 
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
}

    static Node head;
    static Node tail;
    
public static Node findMiddleByTraversal(Node head){
    if(head==null || head.next==null){
        return head;
    }
    Node temp=head;
    int count=0;
    while(temp!=null){
     count++;
     temp=temp.next;   
    }
    int midNode=(count/2)+1;
    temp=head;
    while(temp!=null){
         midNode--;
        if(midNode==0){
            break;
        }
       temp=temp.next;  
    }
    return temp;
   
    }
public static Node findMidlebyTortoiseAndHare(Node head){
    if(head==null || head.next==null){
        return head;
    }
    Node slow=head; Node fast=head;
    while(fast != null && fast.next != null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        
        System.out.println();
    }
}