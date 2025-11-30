package DSA;

public class LinearSearch {

    boolean linearSearch(int[] arr, int size, int key){
        for (int i = 0; i < size; i++) {
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

    }
}
