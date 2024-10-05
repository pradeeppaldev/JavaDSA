package DSA.array;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        nCr(n - 1, r - 1);   //Type 1
        printPascalRow(n - 1, r - 1);
        printPascalRow1(n , r);
        printPascalTriangle(n);
    }

    public static int nCr(int n, int r) {
// Use symmetry property to reduce the number of iterations
        // C(n, r) is the same as C(n, n - r)
        if (r > n - r) {
            r = n - r; // Reduces the size of 'r' if it's greater than n - r
        }

        int result = 1; // Initialize result to 1

        // Iterate r times to compute the binomial coefficient
        for (int i = 0; i < r; i++) {
            // Multiply result by (n - i) in each step
            result = result * (n - i);  //for Numerator
            // Divide by (i + 1) to avoid large numbers and maintain accuracy
            result = result / (i + 1);  //for Denominator
        }

        // Output the final result, which is C(n, r)
        System.out.println();
        return result;
    }

    public static void printPascalRow(int n, int r) {
        for (r = 0; r <= n; r++) {
            nCr(n, r);
        }
    }

    public static void printPascalRow1(int n, int r) {
        int ans = 1;
        System.out.println(ans);
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            System.out.println(ans);
        }
    }

    public static List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1); //inserting the 1st element

        //calculate the rest of the elements:
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }

    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        //store the entire pascal's triangle:
        for (int row = 1; row <= n; row++) {
            ans.add(generateRow(row));
        }
        return ans;
    }
    public static void printPascalTriangle(int n ){
        n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
