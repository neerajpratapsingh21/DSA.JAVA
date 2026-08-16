package basics;
public class Deletion {

    

    static Node head;
    static Node tail;

    // Create list for demonstration
    public static void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Delete first node
    public static void deleteFirst() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
    }

    // Delete last node
    public static void deleteLast() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }
    // Delete node at given position
    // Position is 0-based
    public static void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 0) {
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next == null){
            System.out.println("Invalid position");
            return;
        }
        if (temp.next == tail) {
            tail = temp;
        }
        temp.next = temp.next.next;
    }
    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        addLast(10);
        addLast(20);
        addLast(30);
        addLast(40);

        System.out.println("Original:");
        printList();

        deleteFirst();

        System.out.println("After deleting first:");
        printList();

        deleteLast();

        System.out.println("After deleting last:");
        printList();

        deleteAtPosition(1);

        System.out.println("After deleting at position 1:");
        printList();
    }
}