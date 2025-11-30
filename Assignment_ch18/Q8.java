package Assignment_ch18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q8 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 6, 1, 10, 30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss");
        System.out.println("Formatted DateTime: " + dateTime.format(formatter));
    }
}
