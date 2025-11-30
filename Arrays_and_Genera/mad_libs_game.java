package Arrays_and_Genera;

import java.util.Scanner;

public class mad_libs_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String adj1;
        String noun1;
        String adj2;
        String verb1;
        String adj3;

        System.out.print("Enter an adjective (description): ");
        adj1 = sc.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = sc.nextLine();
        System.out.print("Enter an adjective (description): ");
        adj2 = sc.nextLine();
        System.out.print("Enter a verb ending with -ing (action): ");
        verb1 = sc.nextLine();
        System.out.print("Enter an adjective(description): ");
        adj3 = sc.nextLine();

        System.out.println("\nToday I went to a " + adj1 + " zoo.");
        System.out.println("In an exhibit, I saw " + noun1 + ".");
        System.out.println(noun1 + " was "+ adj2 + " and " + verb1 + "!");
        System.out.println("I was "+ adj3 + "!");

        sc.close();
    }
}
