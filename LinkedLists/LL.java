package LinkedLists;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    // DISPLAY THE LINKED LIST - O(n)
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // INSERTION:

    // INSERT AT THE FIRST POSITION
    public void insFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    // INSERT AT THE LAST POSITION
    public void insLast(int val){
        Node node = new Node(val);
        if(tail == null){
            insFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    // INSERT AT A PARTICULAR POSITION
    public void insAtIndex(int val, int index){
        if(index == 0){
            insFirst(val);
            return;
        }

        if(index == size){
            insLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
                temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    // DELETION

    // DELETE AT FIRST POSITION
    public int delFirst(){
        int value = head.value;
        head = head.next;
        if(head == null) tail = null;
        size--;
        return value;
    }


    // GET FUNCTION
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    // DELETION AT LAST POSITION
    public int delLast(){
        if(size <= 1) return delFirst();

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;

//        int value = tail.value;
//        Node temp = head;
//        while(temp.next.next != null) temp = temp.next;
//        temp.next = null;
//        tail = temp.next;
//        size--;
//        return value;
    }

    // DELETION AT ANY POSITION - O(n)
    public int delAny(int index){
        Node temp = head;
        if(index == 0) return delFirst();
        if (index == size-1) return delLast();
        Node prev = get(index-1);
        int value = prev.next.value;
        prev.next = prev.next.next;

        return value;
    }

    // FIND THE NODE CONTAINING THE GIVEN VALUE - O(n)
    public Node find(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value) return temp;
            temp = temp.next;
        }
        return null;
    }



// *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
//                                         QUESTIONS

    // Insert using recursion - LATER
    private Node insRec(int val, int index, Node prev){
        return null;
    }


    // Leetcode - 83: Remove duplicates from a sorted list
    public void deleteDuplicate(Node head){
//        if(head == null) return null;
//        Node temp = head;
//        while(temp.next != null){
//            if(temp.value == temp.next.value){
//                temp.next = temp.next.next;
//            }
//            temp.next = deleteDuplicate(temp.next);
//        }
//        return temp;

        Node temp = head;
        while(temp.next != null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
                size--;
            } else {
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
    }

    // Leetcode 21: Merge two sorted lists
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f != null && s != null){
            if(f.value < s.value){
                ans.insLast(f.value);
                f = f.next;
            } else {
                ans.insLast(s.value);
                s = s.next;
            }
        }

        while(f != null){
            ans.insLast(f.value);
            f = f.next;
        }

        while(s != null){
            ans.insLast(s.value);
            s = s.next;
        }
        return ans;
    }


    // CYCLE DETECTION:
    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }

        return false;
    }


    // Find length of the cycle
    public int lengthCycle(Node head) {
        Node fast = head;
        Node slow = head;
        int count;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                Node temp = slow;
                count = 0;
                do{
                    temp = temp.next;
                    count++;
                }while(temp != slow);
                return count;
            }
        }

        return 0;
    }


    // Detect cycle -
    // They met once by chance, trapped in the loop of life.
    // They parted, only to return from different paths, walking at the same pace
    // And when they saw each other again - it was right where everything began!!
    public Node detectCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                slow = head;
                while(fast != slow){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
    }

    // Middle of the linked list:
    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Reverse a linked list:
    public Node reverseList(Node head) {
        Node curr = head, next = null, prev = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    // Reverse a linked list - 2: Leetcode 92
    public Node reverseBetween(Node head, int left, int right) {
        if(left == right) return head;

        Node curr = head, prev = null;

        for(int i = 0; curr != null && i <= left-1; i++){
            prev = curr;
            curr = curr.next;
        }

        Node last = prev, newEnd = curr, next = curr.next;

        for(int i = 0; curr != null && i < (right-left) + 1; i++){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        if(last != null) last.next = prev;
        else head = prev;

        newEnd.next = curr;

        return head;
    }


    // Palindrome Linked list: leetcode 234
    public boolean isPalindrome(Node head) {
        Node mid = middleNode(head);
        Node headSec = reverseList(mid);
        Node revHead = headSec;

        // compare both the halves
        while (head != null && headSec != null){
            if(head.value != headSec.value){
                break;  // since we need to re-reverse the list that is why we did not return false here directly
            }
            head = head.next;
            headSec = headSec.next;
        }

        reverseList(revHead);

        return head == null || headSec == null;
    }

    // Reorder a list: Leetcode 143
    public void reorderList(Node head) {
        if(head == null || head.next == null) return;

        Node mid = middleNode(head);

        Node start = head;
        Node last = reverseList(mid);
        Node temp = null;

        // re-arrange
        while (start != null && last != null){
            temp = start.next;
            start.next = last;
            start = temp;
            temp = last.next;
            last.next = start;
            last = temp;
        }

        if(start != null){
            start.next = null;
        }
    }

    // Reverse nodes in k-groups: Leetcode 25
    public Node reverseKGroup(Node head, int k) {

        if(head == null){
            return null;
        }

        Node prev = null;
        Node curr = head;
        Node next = null;
        int count = 0;

        while(curr != null && count < k){
            curr = curr.next;
            count++;
        }

        if(count == k){
            curr = head;
            count = 0;

            while(curr != null && count < k) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }

            if(next != null) {
                head.next = reverseKGroup(next, k);
            }
            return prev;
        }
        return head;
    }


    // Reverse alternate k-nodes in linked list: GeeksForGeeks
    // check tomorrow for understanding and any errors
    public Node reverseAlternateKGroup(Node head, int k) {

        if(head == null){
            return null;
        }

        Node prev = null;
        Node curr = head;
        Node next = null;
        int count = 0;

        while(curr != null && count < k){
            curr = curr.next;
            count++;
        }

        if(count == k){
            curr = head;
            count = 0;

            while(curr != null && count < k) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }

            count = 0;
            while (curr != null && count < k - 1) {
                curr = curr.next;
                count++;
            }

            if(next != null) {
                head.next = reverseAlternateKGroup(next, k);
            }
            return prev;
        }
        return head;
    }

    // Rotate linked list
    public Node rotateRight(Node head, int k) {
        if(k <= 0 || head == null || head.next == null){
            return head;
        }

        Node last = head;
        int length = 1;
        while(last.next != null){
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        Node newLast = head;

        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;
    }
}