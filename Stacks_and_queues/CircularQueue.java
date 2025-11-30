package Stacks_and_queues;

public class CircularQueue {
    public int[] cq;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.cq = new int[size];   // data is an array itself
    }

    public boolean isFull(){
        return size == cq.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        cq[end++] = item;
        end = end % cq.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }

        int remove = cq[front];
        front = front % cq.length;
        size--;
        return remove;
    }

    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }
        return cq[front];
    }

    public void display(){
        if(isEmpty()) System.out.println("Empty!");
        int i = front;
        do{
            System.out.print(cq[i] + " -> ");
            i++;
            i %= cq.length;
        } while(i != end);
        System.out.println("End");
    }

}
