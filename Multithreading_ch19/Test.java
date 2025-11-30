package Multithreading_ch19;

public class Test {
    public static void main(String[] args) {

//        World w = new World();

//        w.start();    ------>   1st method - extends Thread

//      2nd method - implements Runnable
//        Same - overrides the run method as before in Thread
//        Only difference it doesn't create its own thread, so we create
//        a thread object in the main class and pass the object of the
//        other class that implemented runnable and use it as thread.

//        Thread t = new Thread(w);
//        t.start();
//
//        for (int i = 0; i < 100000; i++) {
//            System.out.println("Hello");
//        }


        Counter c = new Counter();
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c.getCount());
    }
}
