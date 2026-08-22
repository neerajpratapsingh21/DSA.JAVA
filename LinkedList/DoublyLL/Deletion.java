package doublyLinkedList;

public class Deletion {
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
    // for create a list for demonstration
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
    public static void deleteFirst(){
   if(head==null){
    System.out.println("Empty list!");
    return;
   }
   if(head==tail){
    head=tail=null;
    size--;
    return;
   }
   head=head.next;
   head.prev=null;
   size--;

    }
     public static void deleteLast(){
   if(head==null){
    System.out.println("Empty list!");
    return;
   }
   if(head==tail){
    head=tail=null;
    size--;
    return;
   }
   tail=tail.prev;
   tail.next=null;
   size--;
    }
    public static void deleteAtPosition(int position) {
        if(position>=size || position <0 ){
        System.out.println("Invalid Position !");
        return;
        }
        if (position == 0) {
        deleteFirst();
            return;
        }
     if (position == size-1) {
          deleteLast();
        return;
    }
       
        if(position<size/2){
        Node temp = head;
        for (int i = 0; i < position-1; i++) {
            temp = temp.next;
        }
       temp.next=temp.next.next;
       temp.next.prev=temp;
        }else{
        Node temp = tail;
        for (int i = size-1 ; i >position; i--) {
            temp = temp.prev;
        }
        temp.prev=temp.prev.prev;
        temp.prev.next=temp;
        }
       size--;
        
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
        addFirst (8);
        addFirst (7);
        addFirst (6);
       addFirst (5);
        addFirst(4);
        addFirst(3);
        addFirst(2);
        addFirst(1);
             System.out.println(size);
        print();
        deleteFirst();
             System.out.println(size);
        print();
        deleteLast();
             System.out.println(size);
        print();
        deleteAtPosition(size);
        print();
        System.out.println(size);
      
    }
}
