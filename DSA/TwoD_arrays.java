package DSA;

import java.util.Scanner;

public class TwoD_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];

        // arr[3][4] = {
        //      {1, 11, 111, 1111},
        //      {2, 22, 222, 2222},
        //      {4, 44, 444, 4444}
        // };


        /* Another way
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
         */

        /* Coloumn wise input
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                arr[j][i] = sc.nextInt();   // NOTICE THAT THE POSITIONS OF i AND j HAVE BEEN SWAPPED
            }
        }
         */

        // Taking the elements as input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // LINEAR SEARCH IN 2-D
    static int[] searchElement(int[][] arr, int n){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == n){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    // SAME THING RECURSIVELY
    /*
    static int[] searchRecursive(int[][] arr, int n, int row, int col) {
        // If we've gone past the last row, element not found
        if (row >= arr.length) {
            return null;
        }

        // If we've gone past the last column in this row, move to next row
        if (col >= arr[row].length) {
            return searchRecursive(arr, n, row + 1, 0);
        }

        // If element is found, return coordinates
        if (arr[row][col] == n) {
            return new int[]{row, col};
        }

        // Otherwise, move to next column
        return searchRecursive(arr, n, row, col + 1);
    }
     */

    // SUM 0F A PRTICULAR ROW
    static int rowSum(int[][] arr, int rowIndex){
        int res = 0;
        for (int i = 0; i < arr[rowIndex].length; i++) {
            res += arr[rowIndex][i];
        }
        return res;
    }


    // ROW-WISE SUM
    static void rowWiseSum(int[][] arr, int rows, int cols){
        for (int i = 0; i < rows; i++) {
            int res = 0;
            for (int j = 0; j < cols; j++) {
                res += arr[i][i];
            }
            System.out.println(res);
        }
    }


    // LARGEST ROW SUM
    static int largestRowSum(int[][] arr, int rows, int cols){
        int maxSum = 0;
        int rowIndex = -1;

        for (int i = 0; i < rows; i++) {
            int res = 0;
            for (int j = 0; j < cols; j++) {
                res += arr[i][i];
            }

            if(res > maxSum){
                maxSum = res;
                rowIndex = rows;
            }
        }

        return rowIndex;
    }
}
