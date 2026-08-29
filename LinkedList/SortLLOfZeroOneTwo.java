package singlyLinkedList;

public class SortLLOfZeroOneTwo {
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
    public static Node optimalSolution(Node head){
        if(head==null || head.next==null) return head;
        Node dummyZero=new Node(-1);
        Node dummyOne =new Node(-1);
        Node dummyTwo =new Node(-1);
        Node temp = head;
      Node zeroTail=dummyZero;
      Node oneTail=dummyOne;
      Node twoTail=dummyTwo;
         while(temp!=null){
            if(temp.data==0){
                zeroTail.next=temp;
                zeroTail=zeroTail.next;
         }else if(temp.data==1){
            oneTail.next=temp;
            oneTail=oneTail.next;
         }else{
            twoTail.next=temp;
            twoTail=twoTail.next;
         }
         temp=temp.next;
    }
     if(dummyOne.next !=null){
    zeroTail.next=dummyOne.next;
    oneTail.next=dummyTwo.next;
    twoTail.next=null;
   }else{
    zeroTail.next=dummyTwo.next;
     oneTail.next = dummyTwo.next;
    twoTail.next=null;
   }
    //   zeroTail.next = (dummyOne.next != null) ? dummyOne.next : dummyTwo.next;
    //     oneTail.next = dummyTwo.next;
    //     twoTail.next = null;
        return dummyZero.next;
}
public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
         Node head=new Node(0);
        head.next=new Node(2);
      head.next.next=new Node(0);
  head.next.next.next=new Node(0);
   System.out.println("Before Sorting ");
  printLL(head);
  head=optimalSolution(head);
  System.out.println("After Sorting ");
  printLL(head);
    }
}
