package Stacks_and_queues;

public class StackMain {
    public static void main(String[] args) throws StackException{
        CustomStack s = new CustomStack(8);
        s.push(56);
        s.push(34);
        s.push(45);
        s.push(2);
        s.push(9);
        s.push(91);
        s.push(79);

        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
