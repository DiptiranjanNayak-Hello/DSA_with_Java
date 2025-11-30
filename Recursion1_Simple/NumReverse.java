package Recursion1_Simple;

public class NumReverse {
    public static void main(String[] args) {
        System.out.println(numReverse(54));
    }

    static int numReverse(int n){
        if(n%10 == n) return n;

        System.out.print(n%10);
        return numReverse(n/10);
    }
}
