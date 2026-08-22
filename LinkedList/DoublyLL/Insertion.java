package doublyLinkedList;

public class Insertion {
    static class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }

    Node(int data,Node next,Node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}

    static Node head;
    static Node tail;
    static int size;

    public static void addFirst(int data){
       Node newNode = new Node(data);
       size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
         head=newNode;

    }
    public static void addLast(int data){
       Node newNode = new Node(data);
       size++;
        if(tail==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;

    }
     public static void addAtPosition(int data, int position) {
        if(position>size || position <0 ){
        System.out.println("Invalid Position !");
        return;
        }
        if (position == 0) {
            addFirst(data);
            return;
        }
     if (position == size) {
        addLast(data);
        return;
    }
        Node newNode = new Node(data);
       
        if(position<size/2){
        Node temp = head;
        for (int i = 0; i < position-1; i++) {
            temp = temp.next;
        }
        newNode.next=temp.next;
        temp.next.prev=newNode;
        temp.next=newNode;
        newNode.prev=temp;
       
        }else{
        Node temp = tail;
        for (int i = size-1 ; i >position+1; i--) {
            temp = temp.prev;
        }
        newNode.prev=temp.prev;
        temp.prev.next=newNode;
        temp.prev=newNode;
        newNode.next=temp;
        }
       size++;
        
    }

    public static void print() {
        Node temp = head;
        System.out.print("null <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }
    public static void main(String[] args) {
      
      addFirst(5);
      addFirst(4);
      addFirst(3);
      addFirst(2);
      addFirst(1);
      addLast(50);
      addAtPosition(100,45 );
      
    
    }
}

