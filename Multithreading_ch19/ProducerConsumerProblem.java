package Multithreading_ch19;

import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    private final Queue<Integer> buffer;
    private final int capacity;

    public SharedBuffer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void put(int value) throws InterruptedException {
        while (buffer.size() == capacity) {
            System.out.println("Buffer is full. Producer is waiting...");
            wait();
        }
        buffer.add(value);
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int get() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty. Consumer is waiting...");
            wait();
        }
        int value = buffer.poll();
        System.out.println("Consumed: " + value);
        notify();
        return value;
    }
}

class Producer extends Thread {
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.put(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.get();
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(3);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Producer and Consumer have finished their tasks.");
    }
}

