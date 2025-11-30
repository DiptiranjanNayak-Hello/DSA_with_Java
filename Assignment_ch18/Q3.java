package Assignment_ch18;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        List<String> str = new LinkedList<>();
        str.add("apple");
        str.add("banana");
        str.add("kiwi");
        str.add("grapefruit");
        str.add("pear");
        str.add("orange");

        Collections.sort(str, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(str);
    }
}
