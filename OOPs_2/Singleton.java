package OOPs_2;

public class Singleton {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // all three reference variables are pointing to just one object
    }

    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        // check whether only one object is created or not
        if(instance == null) instance = new Singleton();

        return instance;
    }
}
