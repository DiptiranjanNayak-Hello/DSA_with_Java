package Stacks_and_queues;

public class DynamicStack extends CustomStack{
    // this will never be full


    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        if(isFull()){
            // double the array size
            int[] temp = new int[stack.length*2];

            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
        }
        // at this point we know that array is not full
        // hence insert item normally
        return super.push(item);
    }
}
