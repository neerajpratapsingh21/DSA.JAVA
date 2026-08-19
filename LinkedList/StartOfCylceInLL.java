package singlyLinkedList;

import java.util.HashMap;

public class StartOfCylceInLL {
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
     public static Node detectCycle(Node head){
        if(head==null || head.next==null) return null;
        HashMap<Node,Integer> map =new HashMap<>();
        Node temp=head;
        while(temp !=null ){
            if(map.containsKey(temp)) return temp;
            map.put(temp, 1);
            temp=temp.next;
        }
         return null;
    }
    public static Node optimalSolution(Node head){
    if(head==null || head.next==null) return null;
       Node slow=head ; Node fast=head;  
       while(fast !=null && fast.next != null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            slow=head;
            while(slow != fast){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
       } 
       return null;
    }
    public static void main(String[] args) {
         Node head=new Node(1);
        head.next=new Node(2);
      head.next.next=new Node(2);
  head.next.next.next=head.next;
        Node startNode=optimalSolution(head);
        if(startNode != null){
           System.out.println("Cycle found at index with values = "+startNode.data);
        }
        System.out.println("No Cycle found ");
    }
}
