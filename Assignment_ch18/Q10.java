package Assignment_ch18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start date (YYYY-MM-DD): ");
        LocalDate start = LocalDate.parse(sc.next());
        System.out.print("Enter end date (YYYY-MM-DD): ");
        LocalDate end = LocalDate.parse(sc.next());
        long daysBetween = ChronoUnit.DAYS.between(start, end);
        System.out.println("Days between: " + daysBetween);
    }
}