package OOPs_3.Polymorphism;

public class Circle extends Shapes{

    // this will run when obj of Circle is created
    // hence it is overriding the parent method

    void area(){
        System.out.println("Area is pi * r * r");
    }
}
