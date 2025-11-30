package Recursion2_Arrays;

public class Sorted {
    public static void main(String[] args) {

    }

    static boolean sorted(int[] arr, int index){
        if(index == arr.length - 1) return true;

        return (arr[index+1] > arr[index] && sorted(arr, index+1));
    }
}
