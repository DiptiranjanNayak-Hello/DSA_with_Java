package Stacks_and_queues;
/*

Q. When do we use these stacks and queues?
A.     When we want to store the answers so far, store some results to use later on etc

 */


import java.util.*;

public class InBuilt {
    public static void main(String[] args) {

        // STACK:
//        Stack<Integer> s = new Stack<>();
//        s.push(56);
//        s.push(34);
//        s.push(45);
//        s.push(2);
//        s.push(9);
//
//        System.out.println(s.peek());
//        System.out.println(s.pop());
//        System.out.println(s.peek());


        // QUEUE:
//        Queue<Integer> q = new LinkedList<>();
//        q.add(3);
//        q.add(5);
//        q.add(19);
//        q.add(56);
//        q.add(7);
//
//        System.out.println(q.remove());
//        System.out.println(q.remove());

        // enqueue and deque - can be used to insert from the start and the back


        // DEQUE: pronounced deck -
        // "Faster than linked list and stack"  -why?
        // Ans - Because it promotes insertion and deletion from both the sides
        // no element restrictions
        // null elements not allowed in it

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        deque.removeFirst();
        deque.toString();
    }

}
