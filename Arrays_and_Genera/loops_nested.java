package Arrays_and_Genera;

import java.util.Scanner;

public class loops_nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int cols;
        String symbol="";

        System.out.print("Enter no. of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter no. of coloumns: ");
        cols = sc.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = sc.next();

        for (int i = 1; i <= rows ; i++) {
            System.out.println();
            for (int j = 1; j <= cols ; j++) {
                System.out.print(symbol);
            }
        }
    }
}
