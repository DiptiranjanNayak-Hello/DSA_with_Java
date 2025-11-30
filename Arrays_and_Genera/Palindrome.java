package Arrays_and_Genera;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s){
        if (s == null || s.length() == 0)

        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);

            if (start != end){
                return false;
            }
        }
        return true;
    }
}
