package Recursion1_Simple;

public class DigitSum {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(digitSum(n));
    }

    static int digitSum(int n){
        if(n < 10) return n;

        return (n%10) + digitSum(n/10);
    }
}
