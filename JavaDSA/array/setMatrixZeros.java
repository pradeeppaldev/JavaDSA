package DSA.array;

import java.util.Arrays;

class setMatrixZeros {
    public static void main(String[] args) {
        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];

        // First pass: mark the rows and columns that need to be zeroed
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Second pass: set the rows and columns to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
