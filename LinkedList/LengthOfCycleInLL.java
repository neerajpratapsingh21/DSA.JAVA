package singlyLinkedList;

/**
 * LengthOfCycleInLL
 */
public class LengthOfCycleInLL {
    static class Node{
        int val;
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
    
    public static void main(String[] args) {
      Node first=new Node(20);
      Node second=new Node(10);
      Node third=new Node(30);
      Node fourth=new Node(40);
      Node fifth=new Node(50);
    
      first.next=second;
      second.next=third;
      third.next=fourth;
      fourth.next=fifth;
      fifth.next=second;

    }
}