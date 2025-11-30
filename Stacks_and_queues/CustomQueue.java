package Stacks_and_queues;

/*
Queues can be initialised using both stacks and linked lists, this is
initialised using stack
 */

public class CustomQueue {
    private int[] q;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.q = new int[size];   // data is an array itself
    }

    public boolean isFull(){
        return end == q.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        q[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }

        int remove = q[0];

        for (int i = 1; i < end; i++) {
            q[i-1] = q[i];
        }

        end--;
        return remove;
    }

    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }
        return q[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.print("End");
    }
}
