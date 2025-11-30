package Stacks_and_queues;

public class CustomStack {
    protected int[] stack;
//    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    // static because no matter what you initialize it will always be
    // initialized with the default size as 10

    int ptr = -1;


    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.stack = new int[size];   // data is an array itself
        /*
         So, when we call this constructor, we should initialise an array,
         just like linked list, when we call the method a list is initialised.

         So, whenever we call the constructor of this, an array should be
         initialised, because a stack is an array(internally), that is why
         we use

            this.data = new int[size]

         size was passed as argument, data is an array object, so this.data
         */
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full!");
            return false;
        }
        ptr++;
        stack[ptr] = item;

        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from empty stack!");
        }
//        int removed = stack[ptr];
//        ptr--;
//        return removed;

        return stack[ptr--];
    }

    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot peek!");
        }
        return stack[ptr];
    }


    public boolean isFull(){
        return ptr == stack.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

}
