package DSA.array;
import java.util.HashMap;

public class longestSubArrayWithSumK {
    public static int lenOfLongSubarr(int[] arr, int n, int k) {
        // HashMap to store (sum, index) pairs
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        int curr_sum = 0;  // To store cumulative sum
        int max_len = 0;   // To store the length of the longest sub-array

        // Traverse through the array
        for (int i = 0; i < n; i++) {
            // Add current element to cumulative sum
            curr_sum += arr[i];

            // If the cumulative sum is equal to k, update max_len
            if (curr_sum == k) {
                max_len = i + 1;
            }

            // If (curr_sum - k) exists in the map, update max_len
            if (prefixSumMap.containsKey(curr_sum - k)) {
                max_len = Math.max(max_len, i - prefixSumMap.get(curr_sum - k));
            }

            // Store curr_sum in the map if it's not already present
            if (!prefixSumMap.containsKey(curr_sum)) {
                prefixSumMap.put(curr_sum, i);
            }
        }

        return max_len;  // Return the maximum length of the sub-array
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 5, 2, 7, 1, 9};
        int k1 = 15;
        System.out.println(lenOfLongSubarr(arr1, arr1.length, k1));  // Output: 4
    }
}
