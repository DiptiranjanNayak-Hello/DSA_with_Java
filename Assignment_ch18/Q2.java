package Assignment_ch18;

import java.util.Scanner;

interface Calculator{
    double calculate(int x, int y);
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator mul = (int a, int b) -> (a*b);
        Calculator div = (int a, int b) -> (a/b);
        Calculator add = (int a, int b) -> (a+b);
        Calculator sub = (int a, int b) -> (a-b);
        System.out.println("Enter two numbers: ");
        int i =sc.nextInt();
        int j =sc.nextInt();
        System.out.println("Multiplication: "+mul.calculate(i, j));
        System.out.println("Division: "+div.calculate(i, j));
        System.out.println("Addition: "+add.calculate(i, j));
        System.out.println("Subtraction: "+sub.calculate(i, j));
    }
}
