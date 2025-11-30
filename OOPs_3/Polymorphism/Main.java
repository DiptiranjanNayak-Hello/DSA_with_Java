package OOPs_3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle c = new Circle();
//        Square s = new Square();

        Shapes s = new Square();

//        shape.area();
//        c.area();
        s.area();
    }
}
