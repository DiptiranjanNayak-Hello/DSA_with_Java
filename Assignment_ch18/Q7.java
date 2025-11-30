package Assignment_ch18;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Q7 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current datetime: "+now);

        LocalDate future = LocalDate.now().plusWeeks(4);
        System.out.println("After 4 weeks: "+future);

        LocalDateTime farfuture = LocalDateTime.now().plusMonths(895);
        System.out.println("After 896 weeks: "+farfuture);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Formatted date: "+LocalDate.now().format(dtf));
        System.out.println("Formatted date: "+LocalDateTime.now().format(dtf));
    }
}
