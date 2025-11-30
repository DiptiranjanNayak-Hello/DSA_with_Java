package Multithreading_ch19;

public class MyThread1 extends Thread{

    public MyThread1(String str){
        super(str);
    }

    @Override
    public void run(){
//        try{
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" - Priority: "+Thread.currentThread().getPriority()+" -count: "+i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1("Diptiranjan");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
//        t1.join();
//        System.out.println("Hello!!!");
    }
}
