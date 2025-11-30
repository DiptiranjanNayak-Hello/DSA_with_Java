package OOPs_3.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    static void greeting(){
        System.out.println("Hello there, I am inside a box!");
    }

    public Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // Cube
    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    // Copy constructor
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void displayInfo(){
        System.out.println("Running the box!");
    }
}
