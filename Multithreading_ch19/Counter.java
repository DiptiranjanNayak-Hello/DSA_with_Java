package Multithreading_ch19;

public class Counter {

    private int count;

    public synchronized void increament(){
//        synchronized(this){
            count++;
//        }
    }

    public int getCount() {
        return count;
    }
}
