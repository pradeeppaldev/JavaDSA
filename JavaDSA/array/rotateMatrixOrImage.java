package DSA.array;

import java.util.Arrays;

public class rotateMatrixOrImage {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matrix));
        rotateImage(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void rotateImage(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
//        Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];    //transpose is done in same matrix by swapping
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
//        Reverse
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
//                Swap elements of 1st row with last row & elements of 2nd row with 2nd last row
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
}
