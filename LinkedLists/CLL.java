package LinkedLists;

public class CLL {
    private Node head;
    private Node tail;

    public CLL(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }

        // CIRCULAR LOGIC:
        tail.next = node;
        node.next = head;
        tail = node;
    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }


}

// WITH ONLY HEAD:

/*

class CircularLinkedList {

    // Node class representing each element in the list
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head node, which will point to the first node of the circular list
    Node head = null;

    // Method to insert a node at the end of the Circular Linked List
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            head.next = head;  // Point the head to itself to form a circular link
        } else {
            Node temp = head;

            // Traverse to the last node (node before head)
            while (temp.next != head) {
                temp = temp.next;
            }

            // Insert the new node after the last node and before the head
            temp.next = newNode;
            newNode.next = head;  // Make the new node point to the head
        }
    }

    // Method to insert a node at the beginning of the Circular Linked List
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            head.next = head;  // Point the head to itself to form a circular link
        } else {
            Node temp = head;

            // Traverse to the last node (node before head)
            while (temp.next != head) {
                temp = temp.next;
            }

            // Insert the new node at the beginning
            temp.next = newNode;
            newNode.next = head;  // Make the new node point to the head
            head = newNode;       // Update the head to point to the new node
        }
    }

    // Method to display the Circular Linked List
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println(); // for a new line after printing the list
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);
        cll.insertAtBeginning(5);
        cll.insertAtEnd(40);

        cll.display();  // Expected output: 5 10 20 30 40
    }
}

 */