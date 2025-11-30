package Arrays_and_Genera;

import java.util.HashSet;

public class PairWithGivenSum {
    static boolean findPair(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = sum - num;
            if (set.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int sum = 17;
        boolean found = findPair(arr, sum);
        System.out.println("Pair with given sum exists: " + found);
    }
}
