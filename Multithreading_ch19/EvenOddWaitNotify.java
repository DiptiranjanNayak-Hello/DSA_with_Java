package Multithreading_ch19;

public class EvenOddWaitNotify {
    private final int max;
    private int number = 1;

    public EvenOddWaitNotify(int max) {
        this.max = max;
    }

    public synchronized void printEven() {
        while (number <= max) {
            while (number % 2 != 0) { // Not even turn
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Even thread interrupted");
                }
            }
            System.out.println("Even: " + number);
            number++;
            notify();
        }
    }

    public synchronized void printOdd() {
        while (number <= max) {
            while (number % 2 == 0) { // Not an odd turn
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Odd thread interrupted");
                }
            }
            System.out.println("Odd: " + number);
            number++;
            notify();
        }
    }

    public static void main(String[] args) {
        int maxNumber = 20;
        EvenOddWaitNotify printer = new EvenOddWaitNotify(maxNumber);

        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println("General.Main thread interrupted");
        }

        System.out.println("Printing completed.");
    }
}

