package basics;

/**
 * Search
 */
public class Search {
    Node head;
    Node tail;
    public static Boolean findKey(Node head,int key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
public static void main(String[] args) {
    Node head=new Node(12);
    head.next=new Node(5);
    head.next.next=new Node(8);
    head.next.next.next=new Node(7);

    if(findKey(head, 5)){
        System.out.println("Found");
    }else{
        System.out.println("Not Found");
    }
}
    
}