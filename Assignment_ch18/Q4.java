package Assignment_ch18;

import java.util.Scanner;

interface Shape {
    double area(double length);
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double a = sc.nextInt();
        Shape circle = (rad) -> Math.PI * Math.pow(rad, 2);
        Shape square = (side) -> Math.pow(side, 2);

        System.out.println("Area of circle: " + circle.area(a));
        System.out.println("Area of square: " + square.area(a));
    }
}
