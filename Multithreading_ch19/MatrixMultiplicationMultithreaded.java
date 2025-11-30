package Multithreading_ch19;

public class MatrixMultiplicationMultithreaded {
    private static final int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    private static final int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
    };

    private static final int ROWS_A = matrixA.length;
    private static final int COLS_A = matrixA[0].length;
    private static final int ROWS_B = matrixB.length;
    private static final int COLS_B = matrixB[0].length;

    private static final int[][] result = new int[ROWS_A][COLS_B];

    // Thread class to multiply one row of matrixA with matrixB
    static class RowMultiplier extends Thread {
        private int row;

        public RowMultiplier(int row) {
            this.row = row;
        }

        @Override
        public void run() {
            for (int j = 0; j < COLS_B; j++) {
                int sum = 0;
                for (int k = 0; k < COLS_A; k++) {
                    sum += matrixA[row][k] * matrixB[k][j];
                }
                result[row][j] = sum;
            }
            System.out.println("Row " + row + " multiplication completed by " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        if (COLS_A != ROWS_B) {
            System.out.println("Matrix multiplication is not possible: columns of A != rows of B");
            return;
        }

        Thread[] threads = new Thread[ROWS_A];

        for (int i = 0; i < ROWS_A; i++) {
            threads[i] = new RowMultiplier(i);
            threads[i].start();
        }

        for (int i = 0; i < ROWS_A; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < ROWS_A; i++) {
            for (int j = 0; j < COLS_B; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


