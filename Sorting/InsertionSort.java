package Sorting;

public class InsertionSort {

    private static void insSort(int arr[]){
        if (arr == null) {
            return;
        }

        int j;
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            j = i-1;
            while(j >= 0 && arr[j] > key){
                swap(arr, j, j+1);
                j = j - 1;
            }
        }
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {2, 8, 5, 3, 9, 4};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        insSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
