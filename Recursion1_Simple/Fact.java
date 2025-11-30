package Recursion1_Simple;

public class Fact {
    public static void main(String[] args) {
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);
    }

    public static int factorial(int n) {
        if(n == 1 || n == 0) return 1;

        return n * factorial(n-1);
    }
}
