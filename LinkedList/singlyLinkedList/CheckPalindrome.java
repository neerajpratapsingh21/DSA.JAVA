package singlyLinkedList;

import java.util.ArrayList;

/**
 * CheckPalindrome
 */
public class CheckPalindrome {
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
public static boolean IsPalindrome(Node head){
    if(head == null || head.next == null) return true;
      ArrayList<Integer> list=new ArrayList<>();
      Node temp=head;
      while(temp != null){
        list.add(temp.data);
        temp=temp.next;
      }
      int n=list.size();
      int low =0;
      int high=n-1;
      while(low<high){
        if(list.get(low) != list.get(high)){
            return false;
        }
        low++;
        high--;
      }
      return true;
}
public static boolean optimalSolution(Node head){
     if(head == null || head.next == null) return true;
     Node slow=head; Node fast=head;
     while( fast != null && fast.next != null){
        slow=slow.next;
        fast=fast.next.next;
     }
     Node prev =null;  Node temp=slow;
      Node newHead=prev;
     while(temp != null){
        Node front =temp.next;
        temp.next=prev;
        prev =temp;
        temp=front;
        newHead=prev;
     }
     temp =head;
     while(temp != null && newHead != null ){
        if(temp.data != newHead.data){
       return false;
        }
        temp=temp.next;
        newHead=newHead.next;
     }
     return true;
}
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
      head.next.next=new Node(2);
  head.next.next.next=new Node(1);
       
        System.out.println(optimalSolution(head));
    }
}