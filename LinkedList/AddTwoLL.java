package singlyLinkedList;

public class AddTwoLL {
     static class Node{
        int  val ;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
        Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }
    public static Node  addTwoNumbers1(Node l1, Node l2) {
        int carry=0;
        Node  newHead=new Node(-1);
        Node temp=newHead;
        while(l1 != null || l2!=null || carry !=0){
            int sum=l1.val+l2.val+carry;
            carry = sum/10;
            sum=sum%10;
            
            temp.next=new Node(sum);
            temp=temp.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null && carry !=0){
            int sum=l1.val+carry;
            carry=sum/10;
            sum=sum%10;
            temp.next=new Node(sum);
            temp=temp.next;
            l1=l1.next;
        }
        while(l2!=null && carry!=0){
            int sum=l2.val+carry;
            carry=sum/10;
            sum=sum%10;
            temp.next=new Node(sum);
            temp=temp.next;
            l2=l2.next;
        }
        if(l1 !=null) temp.next=l1;
        else{ temp.next=l2;}
        if(carry !=0){
            temp.next=new Node(carry);
            temp=temp.next;
        }
        return newHead.next;
    }
    public static Node addTwoNumbers2(Node l1,Node l2){
        int carry=0;
        Node newHead=new Node(-1);
        Node temp=newHead;
        while(l1!=null || l2 != null || carry != 0){
            int sum=carry;
            if(l1 != null){
                sum += l1.val;
                l1=l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2=l2.next;
            }
            temp.next= new Node(sum%10);
            temp=temp.next;
            carry = sum/10;
        }
        return newHead.next;
    }
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
     Node l1=new Node(9);
     l1.next=new Node(9);
     l1.next.next=new Node(9);
     l1.next.next.next=new Node(9);
      Node l2=new Node(9);
      l2.next=new Node(9);
     l2.next.next=new Node(9);
     l2.next.next.next=new Node(9);
      l2.next.next.next.next=new Node(9);
       l2.next.next.next.next.next=new Node(9);

       System.out.print("print l1 :"); printLL(l1);
       System.out.print("print l2 :");printLL(l2);
       Node head=addTwoNumbers2(l1, l2);
       printLL(head);
    }
    }
