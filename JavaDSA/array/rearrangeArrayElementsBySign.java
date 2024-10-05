package DSA.array;

import java.util.Arrays;

public class rearrangeArrayElementsBySign {
    public static void main(String[] args) {
        // Array Initialization
        int n = 6;
        int[] nums = {1, 2, -4, -5, 3, 4};

        // Call the rearrange function
        rearrangeBySign(nums, n);

        // Print the rearranged array
        System.out.println(Arrays.toString(nums));
    }

    public static void rearrangeBySign(int[] nums, int n) {
        // Create two arrays to store positives and negatives.
        int[] pos = new int[n];
        int[] neg = new int[n];
        int posCount = 0, negCount = 0;

        // Segregate the array into positives and negatives.
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                pos[posCount++] = nums[i];
            else
                neg[negCount++] = nums[i];
        }

        // Handle the case where all elements are positive or negative.
        if (posCount == 0 || negCount == 0) {
            System.out.println("Array cannot be rearranged as all elements are either positive or negative.");
            return;
        }

        // Fill array alternatively until one of the arrays (pos or neg) is exhausted.
        int i = 0, j = 0, index = 0;
        while (i < posCount && j < negCount) {
            nums[index++] = pos[i++];
            nums[index++] = neg[j++];
        }

        // Fill remaining positives, if any.
        while (i < posCount) {
            nums[index++] = pos[i++];
        }

        // Fill remaining negatives, if any.
        while (j < negCount) {
            nums[index++] = neg[j++];
        }
    }
}
