package Arrays_and_Genera;

import java.util.Scanner;

public class userinp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String x = sc.nextLine();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Your favorite food?");
        String food = sc.nextLine();

        System.out.println("Hello "+x);
        System.out.println("You are "+age+" years old!!");
    }
}
