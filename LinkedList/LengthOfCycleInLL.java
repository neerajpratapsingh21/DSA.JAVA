package singlyLinkedList;

import java.util.HashMap;
import java.util.Map;

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
    public static int findLengthUsingHashMap(Node head){
        
        Map<Node,Integer> map =new HashMap<>();
        Node temp=head;
        int count=0;
        while(temp!=null){
         if(map.containsKey(temp)){
            return count - map.get(temp);
         }
         map.put(temp, count);
         temp=temp.next;
         count++;
        }
        return 0;
    }
    public static int findLengthUsingSlowAndFast(Node head){
        Node slow=head;
        Node fast=head;
        int count=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=slow.next;
                count=1;
               while(slow!=fast){
                count++;
                slow=slow.next;
               }
               return count;
            }
        }
        
return count;
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
  System.out.println(findLengthUsingHashMap(first));
  System.out.println(findLengthUsingSlowAndFast(first));
    }
}