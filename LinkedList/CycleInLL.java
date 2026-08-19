package singlyLinkedList;

import java.util.HashMap;

/**
 * CycleInLL
 */
public class CycleInLL {
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
    public static boolean detectCycle(Node head){
        if(head==null || head.next==null) return false;
        HashMap<Node,Integer> map =new HashMap<>();
        Node temp=head;
        while(temp !=null ){
            if(map.containsKey(temp)) return true;
            map.put(temp, 1);
            temp=temp.next;
        }
         return false;
    }
    public static boolean optimalSolution(Node head){
    if(head==null || head.next==null) return false;
       Node slow=head ; Node fast=head;  
       while(fast !=null && fast.next != null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast) return true;
       } 
       return false;
    }
public static void main(String[] args) {
     Node head=new Node(1);
        head.next=new Node(2);
      head.next.next=new Node(2);
  head.next.next.next=new Node(40);
  System.out.println(optimalSolution(head));
}
    
}