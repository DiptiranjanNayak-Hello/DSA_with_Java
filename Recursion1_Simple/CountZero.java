package Recursion1_Simple;

public class CountZero {
    public static void main(String[] args) {
        int n = 1000000;
        System.out.println(countZero(n));
    }

    static int countZero(int n){
        if(n == 0) return 1;

        if(n < 10) return 0;

        int lastDigit = n%10;
        return (lastDigit == 0 ? 1 : 0) + countZero(n/10);
    }

    /*
    We can do the same for any number, if you specify which number you want to search for in the argument of the
    method, we can check in the last return statement:

    If the method argument is countNum(int n, int specificNumber):

            return (lastDigit == specificNumber ? 1 : 0) + countNum(n/10, specificNumber);

    The base cases:
        if (n == 0 && specificDigit == 0) {
            return 1;
        }

        if (n == 0) {
            return 0;
        }
     */
}
