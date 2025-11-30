package LinkedLists;

class Node{
    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }

    public Node(int val, Node next, Node prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}

public class DLL {
    Node head;

    public DLL() {
        this.head = null;
    }

    // INSERTION:

    // Insert first:
    public void insFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("Null!");
    }

    public void displayRev(){
        Node temp = head;
        Node last = null;
        while (temp != null){
//            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
//        System.out.println("Null");

        while (last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("Null!");
    }


    //

    // DO THE REST OF THE INSERTION AND DELETION BY YOURSELF

}
