package DSA.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        spiralOrder(matrix);
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return answer;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        // Traverse the matrix in spiral order
        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                answer.add(matrix[top][i]);
            }
            top++; // Move down the top boundary

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                answer.add(matrix[i][right]);
            }
            right--; // Move left the right boundary

            // Traverse from right to left along the bottom row (if top still below bottom)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    answer.add(matrix[bottom][i]);
                }
                bottom--; // Move up the bottom boundary
            }

            // Traverse from bottom to top along the left column (if left still before right)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    answer.add(matrix[i][left]);
                }
                left++; // Move right the left boundary
            }
        }

        return answer;
    }
}
