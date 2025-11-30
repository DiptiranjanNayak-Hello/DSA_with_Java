package Stacks_and_queues;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {

        if(this.isFull()){
            // double the array size
            int[] temp = new int[cq.length*2];

            for (int i = 0; i < cq.length; i++) {
                temp[i] = cq[(front+i) % cq.length];
            }
            front = 0;
            end = cq.length;
            cq = temp;
        }

        return super.insert(item);
    }
}
