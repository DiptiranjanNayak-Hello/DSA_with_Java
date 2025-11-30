package DSA;

public class BinarySearch {

    static int binarySearch(int[] arr, int size, int key){
        int start = 0;
        int end = size - 1;
        int mid = start + ((end-start)/2);

        if (start > end) {
            return -1;
        }

        while(start <= end){
            if(key == arr[mid]){
                return mid;
            }

            if(key > arr[mid]){
                start = mid+1;
            }

            if(key < arr[mid]){
                end  = mid-1;
            }

            mid = start + ((end - start)/2);
        }
        return -1;
    }


    public static void main(String[] args) {
        int even[] = {2, 4, 8, 16, 32, 64};
        int odd[] = {3, 8, 11, 14, 16};

        int index = binarySearch(even, 6, 32);
//        int index = binarySearch(odd, 5, 16);

        System.out.println("The element is present at " + index);
    }



    // RECURSIVELY:

    static int recursiveBinarySearch(int[] arr, int start, int end, int key){
        int mid = start + ((end-start)/2);

        if (start > end) {
            return -1;  // Base case: element not found
        }

        if(key == arr[mid]){
            return mid;
        }

        if(key < arr[mid]){
            return recursiveBinarySearch(arr, start, mid-1, key);
        }

        return recursiveBinarySearch(arr, mid+1, end, key);
    }

}



