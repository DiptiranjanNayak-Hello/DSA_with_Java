package Arrays_and_Genera;

import java.util.Scanner;

public class shopping_cart_prob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int qty;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?");
        item = sc.nextLine();

        System.out.print("What is the price for each?");
        price = sc.nextDouble();

        System.out.print("How many would you like?");
        qty = sc.nextInt();

        total = price * qty;

        System.out.println("\n You have bought "+qty+" "+item+"/s");
        System.out.println("Your total is " + currency + total);

        sc.close();
    }
}
