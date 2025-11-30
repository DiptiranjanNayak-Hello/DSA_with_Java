package Multithreading_ch19;

import java.util.ArrayList;
import java.util.List;

class PrimeGenerator extends Thread {
    private int start;
    private int end;
    private List<Integer> primes;

    public PrimeGenerator(int start, int end) {
        this.start = start;
        this.end = end;
        this.primes = new ArrayList<>();
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        System.out.println("Primes from " + start + " to " + end + ": " + primes);
    }

    public List<Integer> getPrimes() {
        return primes;
    }

    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        int limit = 100; // Change this limit as needed
        int numberOfThreads = 4; // Number of threads to use
        int range = limit / numberOfThreads;

        PrimeGenerator[] threads = new PrimeGenerator[numberOfThreads];

        // Create and start threads
        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * range + 1;
            int end = (i == numberOfThreads - 1) ? limit : (i + 1) * range;
            threads[i] = new PrimeGenerator(start, end);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Prime number generation completed.");
    }
}

