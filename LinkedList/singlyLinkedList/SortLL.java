package singlyLinkedList;

public class SortLL {
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
    public static Node sortList(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
     prev.next=null;
     
       
        Node list1=sortList(head);
        Node list2=sortList(slow);
         return merge(list1,list2);
    }
    public static Node merge(Node list1,Node list2){
        Node dummyNode = new Node(-1);
        Node temp=dummyNode;
        while(list1!=null && list2 != null ){
            if(list1.data <list2.data){
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }else{
                temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }
        }
        if(list1!=null){ temp.next=list1;}
        else{temp.next=list2;}
         return dummyNode.next;
    }
    public static void main(String[] args) {
           Node head=new Node(10);
        head.next=new Node(2);
      head.next.next=new Node(21);
  head.next.next.next=new Node(5);
  System.out.println("Before Sorting ");
  printLL(head);
 head= sortList(head);
  System.out.println("After Sorting ");
  printLL(head);
    }
}
