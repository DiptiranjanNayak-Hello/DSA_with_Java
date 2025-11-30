package Stacks_and_queues;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        CustomQueue q = new CustomQueue(5);
        q.insert(3);
        q.insert(6);
        q.insert(5);
        q.insert(19);
        q.insert(1);

        q.display();

        System.out.println(q.remove());

        q.display();
    }
}
