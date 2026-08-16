package basics;
public class Insertion {
    static Node head;
    static Node tail;
    public static int size;
    // Insert at beginning
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // Insert at end
    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    // Insert at a given position
    // Position is 0-based
    public static void addAtPosition(int data, int position) {
        if (position == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        
        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }
         size++;
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
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
        addLast(40);
        addFirst(5);
        // Insert 30 at index 3
        addAtPosition(30, 3);
        printList();
        System.out.println(size);
        
    }
}